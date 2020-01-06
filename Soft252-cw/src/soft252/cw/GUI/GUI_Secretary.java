//@author mwilson-slider
package soft252.cw.GUI;

import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Clinic;
import soft252.cw.Classes.List_Requests;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;

public class GUI_Secretary extends javax.swing.JPanel {
    public GUI_Secretary() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_NewAccounts = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lst_ApptsRequests = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lst_Stock = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lst_AccountRemoval = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        Lst_MedsReady = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        Btn_NewPatApp = new javax.swing.JButton();
        Btn_NewPatDeny = new javax.swing.JButton();
        Btn_NewApptApp = new javax.swing.JButton();
        Btn_NewApptDeny = new javax.swing.JButton();
        Btn_Restock = new javax.swing.JButton();
        Btn_DelPatApp = new javax.swing.JButton();
        Btn_DelPatDeny = new javax.swing.JButton();
        Btn_Handedout = new javax.swing.JButton();
        Btn_Logout = new javax.swing.JButton();

        Lst_NewAccounts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-New Patient Accounts-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lst_NewAccounts);

        Lst_ApptsRequests.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Appointment Requests-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Lst_ApptsRequests);

        Lst_Stock.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Stock Needs Replacing And New Medication Requests-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(Lst_Stock);

        Lst_AccountRemoval.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Account Removal-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(Lst_AccountRemoval);

        Lst_MedsReady.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-Meds To Handout-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(Lst_MedsReady);

        jLabel1.setText("Secratary");

        Btn_NewPatApp.setText("Approve");

        Btn_NewPatDeny.setText("Deny");

        Btn_NewApptApp.setText("Approve");

        Btn_NewApptDeny.setText("Deny");

        Btn_Restock.setText("Restock");

        Btn_DelPatApp.setText("Approve");

        Btn_DelPatDeny.setText("Deny");

        Btn_Handedout.setText("Handedout");

        Btn_Logout.setText("Log Out");
        Btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_DelPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_DelPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Btn_Handedout, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Btn_Logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_NewPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_NewPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_NewApptApp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_NewApptDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Restock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_DelPatApp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_DelPatDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Handedout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    DataHandler Data = new DataHandler();
    Lists_AP AP = new Lists_AP();
    List_Users U = new List_Users();
    List_Clinic C = new List_Clinic();
    List_Requests R = new List_Requests();
    int ID = 0;
    
    public void GetData(DataHandler data){
        Data = data;
        AP = Data.getAP();
        U = Data.getU();
        
        setAll();
    }
    
    public void GetId(int id){
        ID = id;
    }
    
    private void setAll(){
        GetAppointmentRequests();
        GetPerscriptionRequests();
    }
    
    private void Btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogoutActionPerformed
         GUI_Home Home = new GUI_Home();
            Home.GetUser(Data);
            Home.show();
            this.hide();
    }//GEN-LAST:event_Btn_LogoutActionPerformed

    private void GetAppointmentRequests(){
        // Lst_ApptsRequests
        int NewSize = R.requestAppointmentList.size();
        String[] Appointment = new String[1];
        Integer Docid = 0;
        
        for(int x = 0; x < NewSize; x++){
            Docid = Integer.valueOf(R.requestAppointmentList.get(x).getDoctor_IDN());
            Appointment[x] = R.requestAppointmentList.get(x).getAP_Time() + " " + R.requestAppointmentList.get(x).getAP_Date() + " " + U.doctorList.get(Docid - 1).getDoctor_FirstName() + " " + U.doctorList.get(Docid - 1).getDoctor_SurName();
        }
        //SetListValues
            DefaultListModel DLM = new DefaultListModel();
            for(int x = 0; x < Appointment.length; x++){
            DLM.addElement(Appointment[x]);
            }
            Lst_ApptsRequests.setModel(DLM);
    }
    private void GetPerscriptionRequests(){
        // Lst_Stock - Requests
        int ReqSize = R.requestAppointmentList.size();
        String[] PerscriptionRequests = new String[1];
        int Ammonthneded = 100;
        for(int x = 0; x < ReqSize; x++){
            PerscriptionRequests[x] = R.requestPerscriptionList.get(x).getPerscription_Name()+ ": Dosage - " + R.requestPerscriptionList.get(x).getPerscption_Dosage() + ": Quantity - " + Ammonthneded;
        }
        
        // Lst_Stock - Restock
        int LowSize = C.lowsotckList.size();
        String[] Needed = new String[1];
        Integer Have = 0;
        int Required = 0;
        for(int x = 0; x < LowSize; x++){
            Have = Integer.valueOf(C.lowsotckList.get(x).getItem_Stock());
            Required = 100 - Have;
            Needed[x] = C.lowsotckList.get(x).getItem_Name()+ ": Required - " + Required; 
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

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DelPatApp;
    private javax.swing.JButton Btn_DelPatDeny;
    private javax.swing.JButton Btn_Handedout;
    private javax.swing.JButton Btn_Logout;
    private javax.swing.JButton Btn_NewApptApp;
    private javax.swing.JButton Btn_NewApptDeny;
    private javax.swing.JButton Btn_NewPatApp;
    private javax.swing.JButton Btn_NewPatDeny;
    private javax.swing.JButton Btn_Restock;
    private javax.swing.JList<String> Lst_AccountRemoval;
    private javax.swing.JList<String> Lst_ApptsRequests;
    private javax.swing.JList<String> Lst_MedsReady;
    private javax.swing.JList<String> Lst_NewAccounts;
    private javax.swing.JList<String> Lst_Stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
