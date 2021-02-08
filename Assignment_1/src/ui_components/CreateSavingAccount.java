/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_components;

import Model.BankingInformation;
import javax.swing.JOptionPane;

/**
 *
 * @author sushm
 */
public class CreateSavingAccount extends javax.swing.JPanel {

    /**
     * Creates new form CreateBankingInfoJPanel
     */
    BankingInformation savingsAccount;
    public CreateSavingAccount(BankingInformation savingsAccount) {
        initComponents();
        this.savingsAccount = savingsAccount;
    }

//    CreateSavingAccount(BankingInformation savingsaccount) {
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
        txtBankRoutNum = new javax.swing.JTextField();
        txtAccNum = new javax.swing.JTextField();
        txtAccType = new javax.swing.JTextField();
        txtAccBal = new javax.swing.JTextField();
        lblSavingAccount = new javax.swing.JLabel();
        btnCreateSA = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBankName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankName.setForeground(new java.awt.Color(102, 102, 102));
        lblBankName.setText("Bank Name:");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 63, 118, 20));

        lblBankRoutingNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankRoutingNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblBankRoutingNumber.setText("Bank Routing Number :");
        add(lblBankRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 94, 150, 20));

        lblBankAccountNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankAccountNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblBankAccountNumber.setText("Bank Account Number :");
        add(lblBankAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 132, 150, 20));

        lblAccountBalance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAccountBalance.setForeground(new java.awt.Color(102, 102, 102));
        lblAccountBalance.setText("Account Balance:");
        add(lblAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 163, 118, 20));

        lblAccountType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAccountType.setForeground(new java.awt.Color(102, 102, 102));
        lblAccountType.setText("Account Type :");
        add(lblAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 201, 118, 20));
        add(txtBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 244, -1));
        add(txtBankRoutNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 244, -1));
        add(txtAccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 244, -1));
        add(txtAccType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 244, -1));
        add(txtAccBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 244, -1));

        lblSavingAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSavingAccount.setForeground(new java.awt.Color(0, 153, 153));
        lblSavingAccount.setText("Saving Account");
        add(lblSavingAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 438, -1));

        btnCreateSA.setText("Create");
        btnCreateSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSAActionPerformed(evt);
            }
        });
        add(btnCreateSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 239, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSAActionPerformed
        // TODO add your handling code here:
        savingsAccount.setBankName(txtBankName.getText());
        savingsAccount.setBankRountingNum(txtBankRoutNum.getText());
        savingsAccount.setAccNum(txtAccNum.getText());
        savingsAccount.setAccBalance(txtAccBal.getText());
        savingsAccount.setAccType(txtAccType.getText());
        
        JOptionPane.showMessageDialog(this, "Savings Bank Information Saved.");
    }//GEN-LAST:event_btnCreateSAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateSA;
    private javax.swing.JLabel lblAccountBalance;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblBankRoutingNumber;
    private javax.swing.JLabel lblSavingAccount;
    private javax.swing.JTextField txtAccBal;
    private javax.swing.JTextField txtAccNum;
    private javax.swing.JTextField txtAccType;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtBankRoutNum;
    // End of variables declaration//GEN-END:variables
}
