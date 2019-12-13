// @author mwilson-slider

package soft252.cw.GUI;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.Appointments;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;
import soft252.cw.Classes.Patients;
import soft252.cw.Classes.Perscriptions;


public class GUI_User extends javax.swing.JFrame {
    
   static Integer ID;
    
   public static List_Users U = new List_Users();
   public static Lists_AP AP = new Lists_AP();
   
  
   

   
   
   
   
    public GUI_User() {
        initComponents();   
         Perscriptions Pers1;
         Perscriptions Pers2;
         Perscriptions Pers3;
                                Pers1 = new Perscriptions("0001", "0007", "Epipen", "1", "1");
                                Pers2 = new Perscriptions("2", "0007", "Beclomethasone Nasal", "1", "1");
                                Pers3 = new Perscriptions("3", "0007", "Beclomethasone Nasal", "1", "1");
                                
                                AP.perscriptionList.add(Pers1);
                                AP.perscriptionList.add(Pers2);
                                AP.perscriptionList.add(Pers3);
    }
    
    public static void GetUser(List_Users Users){
        U = Users;
    }
    
    public static void GetUId(Integer x){
        ID = x + 1;
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
        OpenHome();
    }//GEN-LAST:event_Btn_LogOutActionPerformed

    private void Btn_ViewDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewDRActionPerformed
        String Names[] = new String[U.doctorList.size()];         
        for(int x = 0; x < U.doctorList.size(); x++){
            Names[x] = U.doctorList.get(x).getDoctor_FirstName() + " " + U.doctorList.get(x).getDoctor_SurName() + "--- Rating = " + U.doctorList.get(x).getDoctor_Rateing();
        }
            //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < U.doctorList.size(); x++){
            DLM.addElement(Names[x]);
            }
            Lst_All.setModel(DLM);
    }//GEN-LAST:event_Btn_ViewDRActionPerformed

    private void Btn_ReqAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReqAppointActionPerformed
             GUI_UserAppointmentRequest request = new GUI_UserAppointmentRequest();
             request.show();
    }//GEN-LAST:event_Btn_ReqAppointActionPerformed

    private void Btn_ViewPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewPerActionPerformed
       int lengthofperscriptions = 0;
       lengthofperscriptions = AP.perscriptionList.size();
        String Perscriptions[] = new String[lengthofperscriptions];
        for(int x = 0; x < lengthofperscriptions; x++){
                Perscriptions[x] = AP.perscriptionList.get(x).getPerscription_Name() + " - " + AP.perscriptionList.get(x).getPerscption_Dosage() + " --- Perscribed Quantity = " + AP.perscriptionList.get(x).getPerscription_Quantity();
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
    
    private void OpenHome(){
        GUI_Home Home = new GUI_Home();
            Home.GetUser(U);
            Home.show();
            this.dispose();
    }
   
    private void Delete() throws IOException{
        try {
                BufferedReader reader;
                reader = new BufferedReader(new FileReader("Data.txt"));
                
                String line = reader.readLine();
                String LoggedinUser = U.patientList.get(ID - 1).getPatient_Username();
                String LoggedinPass = U.patientList.get(ID - 1).getPatient_Password();
                
                
                String context[] = new String[1];
                int x = 0;
                
                while (line != null) {
                    char a = line.charAt(0);
                    char b = line.charAt(1);
                    String User = "Unknown";
                    String Pass = "Unknown";
                    
                    if(a != 'P'){
                        context[x] = line;
                        x = x + 1;
                        context = Arrays.copyOf(context, context.length + 1);
                        line = reader.readLine();
                        }
                    else if(a == 'P'){
                        if(b == ','){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                    if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    else 
                                    {
                                     times = times + 1;   
                                    }
                                }
                            if(LoggedinUser.equals(User)){
                                if(LoggedinPass.equals(Pass)){
                                    U.patientList.remove(ID - 1);
                                    line = reader.readLine();
                                }
                            }
                            else {
                            context[x] = line;
                            line = reader.readLine();
                        x = x + 1;
                        context = Arrays.copyOf(context, context.length + 1);
                        }
                        }
                        else if(b != ','){
                            line = reader.readLine();
                            context[x] = line;
                        x = x + 1;
                        context = Arrays.copyOf(context, context.length + 1);
                        }
                    }  
                }
                ///////////////////////WRITE FILE HERE //////////////////////////////
                
                
                
                
                
                
                
                
                
                
                
              } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI_User.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GUI_User.class.getName()).log(Level.SEVERE, null, ex);
            }
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
