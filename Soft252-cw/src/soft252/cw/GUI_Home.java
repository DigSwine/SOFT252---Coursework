// @author mwilson-slider

package soft252.cw;

import java.awt.event.WindowEvent;
import static javax.swing.JOptionPane.showMessageDialog;

public class GUI_Home extends javax.swing.JFrame {

    // Creates new form GUI_Home     
    public GUI_Home() {
        initComponents();
        SetLogins();
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
    
    
     //Functionality
    String Username[] = new String[8];
    String Password[] = new String[8];
    String Type[] = new String[8];
    
    private void SetLogins(){
        Username[0] = ("1"); 
        Username[1] = ("2");
        Username[2] = ("3");
        Username[3] = ("4");
        Username[4] = ("5");
        Username[5] = ("6");
        Username[6] = ("7");
        Username[7] = ("8");   
        
        Type[0] = ("P");
        Type[1] = ("P");
        Type[2] = ("P");
        Type[3] = ("D");
        Type[4] = ("D");
        Type[5] = ("D");
        Type[6] = ("S");
        Type[7] = ("A");
        
        Password[0] = ("1");
        Password[1] = ("1");
        Password[2] = ("1");
        Password[3] = ("1");
        Password[4] = ("1");
        Password[5] = ("1");
        Password[6] = ("1");
        Password[7] = ("1");
    }
    
    private void Btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogInActionPerformed

        //Get Combobox item
        String SelectedUser = Cmb_UserType.getSelectedItem().toString();

        //output
        if("Patient".equals(SelectedUser)){
        //Validation
        for(int x = 0; x < 8; x++){
            if(Txt_Username.getText().equals(Username[x])){
                if(Type[x].equals("P")){
                    if(Txt_Password.getText().equals(Password[x])){
                       
                        //Open New Window
                        GUI_User Next = new GUI_User();
                        Next.show();
                        
                        //Close Window
                        //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); 
                    }
                } 
            }        
        }   
    }
        
        
        if("Doctor".equals(SelectedUser)){
          //Validation
//        for(int x = 0; x < 8; x++){
//            if(Txt_Username.getText().equals(Username[x])){
//                if(Type[x].equals("D")){
//                    if(Txt_Password.getText().equals(Password[x])){
//                       
//                        //Open New Window
//                        GUI_Doctor Next = new GUI_Doctor();
//                        Next.show();
                        
                        //Close Window
                        //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); 
//                    }
//                } 
//            }        
        }  
        if("Secetery".equals(SelectedUser)){
           //Validation
//        for(int x = 0; x < 8; x++){
//            if(Txt_Username.getText().equals(Username[x])){
//                if(Type[x].equals("S")){
//                    if(Txt_Password.getText().equals(Password[x])){
//                       
                        //Open New Window
//                        GUI_User Next = new GUI_User();
//                        Next.show();
                        
                        //Close Window
                        //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); 
//                    }
//                } 
//            }        
//        } 
        }
        if("Admin".equals(SelectedUser)){
         //Validation
//        for(int x = 0; x < 8; x++){
//            if(Txt_Username.getText().equals(Username[x])){
//                if(Type[x].equals("A")){
//                    if(Txt_Password.getText().equals(Password[x])){
                       
                        //Open New Window
//                        GUI_User Next = new GUI_User();
//                        Next.show();
                        
                        //Close Window
                        //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); 
//                    }
//                } 
//            }        
//        }   
//        }        
                 
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
