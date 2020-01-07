// @author mwilson-slider
package soft252.cw.GUI;

import java.sql.Time;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import javax.swing.DefaultListModel;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;

public class GUI_UserAppointmentRequest extends javax.swing.JFrame {

    public GUI_UserAppointmentRequest() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btn_Cancel = new javax.swing.JButton();
        Btn_BookAppt = new javax.swing.JButton();
        Cmb_Doctor = new javax.swing.JComboBox<>();
        Cmb_Day = new javax.swing.JComboBox<>();
        Cmb_Month = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_Avalibility = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient Appointment Request");

        Btn_Cancel.setText("Cancel");
        Btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelActionPerformed(evt);
            }
        });

        Btn_BookAppt.setText("Book Appointment");

        Cmb_Doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Doctor-" }));
        Cmb_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_DoctorActionPerformed(evt);
            }
        });

        Cmb_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Day-" }));
        Cmb_Day.setToolTipText("");
        Cmb_Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_DayActionPerformed(evt);
            }
        });

        Cmb_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Month-" }));
        Cmb_Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_MonthActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Lst_Avalibility);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Cancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_BookAppt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cmb_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cmb_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cmb_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Cancel)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cmb_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Btn_BookAppt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private List_Users U = new List_Users();
    private Lists_AP AP = new Lists_AP();
    private DataHandler Data = new DataHandler();
    
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int day = 0;
    int month = 0;   
    int year = 0;
    
    public void Onload(DataHandler data){
        Data = data;
        U = Data.getU();
        AP = Data.getAP();
    //Doc Cmb    
        int DocLength = U.doctorList.size();
        String FName = " ";
        String SName = " ";
        for(int x = 0; x < DocLength; x++){
        FName = U.doctorList.get(x).getDoctor_FirstName();
        SName = U.doctorList.get(x).getDoctor_SurName();
        Cmb_Doctor.addItem(FName + " " + SName);
        }
    //Mth Cmb
        month = localDate.getMonthValue();
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
                    Cmb_Month.addItem(monthstg[y - 1]);
                }  
            }
        }
    //Cmb_Day    
        int MLength = localDate.lengthOfMonth();
        String[] Days = new String[1];
        for(int x = 0; x < MLength; x++){
            Days[x] = String.valueOf(x + 1);
            Days = Arrays.copyOf(Days, Days.length + 1);
            Cmb_Day.addItem(Days[x]);
        }
    //Year
        year = localDate.getYear();
        DisableAll();
        
        
    }  
    
    private void Btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_CancelActionPerformed

    private void Cmb_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_DoctorActionPerformed
        DisableAll();
        Cmb_Month.enable();
    }//GEN-LAST:event_Cmb_DoctorActionPerformed

    private void Cmb_MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_MonthActionPerformed
        Cmb_Day.enable();
    }//GEN-LAST:event_Cmb_MonthActionPerformed

    private void Cmb_DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_DayActionPerformed
        int thedoc = Cmb_Doctor.getSelectedIndex();
        int themonth = Cmb_Month.getSelectedIndex();
        int theday = Cmb_Day.getSelectedIndex();
        int theyear = year;
        getFreeTimes(thedoc, theday, themonth, theyear);  
    }//GEN-LAST:event_Cmb_DayActionPerformed

    private void getFreeTimes(int doc, int d, int m, int y){
        int Slotsize = 10;
        int Taken = AP.appointmentList.size();
        String[] TheTIME = new String[Slotsize + 1];
               
        int hour = 9;
        int minute = 00;

        DefaultListModel DLM = new DefaultListModel();
        Lst_Avalibility.enable();

        String Date = d + "/" + m + "/" + y;
        String Time = hour + ":" + minute;
        int a = 0;
        int x = 0;
        String[] Dates = new String[1];
        String[] Times = new String[1];
        for(int b = 0; b < Slotsize; b++){
            if(x < Taken){
                Dates[x] = AP.appointmentList.get(x).getAP_Date();
                Dates = Arrays.copyOf(Dates, Dates.length + 1);
                Times[x] = AP.appointmentList.get(x).getAP_Time();
                Times = Arrays.copyOf(Times, Times.length + 1);
                x = x + 1;
            }
        if(Date.equals(Dates[a])){
            System.out.println(Dates.length);
            a = a + 1;
        }
        }
        
        
    Lst_Avalibility.setModel(DLM);
    }
    
    
    
    private void DisableAll(){        
        Cmb_Day.disable();
        Cmb_Month.disable();
        Lst_Avalibility.disable();
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
            java.util.logging.Logger.getLogger(GUI_UserAppointmentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_UserAppointmentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_UserAppointmentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_UserAppointmentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_UserAppointmentRequest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_BookAppt;
    private javax.swing.JButton Btn_Cancel;
    private javax.swing.JComboBox<String> Cmb_Day;
    private javax.swing.JComboBox<String> Cmb_Doctor;
    private javax.swing.JComboBox<String> Cmb_Month;
    private javax.swing.JList<String> Lst_Avalibility;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
