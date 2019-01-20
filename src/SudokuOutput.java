/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHAN ROY
 */
public class SudokuOutput extends javax.swing.JFrame {

    /**
     * Creates new form SudokuOutput
     */
    public SudokuOutput() {
        initComponents();
    }
    
    public void assignValue(String pos, int n){
        switch(pos){
            case "00":
                field00.setText(Integer.toString(n));
                break;
            case "01":
                field01.setText(Integer.toString(n));
                break;
            case "02":
                field02.setText(Integer.toString(n));
                break;
            case "03":
                field03.setText(Integer.toString(n));
                break;
            case "04":
                field04.setText(Integer.toString(n));
                break;
            case "05":
                field05.setText(Integer.toString(n));
                break;
            case "06":
                field06.setText(Integer.toString(n));
                break;
            case "07":
                field07.setText(Integer.toString(n));
                break;
            case "08":
                field08.setText(Integer.toString(n));
                break;
            case "10":
                field10.setText(Integer.toString(n));
                break;
            case "11":
                field11.setText(Integer.toString(n));
                break;
            case "12":
                field12.setText(Integer.toString(n));
                break;
            case "13":
                field13.setText(Integer.toString(n));
                break;
            case "14":
                field14.setText(Integer.toString(n));
                break;
            case "15":
                field15.setText(Integer.toString(n));
                break;
            case "16":
                field16.setText(Integer.toString(n));
                break;
            case "17":
                field17.setText(Integer.toString(n));
                break;
            case "18":
                field18.setText(Integer.toString(n));
                break;
            case "20":
                field20.setText(Integer.toString(n));
                break;
            case "21":
                field21.setText(Integer.toString(n));
                break;                
            case "22":
                field22.setText(Integer.toString(n));
                break;
            case "23":
                field23.setText(Integer.toString(n));
                break;
            case "24":
                field24.setText(Integer.toString(n));
                break;
            case "25":
                field25.setText(Integer.toString(n));
                break;
            case "26":
                field26.setText(Integer.toString(n));
                break;
            case "27":
                field27.setText(Integer.toString(n));
                break;
            case "28":
                field28.setText(Integer.toString(n));
                break;
            case "30":
                field30.setText(Integer.toString(n));
                break;
            case "31":
                field31.setText(Integer.toString(n));
                break;
            case "32":
                field32.setText(Integer.toString(n));
                break;
            case "33":
                field33.setText(Integer.toString(n));
                break;
            case "34":
                field34.setText(Integer.toString(n));
                break;
            case "35":
                field35.setText(Integer.toString(n));
                break;
            case "36":
                field36.setText(Integer.toString(n));
                break;
            case "37":
                field37.setText(Integer.toString(n));
                break;
            case "38":
                field38.setText(Integer.toString(n));
                break;
            case "40":
                field40.setText(Integer.toString(n));
                break;
            case "41":
                field41.setText(Integer.toString(n));
                break;
            case "42":
                field42.setText(Integer.toString(n));
                break;
            case "43":
                field43.setText(Integer.toString(n));
                break;
            case "44":
                field44.setText(Integer.toString(n));
                break;
            case "45":
                field45.setText(Integer.toString(n));
                break;
            case "46":
                field46.setText(Integer.toString(n));
                break;
            case "47":
                field47.setText(Integer.toString(n));
                break;
            case "48":
                field48.setText(Integer.toString(n));
                break;
            case "50":
                field50.setText(Integer.toString(n));
                break;
            case "51":
                field51.setText(Integer.toString(n));
                break;
            case "52":
                field52.setText(Integer.toString(n));
                break;
            case "53":
                field53.setText(Integer.toString(n));
                break;
            case "54":
                field54.setText(Integer.toString(n));
                break;
            case "55":
                field55.setText(Integer.toString(n));
                break;
            case "56":
                field56.setText(Integer.toString(n));
                break;
            case "57":
                field57.setText(Integer.toString(n));
                break;
            case "58":
                field58.setText(Integer.toString(n));
                break;
            case "60":
                field60.setText(Integer.toString(n));
                break;
            case "61":
                field61.setText(Integer.toString(n));
                break;
            case "62":
                field62.setText(Integer.toString(n));
                break;
            case "63":
                field63.setText(Integer.toString(n));
                break;
            case "64":
                field64.setText(Integer.toString(n));
                break;
            case "65":
                field65.setText(Integer.toString(n));
                break;
            case "66":
                field66.setText(Integer.toString(n));
                break;
            case "67":
                field67.setText(Integer.toString(n));
                break;
            case "68":
                field68.setText(Integer.toString(n));
                break;
            case "70":
                field70.setText(Integer.toString(n));
                break;
            case "71":
                field71.setText(Integer.toString(n));
                break;
            case "72":
                field72.setText(Integer.toString(n));
                break;
            case "73":
                field73.setText(Integer.toString(n));
                break;
            case "74":
                field74.setText(Integer.toString(n));
                break;
            case "75":
                field75.setText(Integer.toString(n));
                break;
            case "76":
                field76.setText(Integer.toString(n));
                break;
            case "77":
                field77.setText(Integer.toString(n));
                break;
            case "78":
                field78.setText(Integer.toString(n));
                break;
            case "80":
                field80.setText(Integer.toString(n));
                break;
            case "81":
                field81.setText(Integer.toString(n));
                break;
            case "82":
                field82.setText(Integer.toString(n));
                break;
            case "83":
                field83.setText(Integer.toString(n));
                break;
            case "84":
                field84.setText(Integer.toString(n));
                break;
            case "85":
                field85.setText(Integer.toString(n));
                break;
            case "86":
                field86.setText(Integer.toString(n));
                break;
            case "87":
                field87.setText(Integer.toString(n));
                break;
            case "88":
                field88.setText(Integer.toString(n));
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field00 = new javax.swing.JTextField();
        field01 = new javax.swing.JTextField();
        field02 = new javax.swing.JTextField();
        field03 = new javax.swing.JTextField();
        field04 = new javax.swing.JTextField();
        field05 = new javax.swing.JTextField();
        field06 = new javax.swing.JTextField();
        field07 = new javax.swing.JTextField();
        field08 = new javax.swing.JTextField();
        field10 = new javax.swing.JTextField();
        field11 = new javax.swing.JTextField();
        field12 = new javax.swing.JTextField();
        field13 = new javax.swing.JTextField();
        field14 = new javax.swing.JTextField();
        field15 = new javax.swing.JTextField();
        field16 = new javax.swing.JTextField();
        field17 = new javax.swing.JTextField();
        field18 = new javax.swing.JTextField();
        field20 = new javax.swing.JTextField();
        field21 = new javax.swing.JTextField();
        field22 = new javax.swing.JTextField();
        field23 = new javax.swing.JTextField();
        field24 = new javax.swing.JTextField();
        field25 = new javax.swing.JTextField();
        field26 = new javax.swing.JTextField();
        field27 = new javax.swing.JTextField();
        field28 = new javax.swing.JTextField();
        field30 = new javax.swing.JTextField();
        field31 = new javax.swing.JTextField();
        field32 = new javax.swing.JTextField();
        field33 = new javax.swing.JTextField();
        field34 = new javax.swing.JTextField();
        field35 = new javax.swing.JTextField();
        field36 = new javax.swing.JTextField();
        field37 = new javax.swing.JTextField();
        field38 = new javax.swing.JTextField();
        field40 = new javax.swing.JTextField();
        field41 = new javax.swing.JTextField();
        field42 = new javax.swing.JTextField();
        field43 = new javax.swing.JTextField();
        field44 = new javax.swing.JTextField();
        field45 = new javax.swing.JTextField();
        field46 = new javax.swing.JTextField();
        field47 = new javax.swing.JTextField();
        field48 = new javax.swing.JTextField();
        field50 = new javax.swing.JTextField();
        field51 = new javax.swing.JTextField();
        field52 = new javax.swing.JTextField();
        field53 = new javax.swing.JTextField();
        field54 = new javax.swing.JTextField();
        field55 = new javax.swing.JTextField();
        field56 = new javax.swing.JTextField();
        field57 = new javax.swing.JTextField();
        field58 = new javax.swing.JTextField();
        field60 = new javax.swing.JTextField();
        field61 = new javax.swing.JTextField();
        field62 = new javax.swing.JTextField();
        field63 = new javax.swing.JTextField();
        field64 = new javax.swing.JTextField();
        field65 = new javax.swing.JTextField();
        field66 = new javax.swing.JTextField();
        field67 = new javax.swing.JTextField();
        field68 = new javax.swing.JTextField();
        field70 = new javax.swing.JTextField();
        field71 = new javax.swing.JTextField();
        field72 = new javax.swing.JTextField();
        field73 = new javax.swing.JTextField();
        field74 = new javax.swing.JTextField();
        field75 = new javax.swing.JTextField();
        field76 = new javax.swing.JTextField();
        field77 = new javax.swing.JTextField();
        field78 = new javax.swing.JTextField();
        field80 = new javax.swing.JTextField();
        field81 = new javax.swing.JTextField();
        field82 = new javax.swing.JTextField();
        field83 = new javax.swing.JTextField();
        field84 = new javax.swing.JTextField();
        field85 = new javax.swing.JTextField();
        field86 = new javax.swing.JTextField();
        field87 = new javax.swing.JTextField();
        field88 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 360));
        setMinimumSize(new java.awt.Dimension(360, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field00.setEditable(false);
        field00.setBackground(new java.awt.Color(255, 255, 255));
        field00.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field00, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        field01.setEditable(false);
        field01.setBackground(new java.awt.Color(255, 255, 255));
        field01.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field01, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 40));

