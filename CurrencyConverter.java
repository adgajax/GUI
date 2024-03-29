/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverterapplication;

import java.awt.Color;

/**
 *
 * @author Ajax
 */
public class CurrencyConverter extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
        initComponents();
        app = new CurrencyConverterApplication();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        fromButtonGroup = new javax.swing.ButtonGroup();
        toButtonGroup = new javax.swing.ButtonGroup();
        USA1 = new javax.swing.JRadioButton();
        CAN1 = new javax.swing.JRadioButton();
        UK1 = new javax.swing.JRadioButton();
        KUW1 = new javax.swing.JRadioButton();
        USA2 = new javax.swing.JRadioButton();
        CAN2 = new javax.swing.JRadioButton();
        UK2 = new javax.swing.JRadioButton();
        KUW2 = new javax.swing.JRadioButton();
        convertBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        resultTextArea = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextArea();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        currencyAppToggleBtn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fromButtonGroup.add(USA1);
        USA1.setText("United States of America");

        fromButtonGroup.add(CAN1);
        CAN1.setText("Canada");

        fromButtonGroup.add(UK1);
        UK1.setText("United Kingdom");

        fromButtonGroup.add(KUW1);
        KUW1.setText("Kuwait");

        toButtonGroup.add(USA2);
        USA2.setText("United States Of America");
        USA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USA2ActionPerformed(evt);
            }
        });

        toButtonGroup.add(CAN2);
        CAN2.setText("Canada");

        toButtonGroup.add(UK2);
        UK2.setText("United Kingdom");

        toButtonGroup.add(KUW2);
        KUW2.setText("Kuwait");

        convertBtn.setText("Convert");
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        resultText.setColumns(20);
        resultText.setRows(5);
        resultTextArea.setViewportView(resultText);

        amountLabel.setText("Enter the amount");

        currencyAppToggleBtn.setText("Convert to Indian Currrency");
        currencyAppToggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyAppToggleBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome to Currency Converter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(USA1)
                                        .addGap(139, 139, 139))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CAN1)
                                        .addGap(221, 221, 221)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(UK1)
                                    .addGap(185, 185, 185)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KUW1)
                                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KUW2)
                                    .addComponent(UK2)
                                    .addComponent(CAN2)
                                    .addComponent(USA2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(amountTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(convertBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(resultTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(currencyAppToggleBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(currencyAppToggleBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USA1)
                    .addComponent(USA2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAN1)
                    .addComponent(CAN2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UK1)
                    .addComponent(UK2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KUW1)
                    .addComponent(KUW2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(resultTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>                        

    private void USA2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(USA1.isSelected()){
            fromCountryCode = 1;
            fromCountryName = "United States of America";
        }
        else if(CAN1.isSelected()){
            fromCountryCode = 2;
            fromCountryName = "Canada";
        }
        else if(UK1.isSelected()){
            fromCountryCode = 3;
            fromCountryName = "United Kingdom";
        }
        else if(KUW1.isSelected()){
            fromCountryCode = 4;
            fromCountryName = "Kuwait";
        }
        if(USA2.isSelected()){
            toCountryCode = 1;
            toCountryName = "United States of America";
        }
        else if(CAN2.isSelected()){
            toCountryCode = 2;
            toCountryName = "Canada";
        }
        else if(UK2.isSelected()){
            toCountryCode = 3;
            toCountryName = "United Kingdom";
        }
        else if(KUW2.isSelected()){
            toCountryCode = 4;
            toCountryName = "Kuwait";
        }
        amountEntered = Double.valueOf(amountTextField.getText());
        if(currencyAppToggleBtn.isSelected()){
            currencyAppToggleBtn.setBackground(Color.red);
            currencyAppToggleBtn.setText("Convert from one country to another");
            output = "From Country Name: \t"+fromCountryName+"\nTo Country Name: \t"+toCountryName+"\nEntered Amount: \t"+amountEntered+"\nConverted Amount: \t"+app.convertFromTo(fromCountryCode,toCountryCode,amountEntered);
            //resultText.setText(output);
        }
        else{
            currencyAppToggleBtn.setBackground(Color.green);
            currencyAppToggleBtn.setText("Convert to Indian Currrency");
            output = "Selected country: \t"+fromCountryName+"\nEntered Amount: \t"+amountEntered+"\nConverted Amount: \t"+app.convert(fromCountryCode, amountEntered);        
         }
        resultText.setText(output);
        
    }                                          

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void currencyAppToggleBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
        if(currencyAppToggleBtn.isSelected()){
            currencyAppToggleBtn.setBackground(Color.red);
            currencyAppToggleBtn.setText("Convert from one country to another");
            USA2.setVisible(true);
            CAN2.setVisible(true);
            UK2.setVisible(true);
            KUW2.setVisible(true);
            
        }
        else{
            currencyAppToggleBtn.setBackground(Color.green);
            currencyAppToggleBtn.setText("Convert to Indian Currrency");
            USA2.setVisible(false);
            CAN2.setVisible(false);
            UK2.setVisible(false);
            KUW2.setVisible(false);
            
        }
    }                                                    

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton CAN1;
    private javax.swing.JRadioButton CAN2;
    private javax.swing.JRadioButton KUW1;
    private javax.swing.JRadioButton KUW2;
    private javax.swing.JRadioButton UK1;
    private javax.swing.JRadioButton UK2;
    private javax.swing.JRadioButton USA1;
    private javax.swing.JRadioButton USA2;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton convertBtn;
    private javax.swing.JToggleButton currencyAppToggleBtn;
    private javax.swing.ButtonGroup fromButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextArea resultText;
    private javax.swing.JScrollPane resultTextArea;
    private javax.swing.ButtonGroup toButtonGroup;
    // End of variables declaration                   
    private CurrencyConverterApplication app;
    private int fromCountryCode;
    private int toCountryCode;
    private String fromCountryName;
    private String toCountryName;
    private double amountEntered;
    private String output;
}
