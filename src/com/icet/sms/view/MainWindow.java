/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icet.sms.view;

/**
 *
 * @author nirot
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainLabel = new javax.swing.JLabel();
        addStudentButton = new javax.swing.JButton();
        updateStudentButton = new javax.swing.JButton();
        viewStudentlistButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setName("Mainframe"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        MainLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLabel.setText("Student Management System");
        getContentPane().add(MainLabel);
        MainLabel.setBounds(560, 50, 620, 90);

        addStudentButton.setBackground(new java.awt.Color(204, 204, 255));
        addStudentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentButton);
        addStudentButton.setBounds(630, 160, 478, 60);

        updateStudentButton.setBackground(new java.awt.Color(204, 204, 255));
        updateStudentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateStudentButton.setText("Update Student");
        updateStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudentButton);
        updateStudentButton.setBounds(630, 230, 478, 60);

        viewStudentlistButton.setBackground(new java.awt.Color(204, 204, 255));
        viewStudentlistButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewStudentlistButton.setText("View Student List");
        viewStudentlistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentlistButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewStudentlistButton);
        viewStudentlistButton.setBounds(630, 300, 478, 60);

        deleteButton.setBackground(new java.awt.Color(204, 204, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("Delete Student");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(630, 440, 478, 60);

        searchButton.setBackground(new java.awt.Color(204, 204, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setText("Search Student");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(630, 370, 478, 60);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icet/sms/view/student 555 hori.png"))); // NOI18N
        BackgroundLabel.setText("jLabel2");
        BackgroundLabel.setMaximumSize(new java.awt.Dimension(1280, 555));
        BackgroundLabel.setMinimumSize(new java.awt.Dimension(1200, 555));
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, -10, 1210, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        new AddStudentForm().setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void viewStudentlistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentlistButtonActionPerformed
        new ViewStudentForm().setVisible(true);
    }//GEN-LAST:event_viewStudentlistButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        new DeleteStudentForm().setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        new searchStudentForm().setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentButtonActionPerformed
        new UpdateStudentForm().setVisible(true);
    }//GEN-LAST:event_updateStudentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateStudentButton;
    private javax.swing.JButton viewStudentlistButton;
    // End of variables declaration//GEN-END:variables
}
