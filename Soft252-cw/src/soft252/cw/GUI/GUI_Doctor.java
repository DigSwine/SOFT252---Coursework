//@author mwilson-slider

package soft252.cw.GUI;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Clinic;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;

public class GUI_Doctor extends javax.swing.JFrame {
    public GUI_Doctor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        Lst_PNotes = new javax.swing.JList<>();
        Cmb_PerName = new javax.swing.JComboBox<>();
        Txt_PDosage = new javax.swing.JTextField();
        Txt_PerQuan = new javax.swing.JTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        Btn_Notes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NotesActionPerformed(evt);
            }
        });

        Btn_InspectPatient.setText("Inspect Patient");
        Btn_InspectPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InspectPatientActionPerformed(evt);
            }
        });

        Btn_CreatePerscription.setText("Create Perscription");
        Btn_CreatePerscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CreatePerscriptionActionPerformed(evt);
            }
        });

        Btn_RequestMeds.setText("Request New Medication");
        Btn_RequestMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RequestMedsActionPerformed(evt);
            }
        });

        Btn_CreateAppt.setText("Create Appointment");

        Btn_Save.setText("Save");
        Btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SaveActionPerformed(evt);
            }
        });

        Btn_Logout.setText("Logout");
        Btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogoutActionPerformed(evt);
            }
        });

        Txt_Notes.setText("- New Note -");

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
        Btn_MoveLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MoveLeftActionPerformed(evt);
            }
        });

        Btn_MoveRight.setText("->");
        Btn_MoveRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MoveRightActionPerformed(evt);
            }
        });

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

        Lst_PNotes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "- Patient Notes -" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(Lst_PNotes);

        Cmb_PerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Perscription Name-" }));

        Txt_PDosage.setText("-Perscription Dosage-");

        Txt_PerQuan.setText("-Perscription Quantity-");

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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_CreateAppt)
                                    .addGap(18, 18, 18)
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Btn_CreatePerscription))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Cmb_PerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Txt_PDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Txt_PerQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane4))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btn_RequestMeds)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_PerscriptionDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Txt_PerscriptionQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn_Save))
                                    .addComponent(Txt_PerscriptionName, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cmb_MoveBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_MoveLeft)
                            .addComponent(Btn_MoveRight)
                            .addComponent(Txt_PerscriptionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_PerscriptionDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_RequestMeds))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_CreatePerscription)
                            .addComponent(Cmb_PerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_PDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_PerQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_PerscriptionQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Save))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DataHandler Data = new DataHandler();
    List_Users U = new List_Users();
    Lists_AP AP = new Lists_AP();
    List_Clinic C = new List_Clinic();
    int day = 0;
    int maxdays = 0;
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
        Lst_PNotes.disable();
        Txt_PerscriptionName.disable();
        Txt_PerscriptionDosage.disable();
        Txt_PerscriptionQuantity.disable();
        Cmb_PerName.disable();
        Txt_PDosage.disable();
        Txt_PerQuan.disable();
    
    //SetDate
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        day = localDate.getDayOfMonth();
        maxdays = localDate.lengthOfMonth();
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
        Txt_Month.setText(monthstg[month - 1]);
    }
    
    public void GetDId(Integer x) {
        ID = x;
    }
    
    
    private void Btn_ViewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ViewApptActionPerformed
        int APSize = AP.appointmentList.size();
        String Appointments[] = new String[APSize + 1];
        int Pat = 0;
        for(int x = 0; x < APSize; x++){
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
    Txt_Notes.setText(AP.appointmentList.get(selectedPat).getPatient_Notes());

        Lst_Appts.disable();
        Lst_PAppointments.enable();
        int APSize = AP.appointmentList.size();
        String PAppointments[] = new String[APSize];
        int Doc = 0;
        for(int x = 0; x < APSize; x++){
            if(AP.appointmentList.get(x).getPatient_IDN().equals(String.valueOf(Pat))){
                Doc = Integer.valueOf(AP.appointmentList.get(x).getDoctor_IDN()) - 1;
                PAppointments = Arrays.copyOf(PAppointments, PAppointments.length + 1);        
                PAppointments[0 + x] = U.doctorList.get(Doc).getDoctor_FirstName()+ " " + U.doctorList.get(Doc).getDoctor_SurName()+ " - " + AP.appointmentList.get(x).getAP_Time() + " " + AP.appointmentList.get(x).getAP_Date();
            }
        }
        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < PAppointments.length; x++){
            DLM.addElement(PAppointments[x]);
            }
            Lst_PAppointments.setModel(DLM); 
        Lst_PAppointments.disable();
        
        Lst_PMedications.enable();
        int MSize = AP.perscriptionList.size();
        String PMeds[] = new String[MSize + 1];
        for(int x = 0; x < MSize; x++){
            if(AP.perscriptionList.get(x).getPatient_IDN().equals(String.valueOf(Pat))){
            PMeds = Arrays.copyOf(PMeds, PMeds.length + 1);     
            PMeds[0 + x] = AP.perscriptionList.get(Pat).getPerscription_Name();         
            }      
        }
        //SetListValues
            DefaultListModel MedList = new DefaultListModel();
            for(int x = 0; x < PMeds.length; x++){
            MedList.addElement(PMeds[x]);
            }
             Lst_PMedications.setModel(MedList); 
         Lst_PMedications.disable();
         
         Lst_PNotes.enable();
         int NSize = AP.appointmentList.size();
        String Note[] = new String[MSize + 1];
        for(int x = 0; x < NSize; x++){
            if(AP.appointmentList.get(x).getPatient_IDN().equals(String.valueOf(Pat))){
            Note[0 + x] = AP.appointmentList.get(x).getPatient_Notes();
            Note = Arrays.copyOf(Note, Note.length + 1); 
            }      
        }
          //SetListValues
            DefaultListModel NoteList = new DefaultListModel();
            for(int x = 0; x < Note.length; x++){
            NoteList.addElement(Note[x]);
            }
             Lst_PNotes.setModel(NoteList); 
         
         Lst_PNotes.disable();
         
    }//GEN-LAST:event_Btn_InspectPatientActionPerformed

    private void Btn_NotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NotesActionPerformed
        Txt_Notes.enable();
    }//GEN-LAST:event_Btn_NotesActionPerformed

    private void Btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SaveActionPerformed
        try {
            int selectedPat = Lst_Appts.getSelectedIndex();
            String Pat = AP.appointmentList.get(selectedPat).getPatient_IDN();
            String Time = AP.appointmentList.get(selectedPat).getAP_Time();
            String Date = AP.appointmentList.get(selectedPat).getAP_Date();
            String Note = Txt_Notes.getText();
            Data.NewNote("AP", Pat, String.valueOf(ID), Time, Date, Note);
            
            
            GUI_Doctor New = new GUI_Doctor();
            New.GetData(Data);
            New.GetDId(ID);
            New.show();
            this.dispose();
                
                
                
        } catch (IOException ex) {
            Logger.getLogger(GUI_Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Btn_SaveActionPerformed

    private void Btn_MoveLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MoveLeftActionPerformed
         String SelectedMove = Cmb_MoveBy.getSelectedItem().toString();
        
        if("Day".equals(SelectedMove)){
            if(day == 1){                
            } else {
            day = day - 1;
            Txt_Day.setText(String.valueOf(day));
            }
        }   
        if("Month".equals(SelectedMove)){
            if(month == 0){
            } else {
                month = month - 1;
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
        Txt_Month.setText(monthstg[month - 1]);
            }
        }
    }//GEN-LAST:event_Btn_MoveLeftActionPerformed

    private void Btn_MoveRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MoveRightActionPerformed
        String SelectedMove = Cmb_MoveBy.getSelectedItem().toString();
       
        
        if("Day".equals(SelectedMove)){
            if(day == maxdays){                
            } else {
            day = day + 1;
            Txt_Day.setText(String.valueOf(day));
            }
        }   
        if("Month".equals(SelectedMove)){
            if(month == 12){
            } else {
                month = month + 1;
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
        Txt_Month.setText(monthstg[month - 1]);
            }
        }
    }//GEN-LAST:event_Btn_MoveRightActionPerformed

    private void Btn_CreatePerscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CreatePerscriptionActionPerformed
        Cmb_PerName.enable();
        Txt_PDosage.enable();
        Txt_PerQuan.enable(); 
    }//GEN-LAST:event_Btn_CreatePerscriptionActionPerformed

    private void Btn_RequestMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RequestMedsActionPerformed
        Txt_PerscriptionName.enable();
        Txt_PerscriptionDosage.enable();
        Txt_PerscriptionQuantity.enable();
    }//GEN-LAST:event_Btn_RequestMedsActionPerformed

    

 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
    private javax.swing.JComboBox<String> Cmb_PerName;
    private javax.swing.JList<String> Lst_Appts;
    private javax.swing.JList<String> Lst_PAppointments;
    private javax.swing.JList<String> Lst_PMedications;
    private javax.swing.JList<String> Lst_PNotes;
    private javax.swing.JTextField Txt_CityName;
    private javax.swing.JTextField Txt_Day;
    private javax.swing.JTextField Txt_Month;
    private javax.swing.JTextField Txt_Notes;
    private javax.swing.JTextField Txt_PAge;
    private javax.swing.JTextField Txt_PDosage;
    private javax.swing.JTextField Txt_PGender;
    private javax.swing.JTextField Txt_PHNumber;
    private javax.swing.JTextField Txt_PName;
    private javax.swing.JTextField Txt_PPC;
    private javax.swing.JTextField Txt_PSName;
    private javax.swing.JTextField Txt_PerQuan;
    private javax.swing.JTextField Txt_PerscriptionDosage;
    private javax.swing.JTextField Txt_PerscriptionName;
    private javax.swing.JTextField Txt_PerscriptionQuantity;
    private javax.swing.JTextField Txt_Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

  
}
