// @author mwilson-slider

package soft252.cw.GUI;

import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import soft252.cw.Classes.DataHandler;
import soft252.cw.Classes.List_Users;

public class GUI_Home extends javax.swing.JFrame {
    //Functionality
    List_Users U = new List_Users();  
    DataHandler Data = new DataHandler();
    String Username[];
    String Password[];
    String Type[];
    
    public void GetUser(DataHandler data){
        Data = data;
        U = Data.getU();
        int number = U.doctorList.size() + U.patientList.size() + U.secreteryList.size() + U.adminList.size() + 1;        
        Username = new String[number];
        Password = new String[number];
        Type = new String[number];
        SetLogins();
    }
    
    // Creates new form GUI_Home 
    public GUI_Home() {
        initComponents();
    }

    //DONT TOUCH!!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cmb_UserType = new javax.swing.JComboBox<>();
        Btn_LogIn = new javax.swing.JButton();
        Txt_Password = new javax.swing.JTextField();
        Txt_Username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cmb_UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Secetery", "Admin" }));
        Cmb_UserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_UserTypeActionPerformed(evt);
            }
        });

        Btn_LogIn.setText("Log In");
        Btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogInActionPerformed(evt);
            }
        });

        Txt_Password.setText("Password");
        Txt_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Txt_Username.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cmb_UserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cmb_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_LogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //NOPE

    public void SetLogins(){
        int LengthOfUsers = 0;
        LengthOfUsers = Username.length - 1;
        int count = 0;
        int counts = 0;
        int counta = 0;
//Usernames
    //patients
        for(Integer x = 0; x < LengthOfUsers; x++){
            if(x < U.patientList.size()){
                Username[x] = U.patientList.get(x).getPatient_Username();
            } else {
    //doctors
            if(x >= U.patientList.size()){
                if(x < U.patientList.size() + U.doctorList.size()){
                    Username[x] = U.doctorList.get(x - U.patientList.size()).getDoctor_User();
                    count++;
                } else {
    //Secretary
                if(x < U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                    if(x <= U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                    Username[x] = U.secreteryList.get(x - x + counts).getSecretary_Username();
                    counts++;
                    }
                } else {
                        //admin
                    if(x < U.patientList.size() + U.doctorList.size() + U.secreteryList.size() + U.adminList.size()){
                        if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size()){
                            Username[x] = U.adminList.get(x - x + counta).getAdmin_Username();
                            counta++;
                        }
                    }
                    }
                }
            }
        }
    }
        
        count = 0;
        counta = 0;
        counts = 0;
        
//Type
    //patients
        for(Integer x = 0; x < LengthOfUsers; x++){
            if(x < U.patientList.size()){
                Type[x] = "P";
            } else {
    //doctors
            if(x >= U.patientList.size()){
                if(x < U.patientList.size() + U.doctorList.size()){
                Type[x] = "D";
                count++;
                } else {
                    //Secretary
                    if(x < U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                        if(x <  U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                            Type[x] = "S";
                            counts++;
                        }
                        } else {
                            if(x > U.patientList.size() + U.doctorList.size()){
                                if(x < U.patientList.size() + U.doctorList.size() + U.adminList.size() + U.secreteryList.size()){
                                    Type[x] = "A";
                                    counta++;
                                }
                            }
                        }
                    }
                }
            }
        }
        count = 0;
        counta = 0;
        counts = 0;
                  
//Passwords    
        //patients
        for(Integer x = 0; x < LengthOfUsers; x++){
            if(x < U.patientList.size()){
                Password[x] = U.patientList.get(x).getPatient_Password();
            } else {
    //doctors
            if(x >= U.patientList.size()){
                if(x < U.patientList.size() + U.doctorList.size()){
                    Password[x] = U.doctorList.get(x - x + count).getDoctor_Password();
                    count++;
                } else {
                    //Secratery
                if(x < U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                    if(x <= U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                            Password[x] = U.secreteryList.get(x - x + counts).getSecretary_Password();
                            counts++;
                        }
                    } else {
                                        //admin
            if(x >= U.patientList.size() + U.doctorList.size()){
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size() + U.adminList.size()){
                    Password[x] = U.adminList.get(x - x + counta).getAdmin_Password();
                    counta++;
                }
            }
                    }
                }
            }
            

        }
        }
        count=0;
        
    }
       
    private void Btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogInActionPerformed
    int LengthOfUsers = 0;
        LengthOfUsers = U.doctorList.size() + U.patientList.size() + U.secreteryList.size() + U.adminList.size();        
//Get Combobox item
        String SelectedUser = Cmb_UserType.getSelectedItem().toString();
        
        //output
        if("Patient".equals(SelectedUser)){
        //Validation
            for(int x = 0; x <= LengthOfUsers; x++){
                if(Txt_Username.getText().equals(Username[x])){
                    if(Type[x].equals("P")){
                        if(Txt_Password.getText().equals(Password[x])){
                            //Open New Window
                            GUI_User Next = new GUI_User();
                            Next.GetHandler(Data, x + 1);
                            Next.setVisible(true);
                            this.dispose();
                        }
                    }
                }
            }
        }
        
        if("Doctor".equals(SelectedUser)) {
           for(int x = 0; x <= LengthOfUsers; x++){
               if(Txt_Username.getText().equals(Username[x])){
                    if(Type[x].equals("D")){
                        if(Txt_Password.getText().equals(Password[x])){
                           GUI_Doctor Doc = new GUI_Doctor();
                           Doc.GetData(Data);
                           Doc.GetDId(x - U.patientList.size());
                            try {
                                Doc.setappts();
                            } catch (ParseException ex) {
                                Logger.getLogger(GUI_Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           Doc.setVisible(true);
                           this.dispose();
                        }           
                    }
               }
            }
        }
        
        if("Secetery".equals(SelectedUser)){
            //Validation
            for(int x = 0; x <= LengthOfUsers; x++){
                if(Txt_Username.getText().equals(Username[x])){
                    if(Type[x].equals("S")){
                        if(Txt_Password.getText().equals(Password[x])){
                            //Open New Window
                            GUI_Secratery Sec = new GUI_Secratery();
                            Sec.GetData(Data);
                            Sec.GetId(x - U.patientList.size() - U.doctorList.size() - 1);
                            Sec.setVisible(true);
                            this.dispose();
                        }
                    } 
                }        
            }
        }

        if("Admin".equals(SelectedUser)){
         //Validation
            for(int x = 0; x <= LengthOfUsers; x++){
                if(Txt_Username.getText().equals(Username[x])){
                    if(Type[x].equals("A")){
                        if(Txt_Password.getText().equals(Password[x])){
                        //Open New Window
                        GUI_Admin Next = new GUI_Admin();
                        Next.getData(Data);
                        Next.setVisible(true);
                        this.dispose();
                        }
                    } 
                }        
            }   
        }              
    }//GEN-LAST:event_Btn_LogInActionPerformed

    private void Cmb_UserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_UserTypeActionPerformed
    
    }//GEN-LAST:event_Cmb_UserTypeActionPerformed

  
   
    public static void main(String args[]) {
       //Display Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Home().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_LogIn;
    private javax.swing.JComboBox<String> Cmb_UserType;
    private javax.swing.JTextField Txt_Password;
    private javax.swing.JTextField Txt_Username;
    // End of variables declaration//GEN-END:variables
}
