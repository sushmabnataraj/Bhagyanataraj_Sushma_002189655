/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_components;

import Model.BankingInformation;

/**
 *
 * @author sushm
 */
public class ViewSavingAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBankingInfoJPanel
     */
    BankingInformation bankingInformation;
    public ViewSavingAccountJPanel(BankingInformation bankingInformation) {
        initComponents();
        this.bankingInformation = bankingInformation;
        diplaySavBankingInfo();
    }

//    ViewSavingAccountJPanel(BankingInformation savingsAccount) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBankName = new javax.swing.JLabel();
        lblBankRoutingNumber = new javax.swing.JLabel();
        lblBankAccountNumber = new javax.swing.JLabel();
        lblAccountBalance = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        txtBRNum = new javax.swing.JTextField();
        txtAccNum = new javax.swing.JTextField();
        txtAccTyp = new javax.swing.JTextField();
        txtAccBal = new javax.swing.JTextField();
        lblSavingAccount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBankName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankName.setForeground(new java.awt.Color(102, 102, 102));
        lblBankName.setText("Bank Name:");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 63, 118, 20));

        lblBankRoutingNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankRoutingNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblBankRoutingNumber.setText("Bank Routing Number:");
        add(lblBankRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 94, 130, 20));

        lblBankAccountNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankAccountNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblBankAccountNumber.setText("Bank Account Number:");
        add(lblBankAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 132, 140, 20));

        lblAccountBalance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAccountBalance.setForeground(new java.awt.Color(102, 102, 102));
        lblAccountBalance.setText("Account Balance:");
        add(lblAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 163, 118, 20));

        lblAccountType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAccountType.setForeground(new java.awt.Color(102, 102, 102));
        lblAccountType.setText("Account Type:");
        add(lblAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 201, 118, 20));
        add(txtBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 244, -1));
        add(txtBRNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 244, -1));
        add(txtAccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 244, -1));
        add(txtAccTyp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 244, -1));
        add(txtAccBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 244, -1));

        lblSavingAccount.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblSavingAccount.setForeground(new java.awt.Color(0, 153, 153));
        lblSavingAccount.setText("Saving Account");
        add(lblSavingAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 438, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAccountBalance;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblBankRoutingNumber;
    private javax.swing.JLabel lblSavingAccount;
    private javax.swing.JTextField txtAccBal;
    private javax.swing.JTextField txtAccNum;
    private javax.swing.JTextField txtAccTyp;
    private javax.swing.JTextField txtBRNum;
    private javax.swing.JTextField txtBankName;
    // End of variables declaration//GEN-END:variables

    private void diplaySavBankingInfo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        txtBankName.setText(bankingInformation.getBankName());
        txtBRNum.setText(bankingInformation.getBankRountingNum());
        txtAccNum.setText(bankingInformation.getAccNum());
        txtAccBal.setText(bankingInformation.getAccBalance());
        txtAccTyp.setText(bankingInformation.getAccType());
        
    
    }
}
