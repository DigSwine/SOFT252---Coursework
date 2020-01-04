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

public class DataHandler {
    private List_Users U = new List_Users();
    private List_Clinic C = new List_Clinic();
    private Lists_AP AP = new Lists_AP();
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
    
    public void setData() throws IOException{
// Set Defult Data
        String content = 
            "D, Kimberly, Brook, 123, Shorsberry Avanue, Plymouth, PL3 3TD, KBrook, 12345, 3.5\n"
            + "D, Drew, Valintine, 10, Shortway Road, Plymouth, PL1 1WL, DValintine, 12345, 1\n"
            + "D, Bob, Ross, 15, Golden Street, Plymouth, PL4 4DX, BRoss, 12345, 5\n"
            + "P, David, Charger, Male, 54, 99, Long Road, Plymouth, PL5 2RT, DCharger, 123456\n"
            + "P, Kimberly, Little, Female, 23, 12, Foxwood Road, Plymouth, PL2 4DZ, KLittle, 1212\n"
            + "P, Luke, Walker, Male, 17, 23, Berry Road, Plymouth, PL1 2BR, LWalker, 123123\n"
            + "A, Karran, Southbank, 29, Hallow Way, Plymouth, PL8 9KL, KSouthbank, 0909\n"
            + "S, Shallisa, Beonce, 100, Deo Lane, Plymouth, PL3 2DO, SBeonce, 9090\n"
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
            + "AP, 3, 2, 10:30, 17/12/2019, This patient is suffering from hayfever\n"
            + "AP, 2, 1, 10:00, 21/1/2020, Check up\n"
            + "AP, 1, 3, 9:00, 18/12/2019, Swelling to the face after eating peanuts\n"
            + "AP, 1, 3, 9:30, 5/1/2020, Full recovery - must get an Epipen if another event occurs\n"
            + "PP, 3, Beclomethasone Nasal, 1, 1\n"
            + "PP, 1, Epipen, 1, 1\n";     
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
                                    if(times == 9){
                                        Age = x;
                                        times = 0;
                                    }
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
                                Doc = new Doctors(FirstName, SurName, HAddress, SName, CName, PC, User, Pass, Age);
                                U.doctorList.add(Doc);
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
//Create Instance Of ClinicDrug
                                Clinic CliDru;
                                CliDru = new Clinic(FirstName, HAddress, SName, CName, PC, User);
                                C.drugList.add(CliDru);
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
        }
        else if("D".equals(type)){
        LoggedinUser = U.doctorList.get(IDN - 1).getDoctor_User();
        LoggedinPass = U.doctorList.get(IDN - 1).getDoctor_Password();
        }else if("A".equals(type)){
            
        }else if("S".equals(type)){
            
        }
   
        while (line != null) {
            char a = line.charAt(0);
            char b = line.charAt(1);
            String User = "Unknown";
            String Pass = "Unknown";            
//Patient              
                if("P".equals(type)){
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
                }
//Doctor
                if("D".equals(type)){
                    if(a != 'D'){
                        context[x] = line;
                        context = Arrays.copyOf(context, context.length + 1);
                        x = x + 1;
                        line = reader.readLine();
                        }
                    else if(a == 'D'){
                        if(b == ','){
                            //Set Each Block Of line                                                              
                                String[] arrOfStr = line.split(", "); 
                                int times = 0;
//Get Each Block Of The String "line"                                
                               for (String chunk : arrOfStr){
                                    if(times == 8){
                                        Pass = chunk;
                                        System.out.println(Pass);
                                    }
                                    if (times == 7){
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
                                    U.doctorList.remove(IDN - 1);
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
                }
//
////Admin
//
////Secretary
//                
//End of while loop                
        }
    //Create Data File
    FileWriter fw = new FileWriter(txtDoc.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    for(int y =0; y < x - 1; y++){
        bw.write(context[y] + "\n");
    }
    bw.close();
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
                                          Appointments Appt;
                                          Appt = new Appointments(pid, did, time, date, note);
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
        for(int y =0; y < k - 1; y++){
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
    }
    
    
    
    private void resetAll() throws IOException{
        //clear all data
        U.adminList.clear();
        U.doctorList.clear();
        U.patientList.clear();
        U.secreteryList.clear();
        AP.appointmentList.clear();
        AP.perscriptionList.clear();
        C.clinicList.clear();
        C.drugList.clear();
        
        //reload all data
        getData();
    }
//End of Class
}
    