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
    }    
}