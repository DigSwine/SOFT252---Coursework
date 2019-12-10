// @author mwilson-slider

package soft252.cw;

import soft252.cw.GUI.GUI_Home;
import soft252.cw.Classes.Appointments;
import soft252.cw.Classes.Clinic;
import soft252.cw.Classes.Perscriptions;
import soft252.cw.Classes.Doctors;
import soft252.cw.Classes.Patients;




//Data Imports
import java.io.*;
import java.io.File; 
import soft252.cw.Classes.Admin;
import soft252.cw.Classes.List_Clinic;
import soft252.cw.Classes.List_Users;
import soft252.cw.Classes.Lists_AP;
import soft252.cw.Classes.Secretary;

public class Soft252Cw 
{
    public static void main(String[] args) throws IOException 
    {
       List_Users U = new List_Users();
       List_Clinic C = new List_Clinic();
       Lists_AP AP = new Lists_AP();

       
        // Set Defult Data
        String content = 
            "D, Kimberly, Brook, 123, Shorsberry Avanue, Plymouth, PL3 3TD, KBrook, 12345\n"
            + "D, Drew, Valintine, 10, Shortway Road, Plymouth, PL1 1WL, DValintine, 12345\n"
            + "D, Bob, Ross, 15, Golden Street, Plymouth, PL4 4DX, BRoss, 12345\n"
            + "P, David, Charger, Male, 54, 99, Long Road, Plymouth, PL5 2RT, DCharger, 123456\n"
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
                        //Get First Line
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
                        //Doctors
                        if(a == 'D'){
                            if(b == ','){
//Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String x : arrOfStr){
                                    if (times == 8){
                                        Pass = x;
                                        times = 0;
                                    }
                                    if (times == 7) {
                                        User = x;
                                        times = times + 1;
                                    }
                                    if(times == 6){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if(times == 5){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        SName = x;
                                        times = times +1;
                                    }
                                    if(times == 3){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 2){
                                        SurName = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Doctor       
                                Doctors Doc;
                                Doc = new Doctors(FirstName, SurName, HAddress, SName, CName, PC, User, Pass);
                                U.doctorList.add(Doc);
                                
//Print Doctor Details
                                System.out.println("D, " + Doc.getDoctor_FirstName() + " " + Doc.getDoctor_SurName() + " " + Doc.getDoctor_StreetNumber() + " " + Doc.getDoctor_StreetName() + " " + Doc.getDoctor_City() + " " + Doc.getDoctor_Postcode() + " " + Doc.getDoctor_User() + " " + Doc.getDoctor_Password());
                            }
                        }
                        //Patients
                        if(a == 'P'){
                            if(b ==','){
//Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String x : arrOfStr){
                                    if(times == 10){
                                        Pass = x;
                                    }
                                    if (times == 9){
                                        User = x;
                                        times = times + 1;
                                    }
                                    if (times == 8){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if (times == 7) {
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 6){
                                        SName = x;
                                        times = times + 1;
                                    }
                                    if(times == 5){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        Age = x;
                                        times = times +1;
                                    }
                                    if(times == 3){
                                        Gender = x;
                                        times = times + 1;
                                    }
                                    if(times == 2){
                                        SurName = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                }    
//Create Instance Of Patient                                
                                Patients Pat;
                                Pat = new Patients(FirstName, SurName, Gender, Age, HAddress, SName, CName, PC, User, Pass);
                                U.patientList.add(Pat);
//Print Patient Details                                
                                System.out.println("P, " + Pat.getPatient_Firstname() + " " + Pat.getPatient_Surname() + " " + Pat.getPatient_Gender() + " " + Pat.getPatient_Age() + " " + Pat.getPatient_StreetNumber() + " " + Pat.getPatient_StreetName() + " " + Pat.getPatient_CityName() + " " + Pat.getPatient_PostCode() + " " + Pat.getPatient_Username() + " " + Pat.getPatient_Password());
                            }
                        }
                        //Admin
                        if(a == 'A'){
                            if(b ==','){
//Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String x : arrOfStr){
                                    if(times == 6){
                                        PC = x;
                                        times = 0;
                                    }
                                    if(times == 5){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        SName = x;
                                        times = times +1;
                                    }
                                    if(times == 3){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 2){
                                        SurName = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Admin                                
                                Admin Adm;
                                Adm = new Admin(FirstName, SurName, HAddress, SName, CName, PC);
                                U.adminList.add(Adm);
//Print Admin Details                                         
                                System.out.println("A, " + Adm.getAdmin_FirstName() + " " + Adm.getAdmin_SurName() + " " + Adm.getAdmin_StreetNumber() + " " + Adm.getAdmin_StreetName() + " " + Adm.getAdmin_City() + " " + Adm.getAdmin_PostCode());                 
                            }
                        }
                        //Secretary
                        if(a == 'S'){
                            if(b ==','){
                                //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String x : arrOfStr){
                                    if(times == 6){
                                        PC = x;
                                        times = 0;
                                    }
                                    if(times == 5){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        SName = x;
                                        times = times +1;
                                    }
                                    if(times == 3){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 2){
                                        SurName = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Admin
                                Secretary Sec;
                                Sec = new Secretary(FirstName, SurName, HAddress, SName, CName, PC);
                                U.secreteryList.add(Sec);
//Print Admin Details                                         
                                System.out.println("S, " + Sec.getSecretary_FirstName() + " " + Sec.getSecretary_SurName() + " " + Sec.getSecretary_StreetNumber() + " " + Sec.getSecretary_StreetName() + " " + Sec.getSecretary_City() + " " + Sec.getSecretary_Postcode());                   
                            }
                        }
                        //Clinic
                        if(a == 'C'){
                            if(b ==','){
                                //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
                                    if(times == 5){
                                        PC = x;
                                        times = 0;
                                    }
                                    if(times == 4){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        SName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Clinic
                                Clinic Cli;
                                Cli = new Clinic(FirstName, HAddress, SName, CName, PC);
                                C.clinicList.add(Cli);
//Print Clinic Details
                                System.out.println("C, " + Cli.getClinic_Name() + " " + Cli.getClinic_StreetNumber() + " " + Cli.getClinic_StreetName() + " " + Cli.getClinic_City() + " " + Cli.getClinic_PostCode());  
                            }
                        }
                        //Clinic Drugs
                        if(a == 'C'){
                            if(b =='D'){
                                if(c == ','){
                                //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
                                    if(times==6){
                                        User = x;
                                    }
                                    if(times == 5){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        SName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Clinic
                                Clinic CliDru;
                                CliDru = new Clinic(FirstName, HAddress, SName, CName, PC, User);
                                C.drugList.add(CliDru);
//Print Clinic Details
                                System.out.println("CD, " + FirstName + " " + HAddress + " " + SName + " " + CName + " " + PC + " " + User);
                                }
                            }
                        }
                        
                        //Appointment 
                        if(a == 'A'){
                            if(b =='P'){
                                if(c == ','){
                                 //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
                                    if(times==6){
                                        User = x;
                                    }
                                    if(times == 5){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        SName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        HAddress = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Clinic
                                Appointments Appt;
                                Appt = new Appointments(FirstName, User, PC);
                                AP.appointmentList.add(Appt);
//Print Clinic Details
                                System.out.println("AP, " + FirstName + " " + User + " " + PC);
                                }
                            }
                        }

                        //Perscriptions
                        if(a == 'P'){
                            if(b =='P'){
                                if(c == ','){
                                        //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
                                    if(times == 5){
                                        CName = x;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        SName = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        SurName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        User = x;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                } 
//Create Instance Of Clinic
                                Perscriptions Pers;
                                Pers = new Perscriptions(FirstName, User, SurName, SName, CName);
                                AP.perscriptionList.add(Pers);
//Print Clinic Details
                                System.out.println("PP, " + FirstName + " " + User + " " + SurName + " " + SName + " " + CName);
                                }
                            }
                        }
                        //Set Next Line
                        line = reader.readLine();
        }
                        
    //Open GUI
    GUI_Home Home = new GUI_Home();
    Home.GetUser(U);
    Home.show();               
                        
    }
}
