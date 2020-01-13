//@author mwilson-slider
package soft252.cw.Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataHandler {
    private List_Users U = new List_Users();
    private List_Clinic C = new List_Clinic();
    private Lists_AP AP = new Lists_AP();
    private List_Requests R = new List_Requests();
    File file = new File("Data.txt");

    public void setU(List_Users U) {
        this.U = U;
    }
    public void setC(List_Clinic C) {
        this.C = C;
    }
    public void setAP(Lists_AP AP) {
        this.AP = AP;
    }

    public List_Users getU() {
        return U;
    }
    public List_Clinic getC() {
        return C;
    }
    public Lists_AP getAP() {
        return AP;
    }
    public List_Requests getR() {
        return R;
    }
    public void setR(List_Requests R) {
        this.R = R;
    } 
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    
    public void setData() throws IOException{
// Set Defult Data
        String content = 
            "D, Kimberly, Brook, 123, Shorsberry Avanue, Plymouth, PL3 3TD, KBrook, 12345\n"
            + "D, Drew, Valintine, 10, Shortway Road, Plymouth, PL1 1WL, DValintine, 12345\n"
            + "D, Bob, Ross, 15, Golden Street, Plymouth, PL4 4DX, BRoss, 12345\n"
            + "DR, 3, 1, Such a freindly and helpful doctor, 5\n"
            + "DR, 2, 2, He wanted to cut my leg off for a pain in my arm..., 0\n"
            + "DR, 1, 1, She seems to know what shes on about for the most part, 3.5\n"
            + "F, 1, Some stuff can be improved\n"
            + "F, 2, Why did you try to cut someones leg off for their arm? make this the last time I read this\n"
            + "F, 3, Keep up the good work\n"
            + "P, David, Charger, Male, 54, 99, Long Road, Plymouth, PL5 2RT, DCharger, 123456\n"
            + "P, Kimberly, Little, Female, 23, 12, Foxwood Road, Plymouth, PL2 4DZ, KLittle, 1212\n"
            + "P, Luke, Walker, Male, 17, 23, Berry Road, Plymouth, PL1 2BR, LWalker, 123123\n"
            + "A, Karran, Southbank, 29, Hallow Way, Plymouth, PL8 9KL, KSouthbank, 0909\n"
            + "S, Shallisa, Beonce, 100, Deo Lane, Plymouth, PL3 2DO, SBeonce, 9090\n"
            + "C, MadeUp Pharmacy, 50, Long Road, Plymouth, PL5 2RT\n"
            + "CD, Paracetomol, Over The Counter - Drug, 12 Tablets, Releaves Pain, 10\n"
            + "CD, Ibuprofen, Over The Counter - Drug, 12 Tablets, Releaves Pain, 100\n"
            + "CD, Epipen, Over The Counter  - Drug, 1 use, Emergancy Useage, 40\n"
            + "CD, Norflex, Perscription  - Drug, 26 Tablets, Muscle Relaxer, 100\n"
            + "CD, Calcium Carbonate, Over The Counter  - Drug, 20 Tablets, prevent or to treat a calcium deficiency, 100\n"
            + "CD, Morphine, Perscription  - Drug, 10 Patches,  Treats moderate to severe pain, 100\n"
            + "CD, Beclomethasone Nasal, Over The Counter  - Drug, Nasle Spray - 24 Sprays, prevent hayfeaver allergies, 100\n"
            + "CD, Opium Tincture, Perscription  - Drug, 5 Tablets, used to treat diarrhea, 100\n"
            + "CD, Dextroamphetamine, Perscription  - Drug, 20 Tablets,  used to treat narcolepsy and ADHD, 100\n"
            + "CD, Baclofene, Perscription  - Drug, 24 Tablets, muscle relaxer and an antispasmodic agent, 100\n"
            + "AP, 3, 2, 10:30, 17/12/2019, This patient is suffering from hayfever\n"
            + "AP, 2, 1, 10:00, 21/1/2020, Check up\n"
            + "AP, 1, 3, 9:00, 18/12/2019, Swelling to the face after eating peanuts\n"
            + "AP, 1, 3, 9:30, 5/1/2020, Full recovery - must get an Epipen if another event occurs\n"
            + "PP, 3, Beclomethasone Nasal, 1, 1\n"
            + "PP, 1, Epipen, 1, 1\n"
            + "RP, 1, Viagra, 1, 1\n"
            + "RP, 3, Metoprolol, 1, 1\n"
            + "RA, 1, 3, 12:00, 10/1/2020, Check up\n"
            + "R, Jeffory, Dick, Male, 41, 6, Jones Street, Plymouth, PL7 8BD, JDick, 123\n"
            + "RD, Anton, Deago, Male, 29, 18, Derriford Road, Plymouth, Pl2 2IR, ADeago, 123423\n"
            + "H, 2, Paracetomol, 10, 10\n";     
      //Create Data File
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }
    public void getData() throws IOException{
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
                                        times = times + 1;
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
                            }
                        }
                        if(a == 'F'){
                            if(b == ','){
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String x : arrOfStr){
                                    if(times == 2){
                                        SurName = x;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                    }
                                    times = times + 1;
                                }
                                Feedback FB;
                                FB = new Feedback(Integer.valueOf(FirstName), SurName);
                                U.Feedback.add(FB);  
                            }
                        }
                        
                        //Ratings
                        if(a == 'D'){
                            if(b == 'R'){
                                if(c == ','){
                                    String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String x : arrOfStr){
                                    
                                    if(times == 4){
                                        User = x;
                                    }
                                    if(times == 3){
                                        Age = x;
                                    }
                                    if(times == 2){
                                        SurName = x;
                                    }
                                    if(times == 1){
                                        FirstName = x;
                                    }
                                    times = times + 1;
                                    }                            
                                DoctorRatings Rate;
                                Rate = new DoctorRatings(Integer.valueOf(FirstName), Integer.valueOf(SurName), Age, Double.valueOf(User));
                                U.ratingList.add(Rate);
                                }                                      
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
                                    if(times == 8){
                                        Pass = x;
                                        times = 0;
                                    }
                                    if(times == 7){
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
//Create Instance Of Admin                                
                                Admin Adm;
                                Adm = new Admin(FirstName, SurName, HAddress, SName, CName, PC, User, Pass);
                                U.adminList.add(Adm);
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
                                    if(times == 8){
                                        Pass = x;
                                        times = 0;
                                    }
                                    if(times == 7){
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
//Create Instance Of Secretary
                                Secretary Sec;
                                Sec = new Secretary(FirstName, SurName, HAddress, SName, CName, PC, User, Pass);
                                U.secreteryList.add(Sec);
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
                                    if(times == 5){
                                        PC = x;
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
//Create Instance Of ClinicDrug
                            
                                Clinic CliDru;
                                Integer ipc = Integer.valueOf(PC);
                                
                                CliDru = new Clinic(FirstName, HAddress, SName, CName, ipc);
                                C.drugList.add(CliDru);
                                
                                int minallowed = 50;
                                Integer Have = Integer.valueOf(PC);
                                if(Have <= minallowed){
                                Clinic ReqD;
                                ReqD = new Clinic(FirstName, HAddress, SName, CName, ipc);
                                C.lowsotckList.add(ReqD);
                                }
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
                                    if(times == 5){
                                        User= x;
                                    }
                                    if(times == 4){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        CName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        SName = x;
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
//Create Instance Of Appointment
                                Appointments Appt;
                                Appt = new Appointments(FirstName, SName, CName, PC, User);
                                AP.appointmentList.add(Appt);
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
//Create Instance Of Perscriptions
                                Perscriptions Pers;
                                Pers = new Perscriptions(FirstName, User, SurName, SName);
                                AP.perscriptionList.add(Pers);
                                }
                            }
                        }                     
                        //Appointment 
                        if(a == 'R'){
                            if(b =='A'){
                                if(c == ','){
                                 //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
                                    if(times == 5){
                                        User= x;
                                    }
                                    if(times == 4){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        CName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        SName = x;
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
//Create Instance Of Appointment
                                Appointments Appt;
                                Appt = new Appointments(FirstName, SName, CName, PC, User);
                                R.requestAppointmentList.add(Appt);
                                }
                            }
                        }

                        //Perscriptions
                        if(a == 'R'){
                            if(b =='P'){
                                if(c == ','){
                                        //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
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
//Create Instance Of Perscriptions
                                Perscriptions Pers;
                                Pers = new Perscriptions(FirstName, User, SurName, SName);
                                R.requestPerscriptionList.add(Pers);
                                
                                Clinic Med;
                                Med = new Clinic(User , "New Medication", "New Medication", "", 0);
                                R.requestNewMedications.add(Med);
                                
                                }
                            }
                        }
                        
                        //Patients
                        if(a == 'R'){
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
                                R.requestPatientList.add(Pat);
                            }
                        }
                         //Patients
                        if(a == 'R'){
                            if(b == 'D'){
                                if(c == ','){
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
                                R.deletePatientList.add(Pat);
                            }
                        }
                        }
                        //Perscriptions
                        if(a == 'H'){
                            if(b ==','){
                                        //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
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
//Create Instance Of Perscriptions
                                Perscriptions Pers;
                                Pers = new Perscriptions(FirstName, User, SurName, SName);
                                R.readyHandoutList.add(Pers);
                                }
                            }
                        
       
//end
                        //Set Next Line
                        line = reader.readLine();
        }
                        
    }

    public void editDeletePerson(String type, int IDN) throws IOException{     
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("Data.txt"));
        File txtDoc = new File("Data.txt");               
        String line = reader.readLine();
        String context[] = new String[1];
        String LoggedinUser = "Unknown";
        String LoggedinPass = "Unknown";
        int x = 0;

        if("P".equals(type)){
        LoggedinUser = U.patientList.get(IDN - 1).getPatient_Username();
        LoggedinPass = U.patientList.get(IDN - 1).getPatient_Password();
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";   
        
            if(a != 'P'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'P'){
                        if(b == ','){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                    if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    else 
                                    {
                                     times = times + 1;   
                                    }
                                } 
                            if(LoggedinUser.equals(User)){
                                if(LoggedinPass.equals(Pass)){
                                    U.patientList.remove(IDN - 1);
                                    line = reader.readLine();
                                }
                            }
                            else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                        x = x + 1;
                        }
                        }
                        else{
                        line = reader.readLine();
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        x = x + 1;
                        }
                    }
                      
