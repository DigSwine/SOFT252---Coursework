//@author mwilson-slider

package soft252.cw.GUI;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;

public class GUI_Doctor extends javax.swing.JFrame {
    public GUI_Doctor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_Appts = new javax.swing.JList<>();
        Btn_ViewAppt = new javax.swing.JButton();
        Btn_Notes = new javax.swing.JButton();
        Btn_InspectPatient = new javax.swing.JButton();
        Btn_CreatePerscription = new javax.swing.JButton();
        Btn_RequestMeds = new javax.swing.JButton();
        Btn_CreateAppt = new javax.swing.JButton();
        Btn_Save = new javax.swing.JButton();
        Btn_Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Doctor");

        jScrollPane1.setViewportView(Lst_Appts);

        Btn_ViewAppt.setText("View Appointments");
        Btn_ViewAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ViewApptActionPerformed(evt);
            }
        });

        Btn_Notes.setText("Create Notes");

        Btn_InspectPatient.setText("Inspect Patient");

        Btn_CreatePerscription.setText("Create Perscription");

        Btn_RequestMeds.setText("Request New Medication");

        Btn_CreateAppt.setText("Create Appointment");

        Btn_Save.setText("Save");

        Btn_Logout.setText("Logout");
        Btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_RequestMeds)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                                .addComponent(Btn_Save))
                            .addComponent(Btn_CreatePerscription)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_ViewAppt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_InspectPatient)
                                    .addGap(18, 18, 18)
                                    .addComponent(Btn_CreateAppt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_Notes))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Btn_Logout))
                .addGap(18, 18, 18)
                .addComponent(Btn_ViewAppt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_InspectPatient)
                    .addComponent(Btn_CreateAppt)
                    .addComponent(Btn_Notes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_CreatePerscription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_RequestMeds)
                    .addComponent(Btn_Save))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DataHandler Data = new DataHandler();
    List_Users U = new List_Users();
    Lists_AP AP = new Lists_AP();
    private static Integer ID = 0;
    
    public void GetData(DataHandler data){
        Data = data;
        U = Data.getU();
        AP = Data.getAP();
    }
    public void GetDId(Integer x) {
        ID = x + 1;
    }
    
    
    private void Btn_ViewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewApptActionPerformed
        int APSize = AP.appointmentList.size();
        String Appointments[] = new String[APSize + 1];
        int Pat = 0;
        
        for(int x = 0; x < APSize; x++){
            if(ID.toString().equals(AP.appointmentList.get(x).getDoctor_IDN())){
              Pat = Integer.valueOf(AP.appointmentList.get(x).getPatient_IDN());
              Appointments[0 + x] = U.patientList.get(Pat - 1).getPatient_Firstname() + " " + U.patientList.get(Pat - 1).getPatient_Surname()+ " - " + AP.appointmentList.get(x).getAP_Time() + " " + AP.appointmentList.get(x).getAP_Date();
              Appointments = Arrays.copyOf(Appointments, Appointments.length + 1);
            }
        }
         //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Appointments.length; x++){
            DLM.addElement(Appointments[x]);
            }
            Lst_Appts.setModel(DLM); 
    }//GEN-LAST:event_Btn_ViewApptActionPerformed

    private void Btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogoutActionPerformed
        OpenHome();
    }//GEN-LAST:event_Btn_LogoutActionPerformed

  
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void OpenHome(){
          GUI_Home Home = new GUI_Home();
          Home.GetUser(Data);
          Home.show();
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
            java.util.logging.Logger.getLogger(GUI_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Doctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CreateAppt;
    private javax.swing.JButton Btn_CreatePerscription;
    private javax.swing.JButton Btn_InspectPatient;
    private javax.swing.JButton Btn_Logout;
    private javax.swing.JButton Btn_Notes;
    private javax.swing.JButton Btn_RequestMeds;
    private javax.swing.JButton Btn_Save;
    private javax.swing.JButton Btn_ViewAppt;
    private javax.swing.JList<String> Lst_Appts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
