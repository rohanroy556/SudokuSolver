
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.ml.KNearest;
import org.opencv.ml.Ml;
import org.opencv.utils.Converters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHAN ROY
 */
public class DigitRecognizer {
    private final String resPath = System.getProperty("user.dir")+"/res/";
    private final int numRows = 28;
    private final int numCols = 28;
    private KNearest knn;
    int[] hashMap = new int[10]; 
    private int cvSum(Mat img){
        int i,j,sum=0;
        for(i=0;i<img.rows();i++){
            for(j=0;j<img.cols();j++)
            sum+=img.get(i, j)[0];
        }
        return sum;
    }
    public Mat preprocessImage(Mat img,int n,int m) {
        int rowTop=-1, rowBottom=-1, colLeft=-1, colRight=-1, i, j, y, x;
        Mat temp;
        int center = img.rows()/2;
        Mat mask = new Mat(img.rows()+2, img.cols()+2, CvType.CV_8UC1, new Scalar(0));
        for(i=0;i<img.rows();i++){
            temp = img.row(i);
            if(cvSum(temp)>=(img.rows()-10)*255){               
                for(j=0;j<img.cols();j++){
                    mask.put(i, j, 1);
                    Imgproc.floodFill(img, mask, new Point(j, i), new Scalar(0));
                    mask.put(i, j, 0);
                }
            } 
        }
        for(i=0;i<img.cols();i++){
            temp = img.col(i);
            if(cvSum(temp)>=(img.cols()-10)*255){
                for(j=0;j<img.rows();j++){
                    mask.put(j, i, 1);
                    Imgproc.floodFill(img, mask, new Point(i, j), new Scalar(0));
                    mask.put(j, i, 1);
                }
            }
        }
        for(i=center;i<img.rows();i++) {
            if(rowBottom==-1) {
                temp = img.row(i);
                if(cvSum(temp) == 0 || i==img.rows()-1)
                    rowBottom = i;
            }
            if(rowTop==-1) {
                temp = img.row(img.rows()-i);
                if(cvSum(temp) == 0 || i==img.rows()-1)
                    rowTop = img.rows()-1-i;
            }
            if(colRight==-1) {
                temp = img.col(i);
                if(cvSum(temp) == 0 || i==img.cols()-1)
                    colRight = i;
            }
            if(colLeft==-1) {
                temp = img.col(img.cols()-i);
                if(cvSum(temp) == 0 || i==img.cols()-1)
                    colLeft = img.cols()-1-i;
            }
        }
        Mat newImg = new Mat(img.rows(), img.cols(), CvType.CV_8UC1, new Scalar(0));
        int startAtX = (newImg.cols()/2)-(colRight-colLeft)/2;
        int startAtY = (newImg.rows()/2)-(rowBottom-rowTop)/2;
        for(y=startAtY;y<(newImg.rows()/2)+(rowBottom-rowTop)/2;y++) {
            for(x=startAtX;x<(newImg.cols()/2)+(colRight-colLeft)/2;x++) {
                newImg.put(y,x,img.get(rowTop+(y-startAtY),colLeft+(x-startAtX)));
            }
        }
        Mat cloneImg = new Mat(numRows, numCols, CvType.CV_8UC1);        
        Imgproc.resize(newImg, cloneImg, new Size(numRows,numCols));
        cloneImg = cloneImg.reshape(1, 1);
        return cloneImg;
    }
    public int classify(Mat cell,int n,int m) {
        cell=preprocessImage(cell, n, m);
        if(cvSum(cell)<=20*255)
            return 0;
        cell.convertTo(cell, CvType.CV_32FC1);
        Mat trainData = new Mat();
        ArrayList<Integer> trainLabs = new ArrayList<>();
        int r, c, i;
        int label[]=new int[10];
        Mat temp;
        for(i=1;i<10;i++){
            try {
                label[i]=(int) Files.list(Paths.get(resPath+i+"/")).count();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        for(r=1;r<10;r++){
            for(c=1;c<=label[r];c++){
                temp = Imgcodecs.imread(resPath+r+"/"+c+".png",Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
                temp=temp.reshape(1, 1);
                Core.bitwise_not(temp,temp);
                temp.convertTo(temp, CvType.CV_32FC1);
                trainData.push_back(temp);
                trainLabs.add(r);
            }
            
        }
        knn = KNearest.create();
        knn.train(trainData, Ml.ROW_SAMPLE, Converters.vector_int_to_Mat(trainLabs));
        Mat res=new Mat();
        int p=(int)knn.findNearest(cell, 1, res);
        cell=cell.reshape(1, 28);
        Core.bitwise_not(cell,cell);
        Imgcodecs.imwrite(System.getProperty("user.dir")+"/numbers/"+p+"_"+m+"_"+n+".png",cell);
        return p;
    }
}
