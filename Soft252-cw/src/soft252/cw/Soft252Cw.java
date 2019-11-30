// @author mwilson-slider

package soft252.cw;

import soft252.cw.GUI.GUI_Home;
import soft252.cw.Classes.Appointments;
import soft252.cw.Classes.Clinic;
import soft252.cw.Classes.Perscriptions;
import soft252.cw.Classes.Doctors;





//Data Imports
import java.io.*;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 

        
        
public class Soft252Cw 
{

    public static void main(String[] args) throws IOException 
    {
        // Set Defult Data
        String content = 
            "D, Kimberly, Brook, 123, Shorsberry Avanue, Plymouth, PL3 3TD, KBrook, 12345\n"
            + "D, Drew, Valintine, 10, Shortway Road, Plymouth, PL1 1WL, DValintine, 12345\n"
            + "D, Bob, Ross, 15, Golden Street, Plymouth, PL4 4DX, BRoss, 12345\n"
            + "P, David, Charger, Male, 54, 99, Long Road, Plymouth, PL5 2RT, DCharger, 12345\n"
            + "P, Kimberly, Little, Female, 23, 12, Foxwood Road, Plymouth, PL2 4DZ, KLittle, 1212\n"
            + "P, Luke, Walker, Male, 17, 23, Berry Road, Plymouth, PL1 2BR, LWalker, 123123\n"
            + "A, Karran, Southbank, 29, Hallow Way, Plymouth, PL8 9KL\n"
            + "S, Shallisa, Beonce, 100, Deo Lane, Plymouth, PL3 2DO\n"
            + "C, MadeUp Pharmacy, 50, Long Road, Plymouth, PL5 2RT\n"
            + "CD, Paracetomol, 1.50, Over The Counter - Drug, 12 Tablets, Releaves Pain, 100\n"
            + "CD, Ibuprofen, 1.25, Over The Counter - Drug, 12 Tablets, Releaves Pain, 100\n"
            + "CD, Epipen, 5.00, Over The Counter  - Drug, 1 use, Emergancy Useage, 100\n"
            + "CD, Norflex, 10.00, Perscription  - Drug, 26 Tablets, Muscle Relaxer, 100\n"
            + "CD, Calcium Carbonate, 3.50, Over The Counter  - Drug, 20 Tablets, prevent or to treat a calcium deficiency, 100\n"
            + "CD, Morphine, 12.00, Perscription  - Drug, 10 Patches,  Treats moderate to severe pain, 100\n"
            + "CD, Beclomethasone Nasal, 5.50, Over The Counter  - Drug, Nasle Spray - 24 Sprays, prevent hayfeaver allergies, 100\n"
            + "CD, Opium Tincture, 3.50, Perscription  - Drug, 5 Tablets, used to treat diarrhea, 100\n"
            + "CD, Dextroamphetamine, 1.50, Perscription  - Drug, 20 Tablets,  used to treat narcolepsy and ADHD, 100\n"
            + "CD, Baclofene, 3.50, Perscription  - Drug, 24 Tablets, muscle relaxer and an antispasmodic agent, 100\n"
            + "AP, 0003, 0002, This patient is suffering from hayfever\n"
            + "PP, 0003, 0007, Beclomethasone Nasal, 1, 1\n";
      
      //Create Data File
        File file = new File("Data.txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();

        
        //DataReader
BufferedReader reader;
			reader = new BufferedReader(new FileReader("Data.txt"));
			
                        
                        
                        
//                      //Get First Line
                        String line = reader.readLine();
                        
                        
                        

                        
                        String FirstName = "Unknown";
                        String SurName = "Unknown";
                        String Gender = "Unknown";
                        String Age = "Unknown";
                        String HAddress = "Unknown";
                        String SName = "Unknown";
                        String CName = "Unknown";
                        String PC = "Unknown";
                        String User = "Unknown";
                        String Pass = "Unknown";
                        
                        while (line != null) {
                        char a = line.charAt(0);
                        char b = line.charAt(1);
                        char c = line.charAt(2);
                        char letterone = line.charAt(3);
                        char lettertwo = line.charAt(4);
                        //check to first and second letter of the line
                        //Doctors
                        if(a == 'D'){
                            if(b == ','){
                                System.out.println(line);
                                int y = 0;
                                //Set FirstName
                                FirstName = String.valueOf(letterone);
                                for(int x = 4; x < 1000; x++){      
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        FirstName = FirstName + String.valueOf(letterone);
                                        lettertwo = line.charAt(x + 1);
                                        y = x + 3; 
                                    }
                                }
                                //Set SurName
                                letterone = line.charAt(y);
                                SurName = String.valueOf(letterone);
                                lettertwo = line.charAt(y+1);
                                for(int x = y + 1; x < 1000; x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        SurName = SurName + String.valueOf(letterone);
                                        lettertwo = line.charAt(x + 1);
                                        y = x + 3;
                                    }
                                }
                                //Set Street Address
                                letterone = line.charAt(y);
                                HAddress = String.valueOf(letterone);
                                lettertwo = line.charAt(y  + 1);
                                for(int x = y + 1; x < 1000; x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        HAddress = HAddress + String.valueOf(letterone);
                                        lettertwo = line.charAt(x + 1);
                                        y = x + 3;
                                    }
                                }
                                //Set Street Name
                                letterone = line.charAt(y);
                                SName = String.valueOf(letterone);
                                lettertwo = line.charAt(y  + 1);
                                for(int x = y + 1; x < 1000; x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        SName = SName + String.valueOf(letterone);
                                        lettertwo = line.charAt(x + 1);
                                        y = x + 3;
                                    }
                                }
                                //Set City Name
                                letterone = line.charAt(y);
                                CName = String.valueOf(letterone);
                                lettertwo = line.charAt(y  + 1);
                                for(int x = y + 1; x < 1000; x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        CName = CName + String.valueOf(letterone);
                                        lettertwo = line.charAt(x + 1);
                                        y = x + 3;
                                    }
                                }
                                 //Set Post Code
                                letterone = line.charAt(y);
                                PC = String.valueOf(letterone);
                                lettertwo = line.charAt(y + 1);
                                for(int x = y + 1; x < line.length(); x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        PC = PC + String.valueOf(letterone);

                                       lettertwo = line.charAt(x + 1);
                                    }
                                }
                                //Set User
                                letterone = line.charAt(y);
                                User = String.valueOf(letterone);
                                lettertwo = line.charAt(y + 1);
                                for(int x = y + 1; x < line.length(); x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        User = User + String.valueOf(letterone);

                                      // lettertwo = line.charAt(x + 1);
                                    }
                                }
                                //Set Pass
                                letterone = line.charAt(y);
                                User = String.valueOf(letterone);
                                lettertwo = line.charAt(y + 1);
                                for(int x = y + 1; x < line.length(); x++){
                                    if(lettertwo != ','){
                                        letterone = line.charAt(x);
                                        User = User + String.valueOf(letterone);

                                      // lettertwo = line.charAt(x + 1);
                                }
                                
                                
                                
                                
                                
                                
                              
                                
                                Doctors Doc;
                                Doc = new Doctors(FirstName, SurName, HAddress, SName, CName, PC, User, Pass);
                              
                                System.out.println("D, " + Doc.getDoctor_FirstName() + " " + Doc.getDoctor_SurName() + " " + Doc.getDoctor_StreetNumber() + " " + Doc.getDoctor_StreetName() + " " + Doc.getDoctor_City() + " " + Doc.getDoctor_Postcode() + " " + Doc.getDoctor_User() + " " + Doc.getDoctor_Password());
                            }
                        }
