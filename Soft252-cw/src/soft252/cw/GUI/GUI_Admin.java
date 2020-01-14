// @author mwilson-slider
package soft252.cw.GUI;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Users;

public class GUI_Admin extends javax.swing.JFrame {

    public GUI_Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_NewAdmin = new javax.swing.JButton();
        Txt_AdminFN = new javax.swing.JTextField();
        Txt_AdminSn = new javax.swing.JTextField();
        Txt_AdminStreetNum = new javax.swing.JTextField();
        Txt_AdminStreetName = new javax.swing.JTextField();
        Txt_AdminC = new javax.swing.JTextField();
        Txt_AdminPc = new javax.swing.JTextField();
        Txt_AdminUN = new javax.swing.JTextField();
        Txt_AdminPw = new javax.swing.JTextField();
        Cmb_DocOrSecSelect = new javax.swing.JComboBox<>();
        Cmb_DocorSecName = new javax.swing.JComboBox<>();
        Txt_ConfirmDocorSecDel = new javax.swing.JTextField();
        Btn_DelDocOrSec = new javax.swing.JButton();
        Txt_DoctorUN = new javax.swing.JTextField();
        Txt_DoctorPw = new javax.swing.JTextField();
        Btn_NewDoctor = new javax.swing.JButton();
        Txt_DoctorSn = new javax.swing.JTextField();
        Txt_DoctorStreetNum = new javax.swing.JTextField();
        Txt_DoctorStreetName = new javax.swing.JTextField();
        Txt_DoctorC = new javax.swing.JTextField();
        Txt_DoctorPc = new javax.swing.JTextField();
        Btn_NewAdmin2 = new javax.swing.JButton();
        Txt_SecrateryFN = new javax.swing.JTextField();
        Txt_SecraterySn = new javax.swing.JTextField();
        Txt_SecrateryStreetNum = new javax.swing.JTextField();
        Txt_SecrateryStreetName = new javax.swing.JTextField();
        Txt_SecrateryC = new javax.swing.JTextField();
        Txt_SecrateryPc = new javax.swing.JTextField();
        Txt_SecrateryUN = new javax.swing.JTextField();
        Txt_SecrateryPw = new javax.swing.JTextField();
        Txt_DoctorFN = new javax.swing.JTextField();
        Cmb_DoctorView = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_DoctorPatientComments = new javax.swing.JList<>();
        Txt_DoctorRateing = new javax.swing.JTextField();
        Btn_Feedback = new javax.swing.JButton();
        Txt_Feedback = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_LogOut.setText("Log Out");
        Btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogOutActionPerformed(evt);
            }
        });

        jLabel1.setText("Administrator");

        Btn_NewAdmin.setText("Add New Administrator");
        Btn_NewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewAdminActionPerformed(evt);
            }
        });

        Txt_AdminFN.setText("- New Admin FirstName -");
        Txt_AdminFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_AdminFNActionPerformed(evt);
            }
        });

        Txt_AdminSn.setText("- New Admin Surname -");

        Txt_AdminStreetNum.setText("- New Admin Street Number -");

        Txt_AdminStreetName.setText("- New Admin Street Name -");

        Txt_AdminC.setText("- New Admin Address City -");

        Txt_AdminPc.setText("- New Admin Postcode -");

        Txt_AdminUN.setText("- New Admin Username -");

        Txt_AdminPw.setText("- New Admin Password -");

        Cmb_DocOrSecSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- To remove select Doctor or Secratery -", "Doctor", "Secratery" }));
        Cmb_DocOrSecSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_DocOrSecSelectActionPerformed(evt);
            }
        });

        Cmb_DocorSecName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Who would you like to remove -" }));

        Txt_ConfirmDocorSecDel.setText("-Type CONFIRM to confirm deletion-");

        Btn_DelDocOrSec.setText("Delete Doctor or Secratary");
        Btn_DelDocOrSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DelDocOrSecActionPerformed(evt);
            }
        });

        Txt_DoctorUN.setText("- New Doctor Username -");
        Txt_DoctorUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DoctorUNActionPerformed(evt);
            }
        });

        Txt_DoctorPw.setText("- New Doctor Password -");

        Btn_NewDoctor.setText("Add New Doctor");
        Btn_NewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewDoctorActionPerformed(evt);
            }
        });

        Txt_DoctorSn.setText("- New Doctor Surname -");

        Txt_DoctorStreetNum.setText("- New Doctor Street Number -");

        Txt_DoctorStreetName.setText("- New Doctor Street Name -");

        Txt_DoctorC.setText("- New Doctor Address City -");

        Txt_DoctorPc.setText("- New Doctor Postcode -");

        Btn_NewAdmin2.setText("Add New Secratery");
        Btn_NewAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewAdmin2ActionPerformed(evt);
            }
        });

        Txt_SecrateryFN.setText("- New Secratery FirstName -");
        Txt_SecrateryFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SecrateryFNActionPerformed(evt);
            }
        });

        Txt_SecraterySn.setText("- New Secratery Surname -");

        Txt_SecrateryStreetNum.setText("- New Secratery Street Number -");

        Txt_SecrateryStreetName.setText("- New Secratery Street Name -");
        Txt_SecrateryStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SecrateryStreetNameActionPerformed(evt);
            }
        });

        Txt_SecrateryC.setText("- New Secratery Address City -");

        Txt_SecrateryPc.setText("- New Secratery Postcode -");

        Txt_SecrateryUN.setText("- New Secratery Username -");

        Txt_SecrateryPw.setText("- New Secratery Password -");
        Txt_SecrateryPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SecrateryPwActionPerformed(evt);
            }
        });

        Txt_DoctorFN.setText("- New Doctor FirstName -");

        Cmb_DoctorView.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select a doctor to view -" }));
        Cmb_DoctorView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_DoctorViewActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Lst_DoctorPatientComments);

        Txt_DoctorRateing.setText("- Doctor Rating -");

        Btn_Feedback.setText("Send Feedback");

        Txt_Feedback.setText("- Feedback -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_Feedback)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cmb_DocorSecName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cmb_DocOrSecSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_ConfirmDocorSecDel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_DelDocOrSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_AdminStreetNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_AdminFN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_AdminSn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_AdminStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_AdminUN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_AdminC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_AdminPw, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(Txt_AdminPc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_NewAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_DoctorStreetNum)
                                    .addComponent(Txt_DoctorFN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_DoctorSn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_DoctorStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_DoctorUN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_DoctorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_DoctorPw)
                                    .addComponent(Txt_DoctorPc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_NewDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_SecrateryStreetNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(Txt_SecrateryFN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Cmb_DoctorView, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Txt_SecrateryStreetName)
                                            .addComponent(Txt_SecraterySn))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txt_SecrateryC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txt_SecrateryUN))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Txt_SecrateryPw)
                                            .addComponent(Txt_SecrateryPc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_NewAdmin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Txt_DoctorRateing))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Btn_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_AdminFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_AdminSn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_AdminPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_AdminUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_AdminStreetNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_AdminStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_AdminC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_AdminPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Btn_NewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_DoctorFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_DoctorStreetNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Btn_NewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_DoctorUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_DoctorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_DoctorPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_DoctorPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_SecrateryFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_SecraterySn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_SecrateryPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_SecrateryUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txt_SecrateryStreetNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_SecrateryStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_SecrateryC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_SecrateryPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Btn_NewAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Txt_DoctorSn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DoctorStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cmb_DoctorView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DoctorRateing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Feedback, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(Txt_Feedback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_DelDocOrSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cmb_DocOrSecSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cmb_DocorSecName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Txt_ConfirmDocorSecDel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DataHandler Data = new DataHandler();
    List_Users U = new List_Users();
    
    public void getData(DataHandler data){
        Data = data;
        U = Data.getU();
       
        Deny();
        
        int DLength = U.doctorList.size();
        String[] Doctor = new String[DLength];

        for(int x = 0; x < DLength; x++){
            Doctor[x] = U.doctorList.get(x).getDoctor_FirstName() + " " + U.doctorList.get(x).getDoctor_SurName();
            Doctor = Arrays.copyOf(Doctor, Doctor.length + 1);
            Cmb_DoctorView.addItem(Doctor[x]);
        }
        
    }
    private void SetData(){
//Remove options        
        Cmb_DocorSecName.removeAllItems();
//Add       
    String DefultItem = "- Who would you like to remove -";
    Cmb_DocorSecName.addItem(DefultItem);
    String what = String.valueOf(Cmb_DocOrSecSelect.getSelectedItem());  
    if(what.equals("Doctor")){
        int DLength = U.doctorList.size();
        String[] Doctor = new String[DLength];

        for(int x = 0; x < DLength; x++){
            Doctor[x] = U.doctorList.get(x).getDoctor_FirstName() + " " + U.doctorList.get(x).getDoctor_SurName();
            Doctor = Arrays.copyOf(Doctor, Doctor.length + 1);
            Cmb_DocorSecName.addItem(Doctor[x]);
        }
    } else if(what.equals("Secratery")) {
                int DLength = U.secreteryList.size();
        String[] Secretary = new String[DLength];

        for(int x = 0; x < DLength; x++){
            Secretary[x] = U.secreteryList.get(x).getSecretary_FirstName()+ " " + U.secreteryList.get(x).getSecretary_SurName();
            Secretary = Arrays.copyOf(Secretary, Secretary.length + 1);
            Cmb_DocorSecName.addItem(Secretary[x]);
    }
    }
    }
    private void Btn_NewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewAdminActionPerformed
        String firstname = Txt_AdminFN.getText();
        String surname = Txt_AdminSn.getText();
        String user = Txt_AdminUN.getText();
        String pass = Txt_AdminPw.getText();
        String streetnumber = Txt_AdminStreetNum.getText();
        String city = Txt_AdminC.getText();
        String post = Txt_AdminPc.getText();
        String streetname = Txt_AdminStreetName.getText();
        String type = "A";
        
        
        
        try {
            Data.AddPerson(type, firstname, surname, streetnumber, streetname, city, post, user, pass);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();       
    }//GEN-LAST:event_Btn_NewAdminActionPerformed
    private void Btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogOutActionPerformed
        GUI_Home re = new GUI_Home();
        re.GetUser(Data);
        re.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_LogOutActionPerformed
    private void Txt_AdminFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_AdminFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_AdminFNActionPerformed
    private void Cmb_DocOrSecSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_DocOrSecSelectActionPerformed
        Cmb_DocorSecName.setEditable(true);
        SetData();
    }//GEN-LAST:event_Cmb_DocOrSecSelectActionPerformed
    private void Btn_DelDocOrSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DelDocOrSecActionPerformed
        String input = Txt_ConfirmDocorSecDel.getText();
        if(input.equals("CONFIRM")){
            System.out.println("check 1");
            String what = String.valueOf(Cmb_DocOrSecSelect.getSelectedItem());
            if(what.equals("Doctor")){
                System.out.println("check 2");
                int DLength = U.doctorList.size();
                String[] Doctor = new String[DLength];
                for(int x = 0; x < DLength; x++){
                    String FN = U.doctorList.get(x).getDoctor_FirstName();
                    String SN = U.doctorList.get(x).getDoctor_SurName();
                    String Name = FN + " " + SN;
                    if(Name.equals(String.valueOf(Cmb_DocorSecName.getSelectedItem()))){
                        try {
                            Data.editDeletePerson("D", x);
                            int left = DLength - x;
                            x = x + left;
                        } catch (IOException ex) {
                            Logger.getLogger(GUI_Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } else if(what.equals("Secratery")) {
                int SLength = U.secreteryList.size();
                String[] Secretary = new String[SLength];

                for(int x = 0; x < SLength; x++){
                    String FN = U.secreteryList.get(x).getSecretary_FirstName();
                    String SN = U.secreteryList.get(x).getSecretary_SurName();
                    String Name = FN + " " + SN;
                    if(Name.equals(String.valueOf(Cmb_DocorSecName.getSelectedItem()))){
                        try {
                            Data.editDeletePerson("S", x);
                            int left = SLength - x;
                            x = x + left;
                        } catch (IOException ex) {
                            Logger.getLogger(GUI_Admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                } 
            }
            reset();
        }
    }//GEN-LAST:event_Btn_DelDocOrSecActionPerformed
    private void Btn_NewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewDoctorActionPerformed
        String firstname = Txt_DoctorFN.getText();
        String surname = Txt_DoctorSn.getText();
        String user = Txt_DoctorUN.getText();
        String pass = Txt_DoctorPw.getText();
        String streetnumber = Txt_DoctorStreetNum.getText();
        String city = Txt_DoctorC.getText();
        String post = Txt_DoctorPc.getText();
        String streetname = Txt_DoctorStreetName.getText();
        String type = "D";        
        try {
            Data.AddPerson(type, firstname, surname, streetnumber, streetname, city, post, user, pass);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();  
        
        
        
        
        
        
    }//GEN-LAST:event_Btn_NewDoctorActionPerformed
    private void Btn_NewAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewAdmin2ActionPerformed
        String firstname = Txt_SecrateryFN.getText();
        String surname = Txt_SecraterySn.getText();
        String user = Txt_SecrateryUN.getText();
        String pass = Txt_SecrateryPw.getText();
        String streetnumber = Txt_SecrateryStreetNum.getText();
        String city = Txt_SecrateryC.getText();
        String post = Txt_SecrateryPc.getText();
        String streetname = Txt_SecrateryStreetName.getText();
        String type = "S";        
        try {
            Data.AddPerson(type, firstname, surname, streetnumber, streetname, city, post, user, pass);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();  
    }//GEN-LAST:event_Btn_NewAdmin2ActionPerformed
    private void Txt_SecrateryFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SecrateryFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SecrateryFNActionPerformed
    private void Txt_DoctorUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DoctorUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DoctorUNActionPerformed
    private void Txt_SecrateryPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SecrateryPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SecrateryPwActionPerformed
    private void Txt_SecrateryStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SecrateryStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SecrateryStreetNameActionPerformed
    private void Cmb_DoctorViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_DoctorViewActionPerformed
        Lst_DoctorPatientComments.removeAll();
        Txt_DoctorRateing.setText("- Doctor Rating -");

//Cmb_DoctorView
        int RLength = U.ratingList.size();
        String[] Comment = new String[RLength];
        int Check = Cmb_DoctorView.getSelectedIndex();
        double[] ratings = new double[RLength];
        DefaultListModel DLM = new DefaultListModel();
        
        for(int x = 0; x < RLength; x++){
            if(Check == U.ratingList.get(x).getDoctor_ID()){
                Comment[x] = U.ratingList.get(x).getPatient_comment();
                ratings[x] = U.ratingList.get(x).getRating();
            }
        }
        for(int y = 0; y < Comment.length; y++){    
            DLM.addElement(Comment[y]);
        }
        double totalRating = 0;
        int added = 0;
        for(int z = 0; z < ratings.length; z++){
            if(ratings[z] == 0.0){
                
            } else {
            totalRating = totalRating + ratings[z];
            added = added +1;
            }
        }
        double endrating = totalRating/added;
       if(added == 0){
           endrating = 0.0;
       }
        Txt_DoctorRateing.setText(String.valueOf(endrating));
        Lst_DoctorPatientComments.setModel(DLM);
    }//GEN-LAST:event_Cmb_DoctorViewActionPerformed
    private void reset(){
        GUI_Admin re = new GUI_Admin();
        re.getData(Data);
        re.setVisible(true);
        this.dispose();
    } 
    private void Deny(){
        Cmb_DocorSecName.setEditable(false);
        
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
            java.util.logging.Logger.getLogger(GUI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DelDocOrSec;
    private javax.swing.JButton Btn_Feedback;
    private javax.swing.JButton Btn_LogOut;
    private javax.swing.JButton Btn_NewAdmin;
    private javax.swing.JButton Btn_NewAdmin2;
    private javax.swing.JButton Btn_NewDoctor;
    private javax.swing.JComboBox<String> Cmb_DocOrSecSelect;
    private javax.swing.JComboBox<String> Cmb_DocorSecName;
    private javax.swing.JComboBox<String> Cmb_DoctorView;
    private javax.swing.JList<String> Lst_DoctorPatientComments;
    private javax.swing.JTextField Txt_AdminC;
    private javax.swing.JTextField Txt_AdminFN;
    private javax.swing.JTextField Txt_AdminPc;
    private javax.swing.JTextField Txt_AdminPw;
    private javax.swing.JTextField Txt_AdminSn;
    private javax.swing.JTextField Txt_AdminStreetName;
    private javax.swing.JTextField Txt_AdminStreetNum;
    private javax.swing.JTextField Txt_AdminUN;
    private javax.swing.JTextField Txt_ConfirmDocorSecDel;
    private javax.swing.JTextField Txt_DoctorC;
    private javax.swing.JTextField Txt_DoctorFN;
    private javax.swing.JTextField Txt_DoctorPc;
    private javax.swing.JTextField Txt_DoctorPw;
    private javax.swing.JTextField Txt_DoctorRateing;
    private javax.swing.JTextField Txt_DoctorSn;
    private javax.swing.JTextField Txt_DoctorStreetName;
    private javax.swing.JTextField Txt_DoctorStreetNum;
    private javax.swing.JTextField Txt_DoctorUN;
    private javax.swing.JTextField Txt_Feedback;
    private javax.swing.JTextField Txt_SecrateryC;
    private javax.swing.JTextField Txt_SecrateryFN;
    private javax.swing.JTextField Txt_SecrateryPc;
    private javax.swing.JTextField Txt_SecrateryPw;
    private javax.swing.JTextField Txt_SecraterySn;
    private javax.swing.JTextField Txt_SecrateryStreetName;
    private javax.swing.JTextField Txt_SecrateryStreetNum;
    private javax.swing.JTextField Txt_SecrateryUN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}