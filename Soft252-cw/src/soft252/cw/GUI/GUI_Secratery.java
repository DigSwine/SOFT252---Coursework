
package soft252.cw.GUI;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Clinic;
import soft252.cw.Classes.List_Requests;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;

public class GUI_Secratery extends javax.swing.JFrame {
    public GUI_Secratery() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btn_Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_NewAccounts = new javax.swing.JList<>();
        Btn_NewPatApp = new javax.swing.JButton();
        Btn_NewPatDeny = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lst_ApptsRequests = new javax.swing.JList<>();
        Btn_NewApptApp = new javax.swing.JButton();
        Btn_NewApptDeny = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lst_Stock = new javax.swing.JList<>();
        Btn_Restock = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lst_AccountRemoval = new javax.swing.JList<>();
        Btn_DelPatApp = new javax.swing.JButton();
        Btn_DelPatDeny = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Lst_MedsReady = new javax.swing.JList<>();
        Btn_Handedout = new javax.swing.JButton();
        Cmb_RmovePatSelect = new javax.swing.JComboBox<>();
        Btn_RemovePat = new javax.swing.JButton();
        Txt_Confirm = new javax.swing.JTextField();
        Cmb_PNAppt = new javax.swing.JComboBox<>();
        Cmb_DNAppt = new javax.swing.JComboBox<>();
        Btn_CreateAppt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Secratary");