//                        //Patients
//                        if(a == 'P'){
//                            if(b ==','){
//                                System.out.println(a + "" + b);
//                            }
//                        }
//                        //Admin
//                        if(a == 'A'){
//                            if(b ==','){
//                                System.out.println(a + "" + b);
//                            }
//                        }
//                        //Secretary
//                        if(a == 'S'){
//                            if(b ==','){
//                                System.out.println(a + "" + b);
//                            }
//                        }
//                        //Clinic
//                        if(a == 'C'){
//                            if(b ==','){
//                                System.out.println(a + "" + b);
//                            }
//                        }
//                        //Clinic Drugs
//                        if(a == 'C'){
//                            if(b =='D'){
//                                if(c == ','){
//                                System.out.println(a + "" + b + "" + c);
//                                }
//                            }
//                        }
//                        
//                        //Appointment 
//                        if(a == 'A'){
//                            if(b =='P'){
//                                if(c == ','){
//                                System.out.println(a + "" + b + "" + c);
//                                }
//                            }
//                        }
//                        
//                        
//                        //Perscriptions
//                        if(a == 'P'){
//                            if(b =='P'){
//                                if(c == ','){
//                                System.out.println(a + "" + b + "" + c);
//                                }
//                            }
//                        }

                        //Set Next Line
                        line = reader.readLine();
        }
    //Open GUI
    GUI_Home Home = new GUI_Home();
    Home.show();               
                        
    }
}
}