        field02.setEditable(false);
        field02.setBackground(new java.awt.Color(255, 255, 255));
        field02.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field02, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

        field03.setEditable(false);
        field03.setBackground(new java.awt.Color(255, 255, 255));
        field03.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field03, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 40, 40));

        field04.setEditable(false);
        field04.setBackground(new java.awt.Color(255, 255, 255));
        field04.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field04, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 40, 40));

        field05.setEditable(false);
        field05.setBackground(new java.awt.Color(255, 255, 255));
        field05.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field05, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 40, 40));

        field06.setEditable(false);
        field06.setBackground(new java.awt.Color(255, 255, 255));
        field06.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field06, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 40, 40));

        field07.setEditable(false);
        field07.setBackground(new java.awt.Color(255, 255, 255));
        field07.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field07, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 40));

        field08.setEditable(false);
        field08.setBackground(new java.awt.Color(255, 255, 255));
        field08.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field08, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        field10.setEditable(false);
        field10.setBackground(new java.awt.Color(255, 255, 255));
        field10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, 40));

        field11.setEditable(false);
        field11.setBackground(new java.awt.Color(255, 255, 255));
        field11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 40));

        field12.setEditable(false);
        field12.setBackground(new java.awt.Color(255, 255, 255));
        field12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 40));

        field13.setEditable(false);
        field13.setBackground(new java.awt.Color(255, 255, 255));
        field13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 40, 40));

        field14.setEditable(false);
        field14.setBackground(new java.awt.Color(255, 255, 255));
        field14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 40, 40));

        field15.setEditable(false);
        field15.setBackground(new java.awt.Color(255, 255, 255));
        field15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 40, 40));

        field16.setEditable(false);
        field16.setBackground(new java.awt.Color(255, 255, 255));
        field16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 40, 40));

        field17.setEditable(false);
        field17.setBackground(new java.awt.Color(255, 255, 255));
        field17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 40, 40));

        field18.setEditable(false);
        field18.setBackground(new java.awt.Color(255, 255, 255));
        field18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 40, 40));

        field20.setEditable(false);
        field20.setBackground(new java.awt.Color(255, 255, 255));
        field20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 40, 40));

        field21.setEditable(false);
        field21.setBackground(new java.awt.Color(255, 255, 255));
        field21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 40, 40));

        field22.setEditable(false);
        field22.setBackground(new java.awt.Color(255, 255, 255));
        field22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 40, 40));

        field23.setEditable(false);
        field23.setBackground(new java.awt.Color(255, 255, 255));
        field23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, 40));

        field24.setEditable(false);
        field24.setBackground(new java.awt.Color(255, 255, 255));
        field24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, 40));

        field25.setEditable(false);
        field25.setBackground(new java.awt.Color(255, 255, 255));
        field25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 40, 40));

        field26.setEditable(false);
        field26.setBackground(new java.awt.Color(255, 255, 255));
        field26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 40, 40));

        field27.setEditable(false);
        field27.setBackground(new java.awt.Color(255, 255, 255));
        field27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 40, 40));

        field28.setEditable(false);
        field28.setBackground(new java.awt.Color(255, 255, 255));
        field28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 40, 40));

        field30.setEditable(false);
        field30.setBackground(new java.awt.Color(255, 255, 255));
        field30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 40, 40));

        field31.setEditable(false);
        field31.setBackground(new java.awt.Color(255, 255, 255));
        field31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 40, 40));

        field32.setEditable(false);
        field32.setBackground(new java.awt.Color(255, 255, 255));
        field32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 40, 40));

        field33.setEditable(false);
        field33.setBackground(new java.awt.Color(255, 255, 255));
        field33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, 40));

        field34.setEditable(false);
        field34.setBackground(new java.awt.Color(255, 255, 255));
        field34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 40, 40));

        field35.setEditable(false);
        field35.setBackground(new java.awt.Color(255, 255, 255));
        field35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 40, 40));

        field36.setEditable(false);
        field36.setBackground(new java.awt.Color(255, 255, 255));
        field36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 40, 40));

        field37.setEditable(false);
        field37.setBackground(new java.awt.Color(255, 255, 255));
        field37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 40, 40));

        field38.setEditable(false);
        field38.setBackground(new java.awt.Color(255, 255, 255));
        field38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field38, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 40, 40));

        field40.setEditable(false);
        field40.setBackground(new java.awt.Color(255, 255, 255));
        field40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 40, 40));

        field41.setEditable(false);
        field41.setBackground(new java.awt.Color(255, 255, 255));
        field41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 40, 40));

        field42.setEditable(false);
        field42.setBackground(new java.awt.Color(255, 255, 255));
        field42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 40, 40));

        field43.setEditable(false);
        field43.setBackground(new java.awt.Color(255, 255, 255));
        field43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 40));

        field44.setEditable(false);
        field44.setBackground(new java.awt.Color(255, 255, 255));
        field44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field44, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 40, 40));

        field45.setEditable(false);
        field45.setBackground(new java.awt.Color(255, 255, 255));
        field45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 40, 40));

        field46.setEditable(false);
        field46.setBackground(new java.awt.Color(255, 255, 255));
        field46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field46, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 40, 40));

        field47.setEditable(false);
        field47.setBackground(new java.awt.Color(255, 255, 255));
        field47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, 40));

        field48.setEditable(false);
        field48.setBackground(new java.awt.Color(255, 255, 255));
        field48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 40, 40));

        field50.setEditable(false);
        field50.setBackground(new java.awt.Color(255, 255, 255));
        field50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 40, 40));

        field51.setEditable(false);
        field51.setBackground(new java.awt.Color(255, 255, 255));
        field51.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 40));

        field52.setEditable(false);
        field52.setBackground(new java.awt.Color(255, 255, 255));
        field52.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 40));

        field53.setEditable(false);
        field53.setBackground(new java.awt.Color(255, 255, 255));
        field53.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field53, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 40, 40));

        field54.setEditable(false);
        field54.setBackground(new java.awt.Color(255, 255, 255));
        field54.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field54, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 40, 40));

        field55.setEditable(false);
        field55.setBackground(new java.awt.Color(255, 255, 255));
        field55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 40, 40));

        field56.setEditable(false);
        field56.setBackground(new java.awt.Color(255, 255, 255));
        field56.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 40, 40));

        field57.setEditable(false);
        field57.setBackground(new java.awt.Color(255, 255, 255));
        field57.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field57, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 40, 40));

        field58.setEditable(false);
        field58.setBackground(new java.awt.Color(255, 255, 255));
        field58.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field58, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 40, 40));

        field60.setEditable(false);
        field60.setBackground(new java.awt.Color(255, 255, 255));
        field60.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 40, 40));

        field61.setEditable(false);
        field61.setBackground(new java.awt.Color(255, 255, 255));
        field61.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field61, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 40, 40));

        field62.setEditable(false);
        field62.setBackground(new java.awt.Color(255, 255, 255));
        field62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, 40));

        field63.setEditable(false);
        field63.setBackground(new java.awt.Color(255, 255, 255));
        field63.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field63, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 40, 40));

        field64.setEditable(false);
        field64.setBackground(new java.awt.Color(255, 255, 255));
        field64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field64, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, 40));

        field65.setEditable(false);
        field65.setBackground(new java.awt.Color(255, 255, 255));
        field65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field65, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, 40));

        field66.setEditable(false);
        field66.setBackground(new java.awt.Color(255, 255, 255));
        field66.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field66, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, 40));

        field67.setEditable(false);
        field67.setBackground(new java.awt.Color(255, 255, 255));
        field67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field67, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 40, 40));

        field68.setEditable(false);
        field68.setBackground(new java.awt.Color(255, 255, 255));
        field68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field68, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 40, 40));

        field70.setEditable(false);
        field70.setBackground(new java.awt.Color(255, 255, 255));
        field70.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, 40));

        field71.setEditable(false);
        field71.setBackground(new java.awt.Color(255, 255, 255));
        field71.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 40, 40));

        field72.setEditable(false);
        field72.setBackground(new java.awt.Color(255, 255, 255));
        field72.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field72, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 40, 40));

        field73.setEditable(false);
        field73.setBackground(new java.awt.Color(255, 255, 255));
        field73.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field73, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 40, 40));

        field74.setEditable(false);
        field74.setBackground(new java.awt.Color(255, 255, 255));
        field74.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field74, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 40, 40));

        field75.setEditable(false);
        field75.setBackground(new java.awt.Color(255, 255, 255));
        field75.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field75, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 40, 40));

        field76.setEditable(false);
        field76.setBackground(new java.awt.Color(255, 255, 255));
        field76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field76, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 40, 40));

        field77.setEditable(false);
        field77.setBackground(new java.awt.Color(255, 255, 255));
        field77.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field77, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 40, 40));

        field78.setEditable(false);
        field78.setBackground(new java.awt.Color(255, 255, 255));
        field78.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field78, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

        field80.setEditable(false);
        field80.setBackground(new java.awt.Color(255, 255, 255));
        field80.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 40, 40));

        field81.setEditable(false);
        field81.setBackground(new java.awt.Color(255, 255, 255));
        field81.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 40, 40));

        field82.setEditable(false);
        field82.setBackground(new java.awt.Color(255, 255, 255));
        field82.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 40, 40));

        field83.setEditable(false);
        field83.setBackground(new java.awt.Color(255, 255, 255));
        field83.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field83, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 40, 40));

        field84.setEditable(false);
        field84.setBackground(new java.awt.Color(255, 255, 255));
        field84.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field84, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 40, 40));

        field85.setEditable(false);
        field85.setBackground(new java.awt.Color(255, 255, 255));
        field85.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field85.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field85, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 40, 40));

        field86.setEditable(false);
        field86.setBackground(new java.awt.Color(255, 255, 255));
        field86.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field86.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field86, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 40, 40));

        field87.setEditable(false);
        field87.setBackground(new java.awt.Color(255, 255, 255));
        field87.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field87.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field87, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 40, 40));

        field88.setEditable(false);
        field88.setBackground(new java.awt.Color(255, 255, 255));
        field88.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(field88, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuOutput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field00;
    private javax.swing.JTextField field01;
    private javax.swing.JTextField field02;
    private javax.swing.JTextField field03;
    private javax.swing.JTextField field04;
    private javax.swing.JTextField field05;
    private javax.swing.JTextField field06;
    private javax.swing.JTextField field07;
    private javax.swing.JTextField field08;
    private javax.swing.JTextField field10;
    private javax.swing.JTextField field11;
    private javax.swing.JTextField field12;
    private javax.swing.JTextField field13;
    private javax.swing.JTextField field14;
    private javax.swing.JTextField field15;
    private javax.swing.JTextField field16;
    private javax.swing.JTextField field17;
    private javax.swing.JTextField field18;
    private javax.swing.JTextField field20;
    private javax.swing.JTextField field21;
    private javax.swing.JTextField field22;
    private javax.swing.JTextField field23;
    private javax.swing.JTextField field24;
    private javax.swing.JTextField field25;
    private javax.swing.JTextField field26;
    private javax.swing.JTextField field27;
    private javax.swing.JTextField field28;
    private javax.swing.JTextField field30;
    private javax.swing.JTextField field31;
    private javax.swing.JTextField field32;
    private javax.swing.JTextField field33;
    private javax.swing.JTextField field34;
    private javax.swing.JTextField field35;
    private javax.swing.JTextField field36;
    private javax.swing.JTextField field37;
    private javax.swing.JTextField field38;
    private javax.swing.JTextField field40;
    private javax.swing.JTextField field41;
    private javax.swing.JTextField field42;
    private javax.swing.JTextField field43;
    private javax.swing.JTextField field44;
    private javax.swing.JTextField field45;
    private javax.swing.JTextField field46;
    private javax.swing.JTextField field47;
    private javax.swing.JTextField field48;
    private javax.swing.JTextField field50;
    private javax.swing.JTextField field51;
    private javax.swing.JTextField field52;
    private javax.swing.JTextField field53;
    private javax.swing.JTextField field54;
    private javax.swing.JTextField field55;
    private javax.swing.JTextField field56;
    private javax.swing.JTextField field57;
    private javax.swing.JTextField field58;
    private javax.swing.JTextField field60;
    private javax.swing.JTextField field61;
    private javax.swing.JTextField field62;
    private javax.swing.JTextField field63;
    private javax.swing.JTextField field64;
    private javax.swing.JTextField field65;
    private javax.swing.JTextField field66;
    private javax.swing.JTextField field67;
    private javax.swing.JTextField field68;
    private javax.swing.JTextField field70;
    private javax.swing.JTextField field71;
    private javax.swing.JTextField field72;
    private javax.swing.JTextField field73;
    private javax.swing.JTextField field74;
    private javax.swing.JTextField field75;
    private javax.swing.JTextField field76;
    private javax.swing.JTextField field77;
    private javax.swing.JTextField field78;
    private javax.swing.JTextField field80;
    private javax.swing.JTextField field81;
    private javax.swing.JTextField field82;
    private javax.swing.JTextField field83;
    private javax.swing.JTextField field84;
    private javax.swing.JTextField field85;
    private javax.swing.JTextField field86;
    private javax.swing.JTextField field87;
    private javax.swing.JTextField field88;
    // End of variables declaration//GEN-END:variables
}
