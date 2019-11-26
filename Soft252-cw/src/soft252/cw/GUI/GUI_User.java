// @author mwilson-slider

package soft252.cw.GUI;

import soft252.cw.GUI.GUI_Home;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class GUI_User extends javax.swing.JFrame {
    
    public GUI_User() {
        initComponents();       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btn_ViewDR = new javax.swing.JButton();
        Btn_ReqAppoint = new javax.swing.JButton();
        Btn_ViewHis = new javax.swing.JButton();
        Btn_ViewPer = new javax.swing.JButton();
        Btn_DeleteAccount = new javax.swing.JButton();
        Btn_LogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_All = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient");

        Btn_ViewDR.setText("View Doctors Ratings");
        Btn_ViewDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ViewDRActionPerformed(evt);
            }
        });

        Btn_ReqAppoint.setText("Request Appointment");
        Btn_ReqAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReqAppointActionPerformed(evt);
            }
        });

        Btn_ViewHis.setText("View History");

        Btn_ViewPer.setText("View Perscription");

        Btn_DeleteAccount.setText("Delete Account");

        Btn_LogOut.setText("Log Out");
        Btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogOutActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Lst_All);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_ReqAppoint)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_ViewDR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_ViewHis)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_ViewPer))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_DeleteAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_LogOut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Btn_LogOut))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ReqAppoint)
                    .addComponent(Btn_ViewDR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ViewHis)
                    .addComponent(Btn_ViewPer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Btn_DeleteAccount)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogOutActionPerformed
        GUI_Home home = new GUI_Home();
        home.show();
        this.hide();    
    }//GEN-LAST:event_Btn_LogOutActionPerformed

    private void Btn_ViewDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewDRActionPerformed
        
        String Names[] = new String[3];   
        
        Names[0] = "Jess";
        Names[1] = "Drew";
        Names[2] = "Bob";
            
            //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < 3; x++){
            DLM.addElement(Names[x]);
            }
            
        Lst_All.setModel(DLM);
    }//GEN-LAST:event_Btn_ViewDRActionPerformed

    private void Btn_ReqAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReqAppointActionPerformed
             GUI_UserAppointmentRequest request = new GUI_UserAppointmentRequest();
             request.show();
    }//GEN-LAST:event_Btn_ReqAppointActionPerformed

   
    
    
    
    
    
    
    
    
    
    
    
    

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
            java.util.logging.Logger.getLogger(GUI_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DeleteAccount;
    private javax.swing.JButton Btn_LogOut;
    private javax.swing.JButton Btn_ReqAppoint;
    private javax.swing.JButton Btn_ViewDR;
    private javax.swing.JButton Btn_ViewHis;
    private javax.swing.JButton Btn_ViewPer;
    private javax.swing.JList<String> Lst_All;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
