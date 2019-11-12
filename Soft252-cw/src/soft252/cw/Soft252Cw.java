// @author mwilson-slider

package soft252.cw;
public class Soft252Cw 
{
    public static void main(String[] args) 
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
        
        System.out.println("Doctors");
        System.out.println(Doc_one.getDoctor_FirstName());
        System.out.println(Doc_two.getDoctor_FirstName());
        System.out.println(Doc_three.getDoctor_FirstName());
        System.out.println("");
        System.out.println("Patients");
        System.out.println(Pat_one.getPatient_Firstname());
        System.out.println(Pat_two.getPatient_Firstname());
        System.out.println(Pat_three.getPatient_Firstname());
        System.out.println("");
        System.out.println("Admin");
        System.out.println(Adm_one.Admin_FirstName);
        System.out.println("");
        System.out.println("Secretary");
        System.out.println(Sec_one.getSecretary_FirstName());
        System.out.println("");
        System.out.println("Clinic");
        System.out.println(Cli_one.getClinic_Name());
        System.out.println("");
        System.out.println("Clinic Stock");
        System.out.println(Drug_one.getItem_Name() + " Quantity: " + Drug_one.getItem_Stock());
        System.out.println(Drug_two.getItem_Name() + " Quantity: " + Drug_two.getItem_Stock());
        System.out.println(Drug_three.getItem_Name() + " Quantity: " + Drug_three.getItem_Stock());
    }    
}