        Btn_Logout.setText("Log Out");
        Btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogoutActionPerformed(evt);
            }
        });

        Lst_NewAccounts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-New Patient Accounts-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lst_NewAccounts);

        Btn_NewPatApp.setText("Approve");
        Btn_NewPatApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewPatAppActionPerformed(evt);
            }
        });

        Btn_NewPatDeny.setText("Deny");
        Btn_NewPatDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewPatDenyActionPerformed(evt);
            }
        });

        Lst_ApptsRequests.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Appointment Requests-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Lst_ApptsRequests);

        Btn_NewApptApp.setText("Approve");
        Btn_NewApptApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewApptAppActionPerformed(evt);
            }
        });

        Btn_NewApptDeny.setText("Deny");
        Btn_NewApptDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewApptDenyActionPerformed(evt);
            }
        });

        Lst_Stock.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Stock Needs Replacing And New Medication Requests-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(Lst_Stock);

        Btn_Restock.setText("Restock");
        Btn_Restock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RestockActionPerformed(evt);
            }
        });

        Lst_AccountRemoval.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Account Removal-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(Lst_AccountRemoval);

        Btn_DelPatApp.setText("Approve");
        Btn_DelPatApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DelPatAppActionPerformed(evt);
            }
        });

        Btn_DelPatDeny.setText("Deny");
        Btn_DelPatDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DelPatDenyActionPerformed(evt);
            }
        });

        Lst_MedsReady.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Meds To Handout-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(Lst_MedsReady);

        Btn_Handedout.setText("Handedout");
        Btn_Handedout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HandedoutActionPerformed(evt);
            }
        });

        Cmb_RmovePatSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Patient to Remove -" }));

        Btn_RemovePat.setText("Remove Patient");
        Btn_RemovePat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RemovePatActionPerformed(evt);
            }
        });

        Txt_Confirm.setText("-Type CONFIRM to confirm -");
        Txt_Confirm.setToolTipText("");

        Cmb_PNAppt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Patient for immediate appointment -" }));

        Cmb_DNAppt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Doctor for immediate appointment -" }));

        Btn_CreateAppt.setText("Create New Appointment");
        Btn_CreateAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CreateApptActionPerformed(evt);
            }
        });

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
                        .addComponent(Btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_DelPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_DelPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Btn_NewPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Btn_NewPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Btn_NewApptApp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Btn_NewApptDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Btn_Restock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Btn_Handedout, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cmb_RmovePatSelect, 0, 345, Short.MAX_VALUE)
                                    .addComponent(Txt_Confirm)
                                    .addComponent(Btn_RemovePat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cmb_PNAppt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cmb_DNAppt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_CreateAppt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Btn_Logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_NewPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_NewPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cmb_PNAppt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cmb_DNAppt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_CreateAppt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Restock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Btn_DelPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_DelPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_NewApptApp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_NewApptDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Handedout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cmb_RmovePatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_RemovePat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    DataHandler Data = new DataHandler();
    Lists_AP AP = new Lists_AP();
    List_Users U = new List_Users();
    List_Clinic C = new List_Clinic();
    List_Requests R = new List_Requests();
    int ID = 0;
    String Date = "";
    String TheTime = "";
    
    public void GetData(DataHandler data){
        Data = data;
        AP = Data.getAP();
        U = Data.getU();
        C = Data.getC();
        R = Data.getR();
        setAll();
    }
    
    public void GetId(int id){
        ID = id;
    }
    
    private void setAll(){
        GetAppointmentRequests();
        GetPerscriptionRequests();
        GetNewPatients();
        GetDelPatients();
        GetHandout();
        GetCurrentPats();
        GetCurrentDocs();
    }                                      
    private void GetAppointmentRequests(){
        // Lst_ApptsRequests
        int NewSize = R.requestAppointmentList.size();
        String[] Appointment = new String[1];
        Integer Docid = 0;
         if (NewSize == 0){
            
        } else {
        for(int x = 0; x < NewSize; x++){
            Docid = Integer.valueOf(R.requestAppointmentList.get(x).getDoctor_IDN());
            Appointment[x] = R.requestAppointmentList.get(x).getAP_Time() + " " + R.requestAppointmentList.get(x).getAP_Date() + " " + U.doctorList.get(Docid - 1).getDoctor_FirstName() + " " + U.doctorList.get(Docid - 1).getDoctor_SurName();
            Appointment = Arrays.copyOf(Appointment, Appointment.length + 1);
        }
        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Appointment.length; x++){
            DLM.addElement(Appointment[x]);
            }
            Lst_ApptsRequests.setModel(DLM);
    }
    }
    private void GetPerscriptionRequests(){
        // Lst_Stock - Requests
        int ReqSize = R.requestPerscriptionList.size();
        String[] PerscriptionRequests = new String[1];
        int Ammonthneded = 100;
        String TheReq = String.valueOf(Ammonthneded);
        String TheName = "";
        String TheDos = "";
         if (ReqSize == 0){
            
        } else {
        for(int x = 0; x < ReqSize; x++){
            TheName = R.requestPerscriptionList.get(x).getPerscription_Name();
            TheDos = R.requestPerscriptionList.get(x).getPerscption_Dosage();
            PerscriptionRequests[x] = TheName + ": Dosage - " + TheDos + ": Quantity - " + TheReq;
            PerscriptionRequests = Arrays.copyOf(PerscriptionRequests, PerscriptionRequests.length + 1);
        }
        
        // Lst_Stock - Restock
        int LowSize = C.lowsotckList.size();
        String[] Needed = new String[1];
        Integer Have = 0;
        int Required = 0;
         if (LowSize == 0){
            
        } else {
        for(int x = 0; x < LowSize; x++){
            Have = C.lowsotckList.get(x).getItem_Stock();
            Required = 100 - Have;
            TheName = C.lowsotckList.get(x).getItem_Name();
            Needed[x] = TheName + ": Required - " + String.valueOf(Required); 
            Needed = Arrays.copyOf(Needed, Needed.length + 1);
        }

        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < PerscriptionRequests.length; x++){
                DLM.addElement(PerscriptionRequests[x]);
            }
            for(int x = 0; x < Needed.length; x++){
                DLM.addElement(Needed[x]);
            }
            Lst_Stock.setModel(DLM);
    }
    }
    }
    private void GetNewPatients(){
        // Lst_NewAccounts
        int NewPatSize = R.requestPatientList.size();
        String[] Pat = new String[1];
         if (NewPatSize == 0){
            
        } else {
        for(int x = 0; x < NewPatSize; x++){
            String TheName = R.requestPatientList.get(x).getPatient_Firstname() + " " + R.requestPatientList.get(x).getPatient_Surname();
            String TheGender = R.requestPatientList.get(x).getPatient_Gender();
            String TheAge = R.requestPatientList.get(x).getPatient_Age();
            Pat[x] = TheName + ", " + TheGender + ", Age - " + TheAge; 
            Pat = Arrays.copyOf(Pat, Pat.length + 1);
        }

        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Pat.length; x++){
                DLM.addElement(Pat[x]);
            }
            Lst_NewAccounts.setModel(DLM);
    }
    }
    private void GetDelPatients(){
        // Lst_AccountRemoval
        int NewPatSize = R.deletePatientList.size();
        String[] Pat = new String[1];
         if (NewPatSize == 0){
            
        } else {
        for(int x = 0; x < NewPatSize; x++){
            String TheName = R.deletePatientList.get(x).getPatient_Firstname() + " " + R.deletePatientList.get(x).getPatient_Surname();
            String TheGender = R.deletePatientList.get(x).getPatient_Gender();
            String TheAge = R.deletePatientList.get(x).getPatient_Age();
            Pat[x] = TheName + ", " + TheGender + ", Age - " + TheAge; 
            Pat = Arrays.copyOf(Pat, Pat.length + 1);
        }

        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Pat.length; x++){
                DLM.addElement(Pat[x]);
            }
            Lst_AccountRemoval.setModel(DLM);
    }
    }
    private void GetHandout(){
        //Lst_MedsReady
         int NewPatSize = R.readyHandoutList.size();
        String[] Ready = new String[1];
        int who = 0;
        if (NewPatSize == 0){
            
        } else {
        for(int x = 0; x < NewPatSize; x++){
            who = Integer.valueOf(R.readyHandoutList.get(x).getPatient_IDN());
            String TheName = U.patientList.get(who).getPatient_Firstname() + " " + U.patientList.get(who).getPatient_Surname();
            String TheMed = R.readyHandoutList.get(x).getPerscription_Name();
            String TheDos = R.readyHandoutList.get(x).getPerscption_Dosage();
            String TheQuantity = R.readyHandoutList.get(x).getPerscription_Quantity();
            Ready[x] = TheMed + ", Dosage - " + TheDos + ", Quantity - " + TheQuantity + ", For - " + TheName; 
            Ready = Arrays.copyOf(Ready, Ready.length + 1);
        }

        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Ready.length; x++){
                DLM.addElement(Ready[x]);
            }
            Lst_MedsReady.setModel(DLM);
    }
    }
    private void GetCurrentPats(){
        //Cmb_RmovePatSelect    
        int PatLength = U.patientList.size();
        String FName = " ";
        String SName = " ";
        for(int x = 0; x < PatLength; x++){
        FName = U.patientList.get(x).getPatient_Firstname();
        SName = U.patientList.get(x).getPatient_Surname();
        Cmb_RmovePatSelect.addItem(FName + " " + SName);
        Cmb_PNAppt.addItem(FName + " " + SName);
        }
    }
    private void GetCurrentDocs(){
     //Cmb_DNAppt 
     int DocLength = U.doctorList.size();
        String FName = " ";
        String SName = " ";
        
        Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int day = 0;
    int month = 0;   
    int year = 0;
    
    month = localDate.getMonthValue();
    year = localDate.getYear();
    day = localDate.getDayOfMonth();
    
    String time = String.valueOf(java.time.LocalTime.now());
    
    char[] slotted = new char[6];
    for(int x = 0; x < 6; x++){
        slotted[x] = time.charAt(x);
    }
    String Hour = slotted[0] + "" + slotted[1];
    String Minute = slotted[3] + "" + slotted[4];
    
    int hour = Integer.valueOf(Hour);
    int minute = Integer.valueOf(Minute);
    
    if(30 < minute){
        minute = 00;
        hour = hour + 1;
    } else {
        minute = 30;
    }
    
    
    Date = day + "/" + month + "/" + year;
    TheTime = hour + ":" + minute;
    int LengthAppts = AP.appointmentList.size();
    
    String[] found = new String[LengthAppts];
    String[] who = new String[LengthAppts];
    int k = 0;
    for(int h = 0; h < LengthAppts; h++){
        if(Date.equals(AP.appointmentList.get(h).getAP_Date())){
            if(TheTime.equals(AP.appointmentList.get(h).getAP_Time())){
                found[h] = "y";
                found = Arrays.copyOf(found, found.length + 1);
            } else {
                found[h] = "n";
                found = Arrays.copyOf(found, found.length + 1);
            }
        } else {
            found[h] = "n";
            found = Arrays.copyOf(found, found.length + 1); 
        }
        if(found[h] == "y"){
            who[k] = AP.appointmentList.get(h).getDoctor_IDN();
            k = k + 1;
            who = Arrays.copyOf(who, who.length + 1);
        }
    }
        if(who.length == 0){
        for(int x = 0; x < DocLength; x++){
            FName = U.doctorList.get(x).getDoctor_FirstName();
            SName = U.doctorList.get(x).getDoctor_SurName();
            Cmb_DNAppt.addItem(FName + " " + SName);
        }
        } else {
            for(int x = 0; x < DocLength; x++){
                if(x > who.length){
                    
                } else {
                    if(who[x] != AP.appointmentList.get(x).getDoctor_IDN()){
                                    FName = U.doctorList.get(x).getDoctor_FirstName();
                                    SName = U.doctorList.get(x).getDoctor_SurName();
                                    Cmb_DNAppt.addItem(FName + " " + SName);
                    }
                }

        }
        }
    }
    private void reset(){
        GUI_Secratery Sec = new GUI_Secratery();
        Sec.GetData(Data);
        Sec.setVisible(true);
        this.dispose();
    }
    
    private void Btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogoutActionPerformed
        GUI_Home Home = new GUI_Home();
        Home.GetUser(Data);
        Home.show();
        this.hide();
    }//GEN-LAST:event_Btn_LogoutActionPerformed

    private void Btn_RestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RestockActionPerformed
        String type = "";
        int id = Lst_Stock.getSelectedIndex();
        int idn = 0;
        if(id >= C.lowsotckList.size()){
            type = "CD";
            int rsize = R.requestPerscriptionList.size();
            idn = id - rsize - 1;
        } else {
            type = "RD";
            idn = id;
        }
        try {
            Data.restock(type, idn);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
        
    }//GEN-LAST:event_Btn_RestockActionPerformed

    private void Btn_NewPatAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewPatAppActionPerformed
    String type = "R";
    int pid = Lst_NewAccounts.getSelectedIndex();
        try {
            Data.editAddPerson(type, pid);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_NewPatAppActionPerformed

    private void Btn_NewApptAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewApptAppActionPerformed
        int pid = Lst_ApptsRequests.getSelectedIndex();
        
        try {
            Data.editAddAppt("RA", pid);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_NewApptAppActionPerformed

    private void Btn_DelPatAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DelPatAppActionPerformed
        int pid = Lst_AccountRemoval.getSelectedIndex();
        try {
            Data.editDeletePerson("RD", pid);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_DelPatAppActionPerformed

    private void Btn_HandedoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HandedoutActionPerformed
       int did = Lst_MedsReady.getSelectedIndex();
       
        try {
            Data.DelHandout(did);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_HandedoutActionPerformed

    private void Btn_RemovePatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RemovePatActionPerformed
        int confirmed = 0;
        
        int ID = Cmb_RmovePatSelect.getSelectedIndex();
        
        
        String input = Txt_Confirm.getText();
        if(input.equals("CONFIRM")){
            confirmed = 1;
        }
        if(confirmed == 0){
            
        } else {
            System.out.println(ID);
            try {
                Data.RequestDeletion("P", ID);
            } catch (IOException ex) {
                Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
    }//GEN-LAST:event_Btn_RemovePatActionPerformed

    private void Btn_NewPatDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewPatDenyActionPerformed
       String type = "R";
    int pid = Lst_NewAccounts.getSelectedIndex();
        try {
            Data.editDenyPerson(type, pid);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();       
    }//GEN-LAST:event_Btn_NewPatDenyActionPerformed

    private void Btn_NewApptDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewApptDenyActionPerformed
       int pid = Lst_ApptsRequests.getSelectedIndex();
        
        try {
            Data.editDenyAppt("RA", pid);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_NewApptDenyActionPerformed

    private void Btn_DelPatDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DelPatDenyActionPerformed
         int pid = Lst_AccountRemoval.getSelectedIndex();
        try {
            Data.editDenyRemoval("RD", pid);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_DelPatDenyActionPerformed

    private void Btn_CreateApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CreateApptActionPerformed
        int pat = Cmb_PNAppt.getSelectedIndex();
        String doc = String.valueOf(Cmb_DNAppt.getSelectedIndex());
        
        try {
            Data.NewAppt(pat, doc, TheTime, Date);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Secratery.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
    }//GEN-LAST:event_Btn_CreateApptActionPerformed

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(GUI_Secratery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Secratery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Secratery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Secratery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Secratery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CreateAppt;
    private javax.swing.JButton Btn_DelPatApp;
    private javax.swing.JButton Btn_DelPatDeny;
    private javax.swing.JButton Btn_Handedout;
    private javax.swing.JButton Btn_Logout;
    private javax.swing.JButton Btn_NewApptApp;
    private javax.swing.JButton Btn_NewApptDeny;
    private javax.swing.JButton Btn_NewPatApp;
    private javax.swing.JButton Btn_NewPatDeny;
    private javax.swing.JButton Btn_RemovePat;
    private javax.swing.JButton Btn_Restock;
    private javax.swing.JComboBox<String> Cmb_DNAppt;
    private javax.swing.JComboBox<String> Cmb_PNAppt;
    private javax.swing.JComboBox<String> Cmb_RmovePatSelect;
    private javax.swing.JList<String> Lst_AccountRemoval;
    private javax.swing.JList<String> Lst_ApptsRequests;
    private javax.swing.JList<String> Lst_MedsReady;
    private javax.swing.JList<String> Lst_NewAccounts;
    private javax.swing.JList<String> Lst_Stock;
    private javax.swing.JTextField Txt_Confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
