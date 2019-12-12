// @author mwilson-slider

package soft252.cw.GUI;

import soft252.cw.Classes.List_Users;


public class GUI_Home extends javax.swing.JFrame {

    //Functionality
    List_Users U = new List_Users();  
    String Username[];
    String Password[];
    String Type[];
    
    public void GetUser(List_Users Users){
        U = Users;
        Username = new String[U.doctorList.size() + U.patientList.size() + U.secreteryList.size() + U.adminList.size() + 1];
        Password = new String[U.doctorList.size() + U.patientList.size() + U.secreteryList.size() + U.adminList.size() + 1];
        Type = new String[U.doctorList.size() + U.patientList.size() + U.secreteryList.size() + U.adminList.size() + 1];
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
        LengthOfUsers = U.doctorList.size() + U.patientList.size() + U.secreteryList.size() + U.adminList.size();
        int count = 0;
//Usernames
    //patients
        for(Integer x = 0; x <= LengthOfUsers; x++){
            if(x < U.patientList.size()){
                Username[x] = U.patientList.get(x).getPatient_Username();
            }
    //doctors
            if(x > U.patientList.size()){
                if(x <=U.patientList.size() + U.doctorList.size()){
                Username[x] = U.doctorList.get(x - x + count).getDoctor_User();
                count++;
                }
    //admin
            if(x > U.patientList.size() + U.doctorList.size()){
                count = 0;
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size()){
                Username[x] = U.adminList.get(x - x + count).getAdmin_Username();
                count++;
                }
    //Secretary
            if(x > U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size() + U.secreteryList.size()){
                Username[x] = U.secreteryList.get(x - x).getSecretary_Username();
                }
            }
            }
        }
        }
        count = 0;
        
//Type
    //patients
        for(Integer x = 0; x <= LengthOfUsers; x++){
            if(x < U.patientList.size()){
                Type[x] = "P";
            }
    //doctors
            if(x > U.patientList.size()){
                if(x <=U.patientList.size() + U.doctorList.size()){
                Type[x] = "D";
                count++;
                }
    //admin
            if(x > U.patientList.size() + U.doctorList.size()){
                count = 0;
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size()){
                Type[x] = "A";
                count++;
                }
    //Secretary
            if(x > U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size() + U.secreteryList.size()){
                Type[x] = "S";
                }
            }
            }
        }
        }
        count = 0;
                        
//Passwords    
        //patients
        for(Integer x = 0; x <= LengthOfUsers; x++){
            if(x < U.patientList.size()){
                Password[x] = U.patientList.get(x).getPatient_Password();
            }
    //doctors
            if(x > U.patientList.size()){
                if(x <=U.patientList.size() + U.doctorList.size()){
                    Password[x] = U.doctorList.get(x - x + count).getDoctor_Password();
                    count++;
                }
    //admin
            if(x > U.patientList.size() + U.doctorList.size()){
                count = 0;
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size()){
                Password[x] = U.adminList.get(x - x + count).getAdmin_Password();
                count++;
                }
    //Secretary
            if(x > U.patientList.size() + U.doctorList.size() + U.secreteryList.size()){
                if(x <= U.patientList.size() + U.doctorList.size() + U.adminList.size() + U.secreteryList.size()){
                Password[x] = U.secreteryList.get(x - x).getSecretary_Password();
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
                            GUI_User.GetUser(U);
                            Next.show();
                            this.hide();
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
                           Doc.show();
                           this.hide();
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
//                        GUI_User Sec = new GUI_User();
//                        Sec.show(); 
                            this.hide();
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
//                        GUI_User Next = new GUI_User();
//                        Next.show();
                            this.hide();
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