//End of while loop  
            }
        }
       if("D".equals(type)){
        LoggedinUser = U.doctorList.get(IDN).getDoctor_User();
        LoggedinPass = U.doctorList.get(IDN).getDoctor_Password();
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";  
            if(a != 'D'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
            } else if(a == 'D'){
                if(b == ','){
                    String[] arrOfStr = line.split(", "); 
                    int times = 0;
//Get Each Block Of The String "line"                                
                        for(String docsec : arrOfStr){
                            if (times == 8){
                                Pass = docsec;
                                times = times + 1;
                            } else {
                                if (times == 7) {
                                    User = docsec;
                                    times = times + 1;
                                } else {
                                    times = times + 1;
                                }
                            }
                        }
                        if(LoggedinUser.equals(User)){
                            if(LoggedinPass.equals(Pass)){
                                U.doctorList.remove(IDN);
                                line = reader.readLine();
                            }
                        }
                        else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                        x = x + 1;
                        }
                        } else {                  
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                        }
                    }
                }
            }
    
         if("S".equals(type)){
        LoggedinUser = U.secreteryList.get(IDN).getSecretary_Username();
        LoggedinPass = U.secreteryList.get(IDN).getSecretary_Password();
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";   
        
            if(a != 'S'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'S'){
                        if(b == ','){
                            //Set Each Block Of line                                                              
                            String[] arrOfStr = line.split(", "); 
                            int times = 0;
                        //Get Each Block Of The String "line"                                
                            for (String Secsec : arrOfStr){
                                if(times == 8){
                                    Pass = Secsec;
                                    times = 0;
                                } else {
                                    if(times == 7){
                                        User = Secsec;
                                        times = times + 1;
                                    } else {
                                        times = times + 1;
                                    }
                                }
                            }
                          if(LoggedinUser.equals(User)){
                            if(LoggedinPass.equals(Pass)){
                                U.secreteryList.remove(IDN);
                                line = reader.readLine();
                            }
                        }
                        else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                            x = x + 1;
                        }
                    } else {                  
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                   }
                }
            }
        }       
