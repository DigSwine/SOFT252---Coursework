//@author mwilson-slider

package soft252.cw.GUI;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
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
        Txt_Notes = new javax.swing.JTextField();
        Txt_PerscriptionName = new javax.swing.JTextField();
        Txt_PerscriptionDosage = new javax.swing.JTextField();
        Txt_PerscriptionQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lst_PAppointments = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lst_PMedications = new javax.swing.JList<>();
        Cmb_MoveBy = new javax.swing.JComboBox<>();
        Btn_MoveLeft = new javax.swing.JButton();
        Btn_MoveRight = new javax.swing.JButton();
        Txt_Day = new javax.swing.JTextField();
        Txt_Month = new javax.swing.JTextField();
        Txt_Year = new javax.swing.JTextField();
        Txt_PName = new javax.swing.JTextField();
        Txt_PAge = new javax.swing.JTextField();
        Txt_PGender = new javax.swing.JTextField();
        Txt_PHNumber = new javax.swing.JTextField();
        Txt_PSName = new javax.swing.JTextField();
        Txt_CityName = new javax.swing.JTextField();
        Txt_PPC = new javax.swing.JTextField();

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
        Btn_InspectPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InspectPatientActionPerformed(evt);
            }
        });

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

        Txt_PerscriptionName.setText("-Perscription Name-");

        Txt_PerscriptionDosage.setText("-Dosage-");

        Txt_PerscriptionQuantity.setText("-Perscribed Quantity-");

        Lst_PAppointments.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "- Previous Appointments -" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Lst_PAppointments);

        Lst_PMedications.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "- Perscribed Medication -" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(Lst_PMedications);

        Cmb_MoveBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Month" }));

        Btn_MoveLeft.setText("<-");

        Btn_MoveRight.setText("->");

        Txt_Day.setText("Day");

        Txt_Month.setText("Month");

        Txt_Year.setText("Year");

        Txt_PName.setText("-Patient Name-");

        Txt_PAge.setText("-Patient Age-");

        Txt_PGender.setText("-Patient Gender-");

        Txt_PHNumber.setText("-House Number-");

        Txt_PSName.setText("-Street Name-");

        Txt_CityName.setText("-City Name-");

        Txt_PPC.setText("-Post Code-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_InspectPatient)
                                    .addGap(18, 18, 18)
                                    .addComponent(Btn_CreateAppt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_Notes))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Day)
                                    .addComponent(Btn_MoveLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cmb_MoveBy, 0, 198, Short.MAX_VALUE)
                                    .addComponent(Txt_Month))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn_MoveRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Txt_Year)))
                            .addComponent(Btn_ViewAppt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_RequestMeds)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txt_PerscriptionQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Save))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_PAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_PGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_PHNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_PSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txt_CityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_PPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn_CreatePerscription)
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txt_PerscriptionDosage)
                                            .addComponent(Txt_PerscriptionName))
                                        .addGap(75, 75, 75)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ViewAppt)
                    .addComponent(Txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PHNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_CityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_InspectPatient)
                    .addComponent(Btn_CreateAppt)
                    .addComponent(Btn_Notes)
                    .addComponent(Txt_Notes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))
                        .addGap(38, 38, 38))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_CreatePerscription)
                    .addComponent(Txt_PerscriptionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_PerscriptionDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_MoveBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_MoveLeft)
                    .addComponent(Btn_MoveRight))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_RequestMeds)
                    .addComponent(Txt_PerscriptionQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DataHandler Data = new DataHandler();
    List_Users U = new List_Users();
    Lists_AP AP = new Lists_AP();
    int day = 0;
    int month = 0;
    int year = 0;
    private static Integer ID = 0;
    
    public void GetData(DataHandler data){
        Data = data;
        U = Data.getU();
        AP = Data.getAP();
        
        Txt_PName.disable();
        Txt_PAge.disable();
        Txt_PGender.disable();
        Txt_PHNumber.disable();
        Txt_PSName.disable();
        Txt_CityName.disable();
        Txt_PPC.disable();
        Txt_Notes.disable();
        Lst_PAppointments.disable();
        Lst_PMedications.disable();
        Txt_PerscriptionName.disable();
        Txt_PerscriptionDosage.disable();
        Txt_PerscriptionQuantity.disable();
    
    //SetDate
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        day = localDate.getDayOfMonth();
        month = localDate.getMonthValue();
        year = localDate.getYear();
        Txt_Day.setText(String.valueOf(day));
        Txt_Year.setText(String.valueOf(year));
        
         String monthstg[] = new String[12];
            monthstg[0] = "January";
            monthstg[1] = "Febuary";
            monthstg[2] = "March";
            monthstg[3] = "April";
            monthstg[4] = "May";
            monthstg[5] = "June";
            monthstg[6] = "July";
            monthstg[7] = "Augest";
            monthstg[8] = "September";
            monthstg[9] = "October";
            monthstg[10] = "November";
            monthstg[11] = "December";
        for(int x = 0; x <= 12; x++){
            if(month != x){    
            }else{
                for(int y = x; y <= 12; y++){
                    Txt_Month.setText(monthstg[y - 1]);
                }  
            }
        }
    }
    
    public void GetDId(Integer x) {
        ID = x;
    }
    
    
    private void Btn_ViewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewApptActionPerformed
        int APSize = AP.appointmentList.size();
        String Appointments[] = new String[APSize + 1];
        int Pat = 0;
        
        for(int x = 0; x < APSize - 1; x++){
            if(AP.appointmentList.get(x).getDoctor_IDN().equals(ID.toString())){
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

    private void Btn_InspectPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InspectPatientActionPerformed
    int selectedPat = Lst_Appts.getSelectedIndex();
        int Pat = 0;
    Pat = Integer.valueOf(AP.appointmentList.get(selectedPat).getPatient_IDN());
    
    Txt_PName.setText(U.patientList.get(Pat - 1).getPatient_Firstname() + U.patientList.get(Pat - 1).getPatient_Surname());
    Txt_PAge.setText(U.patientList.get(Pat - 1).getPatient_Age());
    Txt_PGender.setText(U.patientList.get(Pat - 1).getPatient_Gender());
    Txt_PHNumber.setText(U.patientList.get(Pat - 1).getPatient_StreetNumber());
    Txt_PSName.setText(U.patientList.get(Pat - 1).getPatient_StreetName());
    Txt_CityName.setText(U.patientList.get(Pat - 1).getPatient_CityName());
    Txt_PPC.setText(U.patientList.get(Pat - 1).getPatient_PostCode());

        Lst_PAppointments.enable();
        int APSize = AP.appointmentList.size();
        String PAppointments[] = new String[APSize + 1];
        int Doc = 0;
        for(int x = 0; x < APSize - 1; x++){
            if(AP.appointmentList.get(x).getDoctor_IDN().equals(ID.toString())){
              Doc = Integer.valueOf(AP.appointmentList.get(x).getDoctor_IDN());
        PAppointments[0 + x] = U.doctorList.get(Doc - 1).getDoctor_FirstName()+ " " + U.doctorList.get(Doc - 1).getDoctor_SurName()+ " - " + AP.appointmentList.get(x).getAP_Time() + " " + AP.appointmentList.get(x).getAP_Date();
        PAppointments = Arrays.copyOf(PAppointments, PAppointments.length + 1);
            }
        }
        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < PAppointments.length; x++){
            DLM.addElement(PAppointments[x]);
            }
            Lst_PAppointments.setModel(DLM); 
        Lst_PAppointments.disable();
        
         Lst_PAppointments.enable();
        int MSize = AP.perscriptionList.size();
        String PMeds[] = new String[MSize + 1];
        int Med = 0;
//        for(int x = 0; x < MSize - 1; x++){
//            if(AP.appointmentList.get(x).getDoctor_IDN().equals(ID.toString())){
//              Doc = Integer.valueOf(AP.appointmentList.get(x).getDoctor_IDN());
//        PAppointments[0 + x] = U.doctorList.get(Doc - 1).getDoctor_FirstName()+ " " + U.doctorList.get(Doc - 1).getDoctor_SurName()+ " - " + AP.appointmentList.get(x).getAP_Time() + " " + AP.appointmentList.get(x).getAP_Date();
//        PAppointments = Arrays.copyOf(PAppointments, PAppointments.length + 1);
//            }
//        }
//        //SetListValues
//            DefaultListModel DLM = new DefaultListModel();
//            for(int x = 0; x < PAppointments.length; x++){
//            DLM.addElement(PAppointments[x]);
//            }
//            Lst_PAppointments.setModel(DLM); 
//        Lst_PAppointments.disable();
//        
    }//GEN-LAST:event_Btn_InspectPatientActionPerformed

  
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
    private javax.swing.JButton Btn_MoveLeft;
    private javax.swing.JButton Btn_MoveRight;
    private javax.swing.JButton Btn_Notes;
    private javax.swing.JButton Btn_RequestMeds;
    private javax.swing.JButton Btn_Save;
    private javax.swing.JButton Btn_ViewAppt;
    private javax.swing.JComboBox<String> Cmb_MoveBy;
    private javax.swing.JList<String> Lst_Appts;
    private javax.swing.JList<String> Lst_PAppointments;
    private javax.swing.JList<String> Lst_PMedications;
    private javax.swing.JTextField Txt_CityName;
    private javax.swing.JTextField Txt_Day;
    private javax.swing.JTextField Txt_Month;
    private javax.swing.JTextField Txt_Notes;
    private javax.swing.JTextField Txt_PAge;
    private javax.swing.JTextField Txt_PGender;
    private javax.swing.JTextField Txt_PHNumber;
    private javax.swing.JTextField Txt_PName;
    private javax.swing.JTextField Txt_PPC;
    private javax.swing.JTextField Txt_PSName;
    private javax.swing.JTextField Txt_PerscriptionDosage;
    private javax.swing.JTextField Txt_PerscriptionName;
    private javax.swing.JTextField Txt_PerscriptionQuantity;
    private javax.swing.JTextField Txt_Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

  
}
