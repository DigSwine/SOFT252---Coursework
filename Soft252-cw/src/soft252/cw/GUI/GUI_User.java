// @author mwilson-slider
package soft252.cw.GUI;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;

public class GUI_User extends javax.swing.JFrame {
   static Integer ID;

   public static List_Users U = new List_Users();
   public static Lists_AP AP = new Lists_AP();
   private DataHandler Data = new DataHandler();
   
    public GUI_User() {
        initComponents();
    }
    public void GetHandler(DataHandler data, int x){
        Data = data;
        U = Data.getU();
        AP = Data.getAP();
        ID = x;
        
        Btn_Reviw.setEnabled(false);
        Btn_CreatReview.setEnabled(false);
        Txt_DocName.setEnabled(false);
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
        Txt_DocComment = new javax.swing.JTextField();
        Txt_DocReview = new javax.swing.JTextField();
        Btn_Reviw = new javax.swing.JButton();
        Txt_DocName = new javax.swing.JTextField();
        Btn_CreatReview = new javax.swing.JButton();

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
        Btn_ViewHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ViewHisActionPerformed(evt);
            }
        });

        Btn_ViewPer.setText("View Perscription");
        Btn_ViewPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ViewPerActionPerformed(evt);
            }
        });

        Btn_DeleteAccount.setText("Delete Account");
        Btn_DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteAccountActionPerformed(evt);
            }
        });

        Btn_LogOut.setText("Log Out");
        Btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogOutActionPerformed(evt);
            }
        });

        Lst_All.setToolTipText("");
        jScrollPane1.setViewportView(Lst_All);

        Txt_DocComment.setText("- Comment -");

        Txt_DocReview.setText("- Review /5-");

        Btn_Reviw.setText("Submit Review");
        Btn_Reviw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReviwActionPerformed(evt);
            }
        });

        Txt_DocName.setText("- Doctor Name -");

        Btn_CreatReview.setText("Create Review (select from ratings)");
        Btn_CreatReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CreatReviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(778, 778, 778)
                        .addComponent(Btn_DeleteAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_LogOut))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Btn_ReqAppoint)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Btn_ViewDR)
                                                    .addComponent(Btn_ViewHis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Btn_ViewPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Btn_CreatReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Txt_DocComment, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Txt_DocName, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Txt_DocReview, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Btn_Reviw, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Btn_LogOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_ReqAppoint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_ViewDR)
                            .addComponent(Btn_ViewPer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_ViewHis)
                            .addComponent(Btn_CreatReview))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(Btn_DeleteAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_DocReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DocComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Reviw)
                        .addGap(383, 383, 383)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogOutActionPerformed
        OpenHome();
    }//GEN-LAST:event_Btn_LogOutActionPerformed

    private void Btn_ViewDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewDRActionPerformed
        int check = U.ratingList.size();
        int DSize = U.doctorList.size();
        String Names[] = new String[DSize];         
        double rating = 0;
        double have = 0;
        double toadd = 0;
        int added = 0;
        for(int x = 0; x < DSize; x++){
            for(int y = 0; y < check; y++){               
                if(x + 1 == U.ratingList.get(y).getDoctor_ID()){
                    toadd = U.ratingList.get(y).getRating();
                    have = have + toadd;
                    
                    added = added + 1;
                }
                rating = have/added;
                
            }
                Names[x] = U.doctorList.get(x).getDoctor_FirstName() + " " + U.doctorList.get(x).getDoctor_SurName() + "--- Rating = " + rating + " /5";
                have = 0;
                added = 0;
        }
            //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < U.doctorList.size(); x++){
            DLM.addElement(Names[x]);
            }
            Lst_All.setModel(DLM);
            Btn_CreatReview.setEnabled(true);
    }//GEN-LAST:event_Btn_ViewDRActionPerformed

    private void Btn_ReqAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReqAppointActionPerformed
             GUI_UserAppointmentRequest request = new GUI_UserAppointmentRequest();
             request.Onload(Data, ID);
             request.show();
             this.dispose();
    }//GEN-LAST:event_Btn_ReqAppointActionPerformed

    private void Btn_ViewPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewPerActionPerformed
       int lengthofperscriptions = 0;
       lengthofperscriptions = AP.perscriptionList.size();
        String Perscriptions[] = new String[lengthofperscriptions];
        for(int x = 0; x < lengthofperscriptions; x++){
            if(ID.toString().equals(AP.perscriptionList.get(x).getPatient_IDN())){
            Perscriptions[x] = AP.perscriptionList.get(x).getPerscription_Name() + " - Dosage = " + AP.perscriptionList.get(x).getPerscption_Dosage() + " --- Perscribed Quantity = " + AP.perscriptionList.get(x).getPerscription_Quantity();
            }
        }
            //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < AP.perscriptionList.size(); x++){
            DLM.addElement(Perscriptions[x]);
            }
            Lst_All.setModel(DLM);
    }//GEN-LAST:event_Btn_ViewPerActionPerformed

    private void Btn_DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteAccountActionPerformed
       try {
           Delete();
           OpenHome();
       } catch (IOException ex) {
           Logger.getLogger(GUI_User.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_Btn_DeleteAccountActionPerformed

    private void Btn_ViewHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewHisActionPerformed
        Txt_DocComment.setEnabled(false);
        Txt_DocReview.setEnabled(false);
        Btn_Reviw.setEnabled(false);
        Btn_CreatReview.setEnabled(false);


        int APSize = AP.appointmentList.size();
        String Appointments[] = new String[APSize + 1];
        int Doc = 0;
        for(int x = 0; x < APSize; x++){
            if(ID.toString().equals(AP.appointmentList.get(x).getPatient_IDN())){
              Doc = Integer.valueOf(AP.appointmentList.get(x).getDoctor_IDN());
              Appointments[0 + x] = U.doctorList.get(Doc - 1).getDoctor_FirstName() + " " + U.doctorList.get(Doc - 1).getDoctor_SurName()+ " - " + AP.appointmentList.get(x).getAP_Time() + " " + AP.appointmentList.get(x).getAP_Date();
              Appointments = Arrays.copyOf(Appointments, Appointments.length + 1);
            }
        }
         //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Appointments.length; x++){
            DLM.addElement(Appointments[x]);
            }
            Lst_All.setModel(DLM); 
    }//GEN-LAST:event_Btn_ViewHisActionPerformed

    private void Btn_CreatReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CreatReviewActionPerformed
        Txt_DocComment.setEnabled(true);
        Txt_DocReview.setEnabled(true);
        Btn_Reviw.setEnabled(true);
        
        int selectedDoc = Lst_All.getSelectedIndex();
        
        String DocName = U.doctorList.get(selectedDoc).getDoctor_FirstName() + " " + U.doctorList.get(selectedDoc).getDoctor_SurName();
        Txt_DocName.setText(DocName);
    }//GEN-LAST:event_Btn_CreatReviewActionPerformed

    private void Btn_ReviwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReviwActionPerformed
        String tofind = Txt_DocName.getText();
        
        int Did = 0;
        for(int x = 0; x < U.doctorList.size(); x++){
            String FN = U.doctorList.get(x).getDoctor_FirstName();
            String SN = U.doctorList.get(x).getDoctor_SurName();
            
            String Docname = FN + " " + SN;
            
            if(Docname.equals(tofind)){
                Did = x + 1;
            }
        }
        String comment = Txt_DocComment.getText();
        double Rating = Double.valueOf(Txt_DocReview.getText());
        
       try {
           Data.createReview(Did, ID, comment, Rating);
       } catch (IOException ex) {
           Logger.getLogger(GUI_User.class.getName()).log(Level.SEVERE, null, ex);
       }
        reload();
    }//GEN-LAST:event_Btn_ReviwActionPerformed
    
    private void OpenHome(){
        GUI_Home Home = new GUI_Home();
            Home.GetUser(Data);
            Home.show();
            this.dispose();
    }
   
    private void Delete() throws IOException{
        Data.RequestDeletion("P", ID);
        }

    private void reload(){
         GUI_User set = new GUI_User();
        set.GetHandler(Data, ID);
        set.setVisible(true);
        this.dispose();
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
    private javax.swing.JButton Btn_CreatReview;
    private javax.swing.JButton Btn_DeleteAccount;
    private javax.swing.JButton Btn_LogOut;
    private javax.swing.JButton Btn_ReqAppoint;
    private javax.swing.JButton Btn_Reviw;
    private javax.swing.JButton Btn_ViewDR;
    private javax.swing.JButton Btn_ViewHis;
    private javax.swing.JButton Btn_ViewPer;
    private javax.swing.JList<String> Lst_All;
    private javax.swing.JTextField Txt_DocComment;
    private javax.swing.JTextField Txt_DocName;
    private javax.swing.JTextField Txt_DocReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