//////R
 if("RD".equals(type)){
        LoggedinUser = R.deletePatientList.get(IDN).getPatient_Username();
        LoggedinPass = R.deletePatientList.get(IDN).getPatient_Password();
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";   
        
            if(a != 'R'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'R'){
                        if(b == 'D'){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                    if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    else 
                                    {
                                     times = times + 1;   
                                    }
                                }
                            if(LoggedinUser.equals(User)){
                                if(LoggedinPass.equals(Pass)){
                                    R.deletePatientList.remove(IDN);
                                    line = reader.readLine();
                                }
                            }
                            else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                        x = x + 1;
                        }
                        } else {                  
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                        }
                    }
                      
//End of while loop  
            }
        }
 
 if("H".equals(type)){
    LoggedinUser = R.readyHandoutList.get(IDN).getPerscription_Quantity();
    LoggedinPass = R.readyHandoutList.get(IDN).getPerscption_Dosage();
 
     while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String SName = "Unknown";
            String SurName = "Unknown";   
      
             if(a != 'H'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                } else {
                 if(a == 'H'){
                    if(b == ','){    
 
                        String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String y : arrOfStr){
                                    if(times == 4){
                                        SName = y;
                                        times = times + 1;
                                    } else {
                                    if(times == 3){
                                        SurName = y;
                                    }
                                        times = times + 1;
                                    }
                                }
                            if(SurName.equals(LoggedinUser)){
                                if(SName.equals(LoggedinPass)){
                                    R.readyHandoutList.remove(IDN);
                                    line = reader.readLine();
                                }
                            } else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                        x = x + 1;
                        }
                        } else {                  
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                    }
             }
            
            
                }
 
                
            }
        }
 if("RP".equals(type)){
    LoggedinUser = R.requestPerscriptionList.get(IDN).getPerscription_Quantity();
    LoggedinPass = R.requestPerscriptionList.get(IDN).getPerscption_Dosage();
    String lookingFor = R.requestPerscriptionList.get(IDN).getPerscription_Name();
     while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String SName = "Unknown";
            String SurName = "Unknown";   
            String FirstName = "Unknown";
      
             if(a != 'R'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                } else {
                 if(a == 'R'){
                    if(b == 'P'){
                        String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String y : arrOfStr){
                                    if(times == 4){
                                        SName = y;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        SurName = y;
                                    }
                                    if(times == 2){
                                        FirstName = y;
                                    }
                                        times = times + 1;
                                    }
                                }
                            if(SurName.equals(LoggedinUser)){
                                if(SName.equals(LoggedinPass)){
                                    if(FirstName.equals(lookingFor)){
                                    R.requestPerscriptionList.remove(IDN);
                                    line = reader.readLine();
                                    } else {
                                        context[x] = line;
                                        context = Arrays.copyOf(context, context.length + 1);
                                        line = reader.readLine();
                                        x = x + 1;
                                    }
                                }
                            } else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                            x = x + 1;
                        }
                        } else {                  
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                    }
             }
            
            
                
     }
                
            }
    
//Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(context[y] + "\n");
    }
    bw.close();
    resetAll();
    }
    public void editAddPerson (String type, int IDN) throws FileNotFoundException, IOException{
       BufferedReader reader;
        reader = new BufferedReader(new FileReader("Data.txt"));
        File txtDoc = new File("Data.txt");               
        String line = reader.readLine();
        String context[] = new String[1];
        String LoggedinUser = "Unknown";
        String LoggedinPass = "Unknown";
        int x = 0;

        if("R".equals(type)){
        LoggedinUser = R.requestPatientList.get(IDN).getPatient_Username();
        LoggedinPass = R.requestPatientList.get(IDN).getPatient_Password();
        }
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";            
//Patient              
                if("R".equals(type)){
                    if(a != 'R'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'R'){
                        if(b == ','){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                    if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    else 
                                    {
                                     times = times + 1;   
                                    }
                                } 
                            if(LoggedinUser.equals(User)){
                                if(LoggedinPass.equals(Pass)){
                                    String to = 'P' + line.substring(1);
                                    context[x] = to; 
                                    context = Arrays.copyOf(context, context.length + 1);
                                    line = reader.readLine();
                                    x = x + 1;
                                }
                            }
                            else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                        x = x + 1;
                        }
                        }
                        else{
                        
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                        }
                    }
                }       
//End of while loop                
        }
    
    //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(context[y] + "\n");
    }
    bw.close(); 
    resetAll();
    }
    public void editAddAppt(String type, int IDN) throws IOException{
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

        File txtDoc = new File("Data.txt");               
        String context[] = new String[1];
        int x =0 ;
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);       
            //Patient              
                if("RA".equals(type)){
                    if(a != 'R'){
                        if(b != 'A'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        }
                    }
                    else if(a == 'R'){
                        if(b == 'A'){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                     if(times == 5){
                                        User= chunk;
                                    }
                                    if(times == 4){
                                        PC = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        CName = chunk;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        SName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                }
                                if(SName.equals(R.requestAppointmentList.get(IDN).getDoctor_IDN())){
                                    if(CName.equals(R.requestAppointmentList.get(IDN).getAP_Time())){
                                        if(PC.equals(R.requestAppointmentList.get(IDN).getAP_Date())){
                                            String Currently = line;
                                            Currently = Currently.substring(2);
                                            String New = "AP" + Currently;
                                            context[x] = New;
                                            context = Arrays.copyOf(context, context.length + 1);
                                            x = x + 1;
                                        }
                                    }
                                }
                        } else {
                            context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        x = x + 1;
                        }
                    } else {
                            context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        x = x + 1;
                }
            }
                line = reader.readLine();
        }
        FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
        for(int y =0; y <= x - 1; y++){
            bw.write(context[y] + "\n");
        }
        bw.close();
        resetAll();
    }

    public void editDenyPerson(String type, int IDN) throws IOException{
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("Data.txt"));
        File txtDoc = new File("Data.txt");               
        String line = reader.readLine();
        String context[] = new String[1];
        String LoggedinUser = "Unknown";
        String LoggedinPass = "Unknown";
        int x = 0;

        if("R".equals(type)){
        LoggedinUser = R.requestPatientList.get(IDN).getPatient_Username();
        LoggedinPass = R.requestPatientList.get(IDN).getPatient_Password();
        }
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";            
//Patient              
                if("R".equals(type)){
                    if(a != 'R'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'R'){
                        if(b == ','){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                    if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    else 
                                    {
                                     times = times + 1;   
                                    }
                                } 
                            if(LoggedinUser.equals(User)){
                                if(LoggedinPass.equals(Pass)){
                                    line = reader.readLine();
                                }
                            }
                            else {
                            context[x] = line;
                            context = Arrays.copyOf(context, context.length + 1);
                            line = reader.readLine();
                        x = x + 1;
                        }
                        }
                        else{
                        
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        line = reader.readLine();
                        x = x + 1;
                        }
                    }
                }       
