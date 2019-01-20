import com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import java.io.File;
import static java.lang.Math.*;
import javax.swing.JFileChooser;
import org.opencv.core.*;
import static org.opencv.core.Core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHAN ROY
 */
public class ImageSelector extends javax.swing.JFrame {

    /**
     * Creates new form ImageSelector
     */
    private String theOutString;
    private Mat original;
    private Mat undistorted;
    private Mat sudoku;
    private Mat outerBox;
    private Mat lines;
    private Mat undistortedThreshed;
    private Mat kernel;
    private int maxLength;
    private SudokuOutput out = new SudokuOutput();
    private DigitRecognizer template=new DigitRecognizer();
    public ImageSelector() {
        initComponents();        
    }
    public void gridDetection(){
        int max=-1, x, y, area, val, i;
        Point maxPt = new Point(0,0);
        int ker[][]={{0,1,0},{1,1,1},{0,1,0}};
        Mat mask = new Mat(sudoku.rows()+2,sudoku.cols()+2,CvType.CV_8UC1,new Scalar(0));
        Imgproc.GaussianBlur(sudoku, sudoku, new Size(11,11), 0);
        Imgproc.adaptiveThreshold(sudoku, outerBox, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C, Imgproc.THRESH_BINARY, 5, 2);
        bitwise_not(outerBox, outerBox);
        kernel = new Mat( 3, 3, CvType.CV_8UC1 );
        for(x=0;x<3;x++){
            for(y=0;y<3;y++)
                kernel.put(x,y,ker[x][y]);
        }
        Imgproc.dilate(outerBox, outerBox, kernel);
        for(y=0;y<outerBox.size().height;y++) {
            for(x=0;x<outerBox.size().width;x++) {
                val=(int)outerBox.get(y, x)[0];
                if(val>=128) { 
                    mask.put(y, x, 1);
                    area = Imgproc.floodFill(outerBox, mask, new Point(x,y), new Scalar(128));
                    if(area>max) {
                        maxPt = new Point(x,y);
                        max = area;
                    }
                    mask.put(y, x, 0);
                }
            }
        }
        mask.put((int)maxPt.y, (int)maxPt.x, 1);
        Imgproc.floodFill(outerBox, mask, maxPt, new Scalar(255));
        mask.put((int)maxPt.y, (int)maxPt.x, 0);
        for(y=0;y<outerBox.size().height;y++) {
            for(x=0;x<outerBox.size().width;x++) {
                val=(int)outerBox.get(y, x)[0];
                if(val==128 && x!=maxPt.x && y!=maxPt.y){
                    mask.put(y, x, 1);
                    Imgproc.floodFill(outerBox, mask, new Point(x,y), new Scalar(0));
                    mask.put(y, x, 0);
                }
            }
        }
        Imgproc.erode(outerBox, outerBox, kernel);
    }
    public void extremeLines(){
        int i,height,width;
        double leftA,leftB,leftC,rightA,rightB,rightC,topA,topB,topC,bottomA,bottomB,bottomC,detTopLeft,detTopRight,detBottomRight,detBottomLeft;
        double topEdge[] = {1000,1000};    double topYIntercept=100000, topXIntercept=0;     
        double bottomEdge[] = {-1000,-1000};        double bottomYIntercept=0, bottomXIntercept=0;     
        double leftEdge[] = {1000,1000};    double leftXIntercept=100000, leftYIntercept=0;     
        double rightEdge[] = {-1000,-1000};        double rightXIntercept=0, rightYIntercept=0;
        double current[] = new double[2] , p , theta;
        for(i=0;i<lines.height();i++){
            current = lines.get(i, 0);
            p = current[0];
            theta = current[1];
            if(p==0 && theta==-100) continue;
            double xIntercept, yIntercept;         
            xIntercept = p/cos(theta);         
            yIntercept = p/(cos(theta)*sin(theta));
            if(theta>PI*80/180 && theta<PI*100/180) {             
                if(p<topEdge[0])                
                    topEdge = current;             
                if(p>bottomEdge[0])                
                    bottomEdge = current;         
            }
            else if(theta<PI*10/180 || theta>PI*170/180)
            {
                if(xIntercept>rightXIntercept)
                {
                    rightEdge = current;
                    rightXIntercept = xIntercept;
                }
                else if(xIntercept<=leftXIntercept)
                {
                    leftEdge = current;
                    leftXIntercept = xIntercept;
                }
            }
        }
        drawLine(topEdge, sudoku, new Scalar(0));
        drawLine(bottomEdge, sudoku, new Scalar(0));
        drawLine(leftEdge, sudoku, new Scalar(0));
        drawLine(rightEdge, sudoku, new Scalar(0));
        Point left1 = new Point(), left2 = new Point(), right1 = new Point(), right2 = new Point(), bottom1 = new Point(), bottom2 = new Point(), top1 = new Point(), top2 = new Point();
        height=(int) outerBox.size().height;
        width=(int) outerBox.size().width;
        if(leftEdge[1]!=0) {
            left1.x=0;        left1.y=leftEdge[0]/sin(leftEdge[1]);
            left2.x=width;    left2.y=-left2.x/tan(leftEdge[1]) + left1.y;
        }
        else {
            left1.y=0;        left1.x=leftEdge[0]/cos(leftEdge[1]);
            left2.y=height;    left2.x=left1.x - height*tan(leftEdge[1]);

        }
        if(rightEdge[1]!=0) {
            right1.x=0;        right1.y=rightEdge[0]/sin(rightEdge[1]);
            right2.x=width;    right2.y=-right2.x/tan(rightEdge[1]) + right1.y;
        }
        else {
            right1.y=0;        right1.x=rightEdge[0]/cos(rightEdge[1]);
            right2.y=height;    right2.x=right1.x - height*tan(rightEdge[1]);

        }
        bottom1.x=0;    bottom1.y=bottomEdge[0]/sin(bottomEdge[1]);
        bottom2.x=width;bottom2.y=-bottom2.x/tan(bottomEdge[1]) + bottom1.y;
        top1.x=0;        top1.y=topEdge[0]/sin(topEdge[1]);
        top2.x=width;    top2.y=-top2.x/tan(topEdge[1]) + top1.y;
        leftA = left2.y-left1.y;
        leftB = left1.x-left2.x;
        leftC = leftA*left1.x + leftB*left1.y;
        rightA = right2.y-right1.y;
        rightB = right1.x-right2.x;
        rightC = rightA*right1.x + rightB*right1.y;
        topA = top2.y-top1.y;
        topB = top1.x-top2.x;
        topC = topA*top1.x + topB*top1.y;
        bottomA = bottom2.y-bottom1.y;
        bottomB = bottom1.x-bottom2.x;
        bottomC = bottomA*bottom1.x + bottomB*bottom1.y;
        detTopLeft = leftA*topB - leftB*topA;
        Point ptTopLeft = new Point((topB*leftC - leftB*topC)/detTopLeft, (leftA*topC - topA*leftC)/detTopLeft);
        detTopRight = rightA*topB - rightB*topA;
        Point ptTopRight = new Point((topB*rightC-rightB*topC)/detTopRight, (rightA*topC-topA*rightC)/detTopRight);
        detBottomRight = rightA*bottomB - rightB*bottomA;
        Point ptBottomRight = new Point((bottomB*rightC-rightB*bottomC)/detBottomRight, (rightA*bottomC-bottomA*rightC)/detBottomRight);
        detBottomLeft = leftA*bottomB-leftB*bottomA;
        Point ptBottomLeft = new Point((bottomB*leftC-leftB*bottomC)/detBottomLeft, (leftA*bottomC-bottomA*leftC)/detBottomLeft);
        maxLength = (int) ((ptBottomLeft.x-ptBottomRight.x)*(ptBottomLeft.x-ptBottomRight.x) + (ptBottomLeft.y-ptBottomRight.y)*(ptBottomLeft.y-ptBottomRight.y));
        int temp = (int) ((ptTopRight.x-ptBottomRight.x)*(ptTopRight.x-ptBottomRight.x) + (ptTopRight.y-ptBottomRight.y)*(ptTopRight.y-ptBottomRight.y));
        if(temp>maxLength) maxLength = temp;
        temp = (int) ((ptTopRight.x-ptTopLeft.x)*(ptTopRight.x-ptTopLeft.x) + (ptTopRight.y-ptTopLeft.y)*(ptTopRight.y-ptTopLeft.y));
        if(temp>maxLength) maxLength = temp;
        temp = (int) ((ptBottomLeft.x-ptTopLeft.x)*(ptBottomLeft.x-ptTopLeft.x) + (ptBottomLeft.y-ptTopLeft.y)*(ptBottomLeft.y-ptTopLeft.y));
        if(temp>maxLength) maxLength = temp;
        maxLength = (int) sqrt(maxLength);
        Mat src = new Mat(4,2,CvType.CV_32F), dst = new Mat(4,2,CvType.CV_32F);
        double srcpts[][]={{ptTopLeft.x,ptTopLeft.y},{ptTopRight.x,ptTopRight.y},{ptBottomRight.x,ptBottomRight.y},{ptBottomLeft.x,ptBottomLeft.y}};
        double distpts[][]={{0,0},{maxLength-1, 0},{maxLength-1, maxLength-1},{0, maxLength-1}};
        src.put(0,0,srcpts[0]);   dst.put(0,0,distpts[0]);
        src.put(1,0,srcpts[1]);  dst.put(1,0,distpts[1]);      
        src.put(2,0,srcpts[2]);   dst.put(2,0,distpts[2]);
        src.put(3,0,srcpts[3]);    dst.put(3,0,distpts[3]);
        undistorted = new Mat(new Size(maxLength, maxLength), CvType.CV_8UC1);
        Imgproc.warpPerspective(original, undistorted, Imgproc.getPerspectiveTransform(src, dst), new Size(maxLength, maxLength));
    }
    public void drawLine(double line[], Mat fig, Scalar val){
        double m,c;
        if(line[1]==0){
            Imgproc.line(fig, new Point(line[0],0), new Point(line[0], outerBox.size().height), val);
        }
        else{
            m = -1/tan(line[1]);
            c = line[0]/sin(line[1]);
            Imgproc.line(fig, new Point(0, c), new Point(outerBox.size().width, m*outerBox.size().width+c), val);
        }
    }
    public void gridExtraction(){  
        int i;
        lines=new Mat();
        Imgproc.HoughLines(outerBox, lines, 1, PI/180, 200);
        for(i=0;i<lines.height();i++){
            drawLine(lines.get(i, 0), outerBox, new Scalar(128));
        }
        extremeLines();
        
    }
    public void digitRecognition() throws Exception{
        int i,j,x,y;
        int sudokuArray[][]=new int[9][9];
        undistortedThreshed = undistorted.clone();        
        Imgproc.adaptiveThreshold(undistorted, undistortedThreshed, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C, Imgproc.THRESH_BINARY_INV, 101, 1);
        int dist = (int) ceil((double)maxLength/9); 
        Mat currentCell = new Mat(dist, dist, CvType.CV_8UC1);
        for(j=0;j<9;j++) {     
            for(i=0;i<9;i++) {
                for(y=0;y<dist && j*dist+y<undistortedThreshed.cols();y++) {
                    for(x=0;x<dist && i*dist+x<undistortedThreshed.rows();x++) {
                        currentCell.put(y, x, undistortedThreshed.get(j*dist+y, i*dist+x));             
                    }         
                }
                sudokuArray[j][i] = template.classify(currentCell,i,j);             
                System.out.print(sudokuArray[j][i]+" "); 
            }
            System.out.println();
        } 
        System.out.println();
        SimplifySudoku simplify=new SimplifySudoku();
        simplify.createModel(sudokuArray);
        try{
            simplify.solve(0, 0);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }        
        for(j=0;j<9;j++) {     
            for(i=0;i<9;i++) {
                sudokuArray[j][i]=simplify.model[j][i];
                out.assignValue(j+""+i, sudokuArray[j][i]);
                System.out.print(simplify.model[j][i]+" "); 
            }
            System.out.println();
        }  
        out.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browserFrame = new javax.swing.JFileChooser();
        imageLocation = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        showSolution = new javax.swing.JButton();
        showOriginal = new javax.swing.JButton();

        browserFrame.setAcceptAllFileFilterUsed(false);
        browserFrame.setFileFilter(new ImageFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sudoku Solver");
        setMinimumSize(new java.awt.Dimension(380, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLocation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        imageLocation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        imageLocation.setName(""); // NOI18N
        getContentPane().add(imageLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 220, -1));

        browseButton.setText("...");
        browseButton.setMargin(new java.awt.Insets(0, 2, 2, 2));
        browseButton.setName(""); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(browseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        showSolution.setText("Solve");
        showSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSolutionActionPerformed(evt);
            }
        });
        getContentPane().add(showSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        showOriginal.setText("Show Original");
        showOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOriginalActionPerformed(evt);
            }
        });
        getContentPane().add(showOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // TODO add your handling code here:
        if (this.theOutString != null)
            this.browserFrame.setCurrentDirectory(new File(this.theOutString));
        int returnVal = browserFrame.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = browserFrame.getSelectedFile();
            this.theOutString = this.browserFrame.getSelectedFile().getPath();
            imageLocation.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void showSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSolutionActionPerformed
        // TODO add your handling code here: 
        try{
            String opencvpath = "C:\\opencv\\build\\java\\x64\\";
            System.load(opencvpath+Core.NATIVE_LIBRARY_NAME+".dll"); 
            String loc=imageLocation.getText();
            if(loc==null||loc.equals("")){
                imageLocation.setText("Enter Location!");
                throw new Exception( "Solution found" ) ;
            }
            original=Imgcodecs.imread(loc,Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
            sudoku=original.clone();
            outerBox = new Mat(sudoku.size(), CvType.CV_8UC1);
            gridDetection();
            gridExtraction();
            digitRecognition();
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_showSolutionActionPerformed

    private void showOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOriginalActionPerformed
        // TODO add your handling code here:
        try{
            String opencvpath = "C:\\opencv\\build\\java\\x64\\";
            System.load(opencvpath+Core.NATIVE_LIBRARY_NAME+".dll"); 
            String loc=imageLocation.getText();
            if(loc==null||loc.equals("")){
                imageLocation.setText("Enter Location!");
                throw new Exception( "Solution found" ) ;
            }
            IplImage output=cvLoadImage(loc);
            cvShowImage("Original",output);
            cvWaitKey(0);
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_showOriginalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JFileChooser browserFrame;
    private javax.swing.JTextField imageLocation;
    private javax.swing.JButton showOriginal;
    private javax.swing.JButton showSolution;
    // End of variables declaration//GEN-END:variables

}