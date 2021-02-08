/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_components;

import Model.AddressInformation;
import javax.swing.JOptionPane;
/**
 *
 * @author sushm
 */
public class CreateAddressInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAddressInfoJPanel
     */
    
    AddressInformation addressInformation;
    
    public CreateAddressInfoJPanel(AddressInformation addressInformation) {
        initComponents();
        this.addressInformation = addressInformation;
        
    }

//    CreateAddressInfoJPanel(AddressInformation addressInformation) {
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

        lblStreetAdd = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStreetAdd.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblStreetAdd.setForeground(new java.awt.Color(102, 102, 102));
        lblStreetAdd.setText("Street Address:");
        add(lblStreetAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblCity.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblCity.setForeground(new java.awt.Color(102, 102, 102));
        lblCity.setText("City:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblState.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblState.setForeground(new java.awt.Color(102, 102, 102));
        lblState.setText("State:");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lblZipCode.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblZipCode.setForeground(new java.awt.Color(102, 102, 102));
        lblZipCode.setText("ZipCode:");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, -1));
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, -1));
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Address Info Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
       addressInformation.setCity(txtCity.getText());
       addressInformation.setState(txtState.getText());
       addressInformation.setStreetAddress(txtStreet.getText());
       addressInformation.setZipCode(txtZipCode.getText());
       
       JOptionPane.showMessageDialog(this, "Address Information Saved.");
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetAdd;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}