//End of while loop                
        }
    
    //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(context[y] + "\n");
    }
    bw.close(); 
    resetAll();
    }
    public void editDenyAppt(String type, int IDN) throws IOException{
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

        File txtDoc = new File("Data.txt");               
        String context[] = new String[1];
        int x =0 ;
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);       
            //Patient              
                if("RA".equals(type)){
                    if(a != 'R'){
                        if(b != 'A'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        }
                    }
                    else if(a == 'R'){
                        if(b == 'A'){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                     if(times == 5){
                                        User= chunk;
                                    }
                                    if(times == 4){
                                        PC = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        CName = chunk;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        SName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                }
                                if(SName.equals(R.requestAppointmentList.get(IDN).getDoctor_IDN())){
                                    if(CName.equals(R.requestAppointmentList.get(IDN).getAP_Time())){
                                        if(PC.equals(R.requestAppointmentList.get(IDN).getAP_Date())){
                                           
                                        }
                                    }
                                }
                        } else {
                            context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        x = x + 1;
                        }
                    } else {
                            context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        x = x + 1;
                }
            }
                line = reader.readLine();
        }
        FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
        for(int y =0; y <= x - 1; y++){
            bw.write(context[y] + "\n");
        }
        bw.close();
        resetAll();
    }
    public void editDenyRemoval(String type, int IDN) throws FileNotFoundException, IOException{
         BufferedReader reader;
        reader = new BufferedReader(new FileReader("Data.txt"));
        File txtDoc = new File("Data.txt");               
        String line = reader.readLine();
        String context[] = new String[1];
        String LoggedinUser = "Unknown";
        String LoggedinPass = "Unknown";
        String Pat = "";
        int x = 0;        
//////R
 if("RD".equals(type)){
        LoggedinUser = R.deletePatientList.get(IDN).getPatient_Username();
        LoggedinPass = R.deletePatientList.get(IDN).getPatient_Password();
        
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
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
            
        
            if(a != 'R'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'R'){
                        if(b == 'D'){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                                for (String chunk : arrOfStr){
                                    if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    if (times == 8){
                                        PC = chunk;
                                        times = times + 1;
                                    }
                                    if (times == 7) {
                                        CName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 6){
                                        SName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 5){
                                        HAddress = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        Age = chunk;
                                        times = times +1;
                                    }
                                    if(times == 3){
                                        Gender = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 2){
                                        SurName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                }    
//Create Instance Of Patient    

                                if(LoggedinUser.equals(User)){
                                    if(LoggedinPass.equals(Pass)){
                                        Pat = "P, " + FirstName + ", " + SurName + ", " + Gender + ", " + Age + ", " + HAddress + ", " + SName + ", " + CName + ", " + PC + ", " + User + ", " + Pass;
                                        line = reader.readLine();
                                    }
                                }
                            }  else {                  
                                context = Arrays.copyOf(context, context.length + 1);
                                context[x] = line;
                                line = reader.readLine();
                                x = x + 1;
                            }
                        }
//End of while loop                             
                    }
                }
//Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(context[y] + "\n");
    }
    bw.write(Pat);
    bw.close();
    resetAll();
    }
    
    public void RequestDeletion(String type, int ind) throws FileNotFoundException, IOException{
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("Data.txt"));
        File txtDoc = new File("Data.txt");               
        String line = reader.readLine();
        String context[] = new String[1];

                     String Del = "Unknown";
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
                        String requestedUser = "null";
                        String requestedPass = "null";
        int x = 0;
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            if(type.equals("P")){
                if(a == 'P'){
                    if(b == ','){
                        if(ind <= 0){                    
                        } else {
                        requestedUser = U.patientList.get(ind - 1).getPatient_Username();
                        requestedPass = U.patientList.get(ind - 1).getPatient_Password();
                        }
                    //Set Each Block Of line                                                              
                    String[] arrOfStr = line.split(", "); 
                    int times = 0;
//Get Each Block Of The String "line"                                
                    for (String chunk : arrOfStr){
                        if(times == 10){
                                        Pass = chunk;
                                    }
                                    if (times == 9){
                                        User = chunk;
                                        times = times + 1;
                                    }
                                    if (times == 8){
                                        PC = chunk;
                                        times = times + 1;
                                    }
                                    if (times == 7) {
                                        CName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 6){
                                        SName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 5){
                                        HAddress = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 4){
                                        Age = chunk;
                                        times = times +1;
                                    }
                                    if(times == 3){
                                        Gender = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 2){
                                        SurName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = chunk;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                        }
                        if(requestedUser.equals(User)){
                            if(requestedPass.equals(Pass)){
                                Del = "RD, " + FirstName + ", " + SurName + ", " + Gender + ", " + Age + ", " + HAddress + ", " + SName + ", " + CName + ", " + PC + ", " + User + ", " + Pass;
                                
                                context = Arrays.copyOf(context, context.length + 1);
                                context[x] = Del;
                                x = x + 1;
                                
                                
                            } else {
                                context = Arrays.copyOf(context, context.length + 1);
                                context[x] = line;
                                x = x + 1;
                            }
                        } else {
                            context = Arrays.copyOf(context, context.length + 1);
                            context[x] = line;
                            x = x + 1;
                        }
                    } else {
                        context = Arrays.copyOf(context, context.length + 1);
                        context[x] = line;
                        x = x + 1;
                    }
                } else {
                    context = Arrays.copyOf(context, context.length + 1);
                    context[x] = line;
                    x = x + 1;
                }
            }
            line = reader.readLine();
        }
        //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(context[y] + "\n");
    }
    bw.close();
    resetAll();
    }  
    public void NewNote(String type, String pid, String did, String time, String date, String note) throws FileNotFoundException, IOException{
       BufferedReader reader;
       reader = new BufferedReader(new FileReader("Data.txt"));
       File txtDoc = new File("Data.txt");
       String line = reader.readLine();
       String context[] = new String[1];
       int k = 0;
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
        String EditedLine = "";
                        
        while (line != null) {
        char a = line.charAt(0);
        char b = line.charAt(1);
        char c = line.charAt(2);
        if(a == 'A'){
            if(b =='P'){
                if(c == ','){
            //Set Each Block Of line                                                              
                    String[] arrOfStr = line.split(", "); 
                    int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String x : arrOfStr){
                                    if(times == 5){
                                        User= x;
                                    }
                                    if(times == 4){
                                        PC = x;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        CName = x;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        SName = x;
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
                            if(FirstName.equals(pid)){
                                 if(SName.equals(did)){
                                     if(CName.equals(time)){
                                      if(PC.equals(date)){
                                          context = Arrays.copyOf(context, context.length + 1);
                                          EditedLine = "AP, " + pid + ", " + did + ", " + time + ", " +  date + ", " + note;
                                          line = reader.readLine();
                                          
                                        } else {
                                            context = Arrays.copyOf(context, context.length + 1);
                                            context[k] = line;
                                            line = reader.readLine();
                                            k = k + 1;   
                                        }
                                    } else {
                                        context = Arrays.copyOf(context, context.length + 1);
                                        context[k] = line;
                                        line = reader.readLine();
                                        k = k + 1; 
                                    }
                                } else {
                                    context = Arrays.copyOf(context, context.length + 1);
                                    context[k] = line;
                                    line = reader.readLine();
                                    k = k + 1;    
                                }
                            } else {
                            context = Arrays.copyOf(context, context.length + 1);
                            context[k] = line;
                            line = reader.readLine();
                            k = k + 1;      
                            }
                        }
                    } else {
                        context = Arrays.copyOf(context, context.length + 1);
                            context[k] = line;
                            line = reader.readLine();
                            k = k + 1;  
                    }
                } else {
                    context = Arrays.copyOf(context, context.length + 1);
                    context[k] = line;
                    line = reader.readLine();
                    k = k + 1;  
                }
        }
        //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
        for(int y =0; y <= k - 1; y++){
            bw.write(context[y] + "\n");
        }
        bw.write(EditedLine + "\n");
    bw.close();
    resetAll();
    }
    public void NewPerscription(String type, String pid, String perName, String perQua, String perDos) throws FileNotFoundException, IOException{
        BufferedReader reader;
	reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String content[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
                while (line != null) {
                        content[x] = line;
                        content = Arrays.copyOf(content, content.length + 1);
                        line = reader.readLine();
                        bw.write(content[x] + "\n");
                        x = x++;
                }
                String newPer = type + ", " + pid + ", " + perName + ", " + perQua + ", " + perDos;
                bw.write(newPer);
        bw.close();
        resetAll();
    }
    public void requestNewPer(String type, String pid, String perName, String perQua, String perDos) throws IOException{
          BufferedReader reader;
	reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String content[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        if(type.equals("CD")){
            char a = line.charAt(0);
            char b = line.charAt(1);
            while (line != null) {
                if(a != 'C'){
                        content[x] = line;
                        content = Arrays.copyOf(content, content.length + 1);
                        x = x++;
                } else {
                    if(a == 'C'){
                        if(b == 'D'){
                        content[x] = line;
                        content = Arrays.copyOf(content, content.length + 1);
                        x = x++;
                        }
                    }
                }
                line = reader.readLine();
                }
                String newPer = type + ", " + pid + ", " + perName + ", " + perQua + ", " + perDos;
                
                bw.write(newPer);
        }         
        if(type.equals("RP")){
        while (line != null) {
                        content[x] = line;
                        content = Arrays.copyOf(content, content.length + 1);
                        line = reader.readLine();
                        bw.write(content[x] + "\n");
                        x = x++;
                }
                String newPer = type + ", " + pid + ", " + perName + ", " + perQua + ", " + perDos;
       bw.write(newPer);
        bw.close();
        resetAll();
    }
    }
    public void NewAppt(int id, String who, String time, String date) throws FileNotFoundException, IOException{
        int ID = id;
        String Who = who;
        String Time = time;
        String Date = date;
        String content = "RA, " + String.valueOf(ID)+", " + Who+ ", " + Time + ", " + Date + ", " + "Check up";
        
              BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String context[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
                while (line != null) {
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        line = reader.readLine();
                        bw.write(context[x] + "\n");
                        x = x++;
                }
                bw.write(content);
        bw.close();
        resetAll();
    }
    public void AddPerson(String type, String fn, String sn, String house, String road, String city, String pc, String user, String pass) throws IOException{
        String toAdd = type + ", " + fn + ", " + sn  + ", " + house + ", " + road  + ", " + city  + ", " + pc  + ", " + user + ", " + pass;
        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String context[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
                while (line != null) {
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        line = reader.readLine();
                        x = x + 1;
                }
                for(int g = 0; g < context.length - 1; g++){
                    bw.write(context[g] + "\n");
                }
                
                
                
                
                bw.write(toAdd);
        bw.close();
        resetAll();
        }
    public void DelHandout(int id) throws FileNotFoundException, IOException{               
        int ID = id;
        String Who = R.readyHandoutList.get(ID).getPatient_IDN();
        String Name = R.readyHandoutList.get(ID).getPerscription_Name();
        String Quantity = R.readyHandoutList.get(ID).getPerscription_Quantity();
        String Dos = R.readyHandoutList.get(ID).getPerscption_Dosage();
        int TheQuan = Integer.valueOf(R.readyHandoutList.get(ID).getPerscription_Quantity());
        String content = "PP, " + Who + ", " + Name + ", " + Quantity + ", " + Dos;
        
              BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String context[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
                while (line != null) {
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        line = reader.readLine();
                        bw.write(context[x] + "\n");
                        x = x++;
                }
                bw.write(content);                
        bw.close();
        editDeletePerson("H", ID);
        
        FindAndRemnoveQuan(ID, TheQuan);
        resetAll();
    }
    public void restock(String type, int id) throws IOException{
        if("CD".equals(type)){
            FindAndStockUp(id);       
        } else {
            CreateNewMed(id);
            }
        }
    public void FindAndStockUp(int TheId) throws FileNotFoundException, IOException{
        BufferedReader reader;
	reader = new BufferedReader(new FileReader("Data.txt")); 
        File txtDoc = new File("Data.txt");
        Integer Required = 0;    
        Integer Have = C.lowsotckList.get(TheId).getItem_Stock();
        String Name = C.lowsotckList.get(TheId).getItem_Name();
        Required = 100 - Have; 
        
        
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String content[] = new String[1];
        String SName = "";
        String SurName = "";
        String User = "";
        String FirstName = "";
        String HAddress = "";
        int x = 0;
                while (line != null) {
                    char a = line.charAt(0);
                    char b = line.charAt(1);  
                    if(a != 'C'){
                        content = Arrays.copyOf(content, content.length + 1);
                        content[x] = line;
                        x = x + 1;
                    } else {
                        if(a == 'C'){
                         if(b =='D'){
                                        //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String chu : arrOfStr){
                                    if(times == 5){
                                        SName = chu;
                                    }
                                    if(times == 4){
                                        HAddress = chu;
                                    }
                                    if(times == 3){
                                        SurName = chu;
                                    }
                                    if(times == 2){
                                        User = chu;
                                    }
                                    if(times == 1){
                                        FirstName = chu;
                                    }
                                    times = times + 1;
                                }
                                //checkes
                                if(FirstName.equals(Name)){
                                    content = Arrays.copyOf(content, content.length + 1);
                                    content[x] = "CD, " + FirstName + ", " + User + ", " + SurName + ", " + HAddress + ", " + "100";
                                    x = x + 1;
                                } else {
                                    content = Arrays.copyOf(content, content.length + 1);
                                    content[x] = line;
                                    x = x + 1;
                                }  
                         } else {
                        content = Arrays.copyOf(content, content.length + 1);
                        content[x] = line;
                        x = x + 1;
                         }
                    }

                    
                //end of while    
                  }
                    line = reader.readLine();
                }
                
                //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(content[y] + "\n");
    }
    bw.close();
                resetAll();
    }
    public void FindAndRemnoveQuan(int TheId, int TheQuan) throws FileNotFoundException, IOException{
        BufferedReader reader;
	reader = new BufferedReader(new FileReader("Data.txt")); 
        File txtDoc = new File("Data.txt");
        Integer Have = C.drugList.get(TheId).getItem_Stock();
        String Name = C.drugList.get(TheId).getItem_Name();
        int newQuan = Have - TheQuan;
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String content[] = new String[1];
        String SName = "";
        String SurName = "";
        String User = "";
        String FirstName = "";
        String HAddress = "";
        int x = 0;
                while (line != null) {
                    char a = line.charAt(0);
                    char b = line.charAt(1);  
                    if(a != 'C'){
                        content = Arrays.copyOf(content, content.length + 1);
                        content[x] = line;
                        x = x + 1;
                    } else {
                        if(a == 'C'){
                         if(b =='D'){
                                        //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String chu : arrOfStr){
                                    if(times == 5){
                                        SName = chu;
                                    }
                                    if(times == 4){
                                        HAddress = chu;
                                    }
                                    if(times == 3){
                                        SurName = chu;
                                    }
                                    if(times == 2){
                                        User = chu;
                                    }
                                    if(times == 1){
                                        FirstName = chu;
                                    }
                                    times = times + 1;
                                }
                                //checkes
                                if(FirstName.equals(Name)){
                                    content = Arrays.copyOf(content, content.length + 1);
                                    content[x] = "CD, " + FirstName + ", " + User + ", " + SurName + ", " + HAddress + ", " + newQuan;
                                    x = x + 1;
                                } else {
                                    content = Arrays.copyOf(content, content.length + 1);
                                    content[x] = line;
                                    x = x + 1;
                                }  
                         } else {
                        content = Arrays.copyOf(content, content.length + 1);
                        content[x] = line;
                        x = x + 1;
                         }
                    }

                    
                //end of while    
                  }
                    line = reader.readLine();
                }
                
                //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x; y++){
        bw.write(content[y] + "\n");
    }
    bw.close();
    resetAll();
    }
    public void CreateNewMed(int TheId) throws FileNotFoundException, IOException{       
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
            String perName = R.requestNewMedications.get(TheId).getItem_Name();
            String Quantity = R.requestPerscriptionList.get(TheId).getPerscption_Dosage();
            String content =  "CD, " + perName + ", " + "Perscription - Drug" + ", " + Quantity + ", " + "NULL" + ", " + "0";
            
            //Get First Line
            String line = reader.readLine();
            
            //Set Content
            String context[] = new String[1];
            int x = 0;
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            String FirstName = "Unknown";
            String SurName = "Unknown";
            String Gender = "Unknown";
            String Age = "Unknown";
            String HAddress = "Unknown";
            String SName = "Unknown";
            String CName = "Unknown";
            String PC = "Unknown";
            String User = "Unknown";
            
            while (line != null) {
                char a = line.charAt(0);
                char b = line.charAt(1);
                if(a == 'R'){
                    if(b == 'P'){
                        String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                   
                                for (String op : arrOfStr){
                                    if(times == 4){
                                        SName = op;
                                        times = times + 1;
                                    }
                                    if(times == 3){
                                        SurName = op;
                                        times = times +1;
                                    }
                                    if(times == 2){
                                        User = op;
                                        times = times + 1;
                                    }
                                    if(times == 1){
                                        FirstName = op;
                                        times = times + 1;
                                    }
                                    if(times == 0){
                                        times = times + 1;
                                    }
                                }
                                
                                if(User.equals(perName)){                                  
                                } else {
                                    context[x] = line;
                                    context = Arrays.copyOf(context, context.length + 1);
                                    bw.write(context[x] + "\n");
                                    x = x++;
                                }           
                    } else {
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        bw.write(context[x] + "\n");
                        x = x++;
                    }
                } else {
                    context[x] = line;
                    context = Arrays.copyOf(context, context.length + 1);
                    bw.write(context[x] + "\n");
                    x = x++; 
                } 
                line = reader.readLine();
            }
            bw.write(content);
            bw.close();
            resetAll();
        } catch (IOException ex) {
            Logger.getLogger(DataHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void requestNewPat(String type, String fn, String sn, String gen, String Age, String house, String road, String city, String pc, String user, String pass) throws FileNotFoundException, IOException{
        String toAdd = type + ", " + fn + ", " + sn  + ", " + gen + ", " + Age + ", " + house + ", " + road  + ", " + city  + ", " + pc  + ", " + user + ", " + pass;
        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String context[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
                while (line != null) {
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        line = reader.readLine();
                        x = x + 1;
                }
                for(int g = 0; g < context.length - 1; g++){
                    bw.write(context[g] + "\n");
                }
                
                
                
                
                bw.write(toAdd);
        bw.close();
        resetAll();
    }
    public void createReview(int Doctor_ID, int Patient_ID, String Patient_comment, double Rating) throws FileNotFoundException, IOException{
        String newreview = "DR, " + Doctor_ID + ", " + Patient_ID + ", " + Patient_comment + ", " + Rating;
        
        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));       
    //Get First Line
        String line = reader.readLine();  
        
    //Set Content    
        String context[] = new String[1];
        int x = 0;
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
                while (line != null) {
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        line = reader.readLine();
                        x = x + 1;
                }
                for(int g = 0; g < context.length - 1; g++){
                    bw.write(context[g] + "\n");
                }
                bw.write(newreview);
        bw.close();
        resetAll();  
    }    
    
    
    private void resetAll() throws IOException{
        //clear all data
        U.adminList.clear();
        U.doctorList.clear();
        U.patientList.clear();
        U.secreteryList.clear();
        U.Feedback.clear();
        U.ratingList.clear();
        AP.appointmentList.clear();
        AP.perscriptionList.clear();
        C.clinicList.clear();
        C.drugList.clear();
        C.lowsotckList.clear();
        R.requestNewMedications.clear();
        R.deletePatientList.clear();
        R.readyHandoutList.clear();
        R.requestAppointmentList.clear();
        R.requestPatientList.clear();
        R.requestPerscriptionList.clear();
        
        
        //reload all data
        getData();
    }
//End of Class
}