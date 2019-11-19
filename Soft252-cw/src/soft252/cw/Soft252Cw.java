// @author mwilson-slider

package soft252.cw;

public class Soft252Cw 
{
    public static void main(String[] args) 
    {
        SetAll();
        
        GUI_Home Home = new GUI_Home();
        Home.show();
        
    }   
    
    public static void SetAll()
    {
     //Setting Patients, Doctors, Admin, Secatery
        Doctors Doc_one = new Doctors("Jess", "KimBrook", 15 , "Shorsberry Avanue", "Plymouth", "PL3 3TD");
        Doctors Doc_two = new Doctors("Drew", "Valintine", 10, "Shortway Road", "Plymouth", "PL1 1WL");
        Doctors Doc_three = new Doctors("Bob", "Ross", 1, "Golden Street", "Plymouth", "PL4 4DX");
        Patients Pat_one = new Patients("David", "Charger", "Male", 54, 99, "Long Road", "Plymouth", "PL5 2RT");
        Patients Pat_two = new Patients("Kimberly", "Little", "Female", 23, 12, "Foxwood Road", "Plymouth", "PL2 4DZ");
        Patients Pat_three = new Patients("Luke", "Walker", "Male", 17, 23, "Berry Road", "Plymouth", "PL1 2BR");
        Admin Adm_one = new Admin("Karran", "Southbank", 29, "Hallow Way", "Plymouth", "PL8 9KL");
        Secretary Sec_one = new Secretary("Shallisa", "Beonce", 100, "Deo Lane", "Plymouth", "PL3 2DO");
        Clinic Cli_one = new Clinic("MadeUp Pharmacy", 50, "Long Road", "Plymouth", "PL5 2RT");
        Clinic Drug_one = new Clinic("Paracetomol", 1.50, "Over The Counter - Drug", "12 Tablets, Releaves Pain", 100);
        Clinic Drug_two = new Clinic("Ibuprofen", 1.25, "Over The Counter - Drug", "12 Tablets, Releaves Pain", 100);
        Clinic Drug_three = new Clinic("Epipen", 5.00, "Over The Counter  - Drug", "1 use, Emergancy Useage", 100);
        Clinic Drug_four = new Clinic("Norflex", 10.00, "Perscription  - Drug", "26 Tablets, Muscle Relaxer", 100);
        Clinic Drug_five = new Clinic("Calcium Carbonate", 3.50, "Over The Counter  - Drug", "20 Tablets, prevent or to treat a calcium deficiency", 100);
        Clinic Drug_six = new Clinic("Morphine", 12.00, "Perscription  - Drug", "10 Patches,  Treats moderate to severe pain", 100);
        Clinic Drug_seven = new Clinic("Beclomethasone Nasal", 5.50, "Over The Counter  - Drug", "Nasle Spray - 24 Sprays, prevent hayfeaver allergies", 100);
        Clinic Drug_eight = new Clinic("Opium Tincture", 3.50, "Perscription  - Drug", "5 Tablets, used to treat diarrhea", 100);
        Clinic Drug_nine = new Clinic("Dextroamphetamine", 1.50, "Perscription  - Drug", "20 Tablets,  used to treat narcolepsy and ADHD", 100);
        Clinic Drug_ten = new Clinic("Baclofene", 3.50, "Perscription  - Drug", "24 Tablets, muscle relaxer and an antispasmodic agent.", 100);
        
        //SetAppointments
        Appointments Appt_one = new Appointments(0003, 0002, "This patient is suffering from hayfever");
        
        
        //SetPerscritions
        Perscriptions Per_one = new Perscriptions(0003, 0007, "Beclomethasone Nasal", 1, 1);
        
//        System.out.println("Doctors");
//        System.out.println(Doc_one.getDoctor_FirstName());        
//        System.out.println(Doc_two);
//        System.out.println(Doc_three.getDoctor_FirstName());
//        System.out.println("");
//        System.out.println("Patients");
//        System.out.println(Pat_one.getPatient_Firstname());
//        System.out.println(Pat_two.getPatient_Firstname());
//        System.out.println(Pat_three.getPatient_Firstname());
//        System.out.println("");
//        System.out.println("Admin");
//        System.out.println(Adm_one.Admin_FirstName);
//        System.out.println("");
//        System.out.println("Secretary");
//        System.out.println(Sec_one.getSecretary_FirstName());
//        System.out.println("");
//        System.out.println("Clinic");
//        System.out.println(Cli_one.getClinic_Name());
//        System.out.println("");
//        System.out.println("Clinic Stock");
//        System.out.println(Drug_one.getItem_Name() + " Quantity: " + Drug_one.getItem_Stock());
//        System.out.println(Drug_two.getItem_Name() + " Quantity: " + Drug_two.getItem_Stock());
//        System.out.println(Drug_three.getItem_Name() + " Quantity: " + Drug_three.getItem_Stock());
//        System.out.println(Drug_four.getItem_Name() + " Quantity: " + Drug_four.getItem_Stock());
//        System.out.println(Drug_five.getItem_Name() + " Quantity: " + Drug_five.getItem_Stock());
//        System.out.println(Drug_six.getItem_Name() + " Quantity: " + Drug_six.getItem_Stock());
//        System.out.println(Drug_seven.getItem_Name() + " Quantity: " + Drug_seven.getItem_Stock());
//        System.out.println(Drug_eight.getItem_Name() + " Quantity: " + Drug_eight.getItem_Stock());
//        System.out.println(Drug_nine.getItem_Name() + " Quantity: " + Drug_nine.getItem_Stock());
//        System.out.println(Drug_ten.getItem_Name() + " Quantity: " + Drug_ten.getItem_Stock());
//        System.out.println(Appt_one.getPatient_Notes());
//        System.out.println(Per_one.getPerscription_Name());
        
    }
}