// @author mwilson-slider
package soft252.cw.GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import soft252.cw.Classes.DataHandler;

public class GUI_NewPatient extends javax.swing.JFrame {

    public GUI_NewPatient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Request = new javax.swing.JButton();
        Txt_Firstname = new javax.swing.JTextField();
        Txt_Surname = new javax.swing.JTextField();
        Txt_Age = new javax.swing.JTextField();
        Txt_Gender = new javax.swing.JTextField();
        Txt_Num = new javax.swing.JTextField();
        Txt_StreetName = new javax.swing.JTextField();
        Txt_City = new javax.swing.JTextField();
        Txt_PostCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Btn_logout = new javax.swing.JButton();
        Txt_User = new javax.swing.JTextField();
        Txt_Pass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Request.setText("Request Account");
        Btn_Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RequestActionPerformed(evt);
            }
        });

        Txt_Firstname.setText("- Firstname -");

        Txt_Surname.setText("- Surname -");

        Txt_Age.setText("- Age -");

        Txt_Gender.setText("- (Birth) Gender -");

        Txt_Num.setText("- Address Line 1 -");

        Txt_StreetName.setText("- Street Name-");

        Txt_City.setText("- Address City -");

        Txt_PostCode.setText("- Post Code- ");
        Txt_PostCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PostCodeActionPerformed(evt);
            }
        });

        jLabel1.setText("New Patient Request Form");

        Btn_logout.setText("Cancel");
        Btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_logoutActionPerformed(evt);
            }
        });

        Txt_User.setText("- Username -");

        Txt_Pass.setText("- Password -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Num)
                            .addComponent(Txt_Firstname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_Surname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_StreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_User)
                            .addComponent(Txt_Pass))
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Request)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Btn_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Request, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_StreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DataHandler Data = new DataHandler();
    
    
    private void Btn_RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RequestActionPerformed
        String FName = Txt_Firstname.getText();
        String SName = Txt_Surname.getText();
        String Age = Txt_Age.getText();
        String Gender = Txt_Gender.getText();
        String StreetNum = Txt_Num.getText();
        String StreetName = Txt_StreetName.getText();
        String City = Txt_City.getText();
        String postcode = Txt_PostCode.getText();
        String User = Txt_User.getText();
        String Pass = Txt_Pass.getText();
        
        try {
            Data.requestNewPat("R", FName, SName, Gender, Age, StreetNum, StreetName, City, postcode, User, Pass);
        } catch (IOException ex) {
            Logger.getLogger(GUI_NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        logout();
    }//GEN-LAST:event_Btn_RequestActionPerformed
    private void Btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_logoutActionPerformed
        logout();
    }//GEN-LAST:event_Btn_logoutActionPerformed
    private void Txt_PostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PostCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_PostCodeActionPerformed
    private void logout(){
        GUI_Home home = new GUI_Home();
        home.GetUser(Data);
        home.setVisible(true);
        this.dispose();
    }
    public void getData(DataHandler data){
        Data = data;
    }

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
            java.util.logging.Logger.getLogger(GUI_NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_NewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Request;
    private javax.swing.JButton Btn_logout;
    private javax.swing.JTextField Txt_Age;
    private javax.swing.JTextField Txt_City;
    private javax.swing.JTextField Txt_Firstname;
    private javax.swing.JTextField Txt_Gender;
    private javax.swing.JTextField Txt_Num;
    private javax.swing.JTextField Txt_Pass;
    private javax.swing.JTextField Txt_PostCode;
    private javax.swing.JTextField Txt_StreetName;
    private javax.swing.JTextField Txt_Surname;
    private javax.swing.JTextField Txt_User;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
