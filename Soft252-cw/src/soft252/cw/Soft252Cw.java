// @author mwilson-slider

package soft252.cw;

import soft252.cw.GUI.GUI_Home;
import soft252.cw.Classes.Appointments;
import soft252.cw.Classes.Clinic;
import soft252.cw.Classes.Perscriptions;
        
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
            "D, KimBrook, 15, Shorsberry Avanue, Plymouth, PL3 3TD / "
            + "D, Drew, Valintine, 10, Shortway Road, Plymouth, PL1 1WL / "
            + "D, Bob, Ross, 1, Golden Street, Plymouth, PL4 4DX / "
            + "P, David, Charger, Male, 54, 99, Long Road, Plymouth, PL5 2RT, DCharger, 12345 / "
            + "P, Kimberly, Little, Female, 23, 12, Foxwood Road, Plymouth, PL2 4DZ, KLittle, 1212 / "
            + "P, Luke, Walker, Male, 17, 23, Berry Road, Plymouth, PL1 2BR, LWalker, 123123 / "
            + "A, Karran, Southbank, 29, Hallow Way, Plymouth, PL8 9KL / "
            + "S, Shallisa, Beonce, 100, Deo Lane, Plymouth, PL3 2DO / "
            + "C, MadeUp Pharmacy, 50, Long Road, Plymouth, PL5 2RT / "
            + "CD, Paracetomol, 1.50, Over The Counter - Drug, 12 Tablets, Releaves Pain, 100 / "
            + "CD, Ibuprofen, 1.25, Over The Counter - Drug, 12 Tablets, Releaves Pain, 100 / "
            + "CD, Epipen, 5.00, Over The Counter  - Drug, 1 use, Emergancy Useage, 100 / "
            + "CD, Norflex, 10.00, Perscription  - Drug, 26 Tablets, Muscle Relaxer, 100 / "
            + "CD, Calcium Carbonate, 3.50, Over The Counter  - Drug, 20 Tablets, prevent or to treat a calcium deficiency, 100 / "
            + "CD, Morphine, 12.00, Perscription  - Drug, 10 Patches,  Treats moderate to severe pain, 100 / "
            + "CD, Beclomethasone Nasal, 5.50, Over The Counter  - Drug, Nasle Spray - 24 Sprays, prevent hayfeaver allergies, 100 / "
            + "CD, Opium Tincture, 3.50, Perscription  - Drug, 5 Tablets, used to treat diarrhea, 100 / "
            + "CD, Dextroamphetamine, 1.50, Perscription  - Drug, 20 Tablets,  used to treat narcolepsy and ADHD, 100 / "
            + "CD, Baclofene, 3.50, Perscription  - Drug, 24 Tablets, muscle relaxer and an antispasmodic agent, 100 / "
            + "AP, 0003, 0002, This patient is suffering from hayfever / "
            + "PP, 0003, 0007, Beclomethasone Nasal, 1, 1 / ";
      
      
        File file = new File("Data.txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();

         Scanner sc = new Scanner(file); 
        sc.useDelimiter("\\Z"); 
        System.out.println(sc.next());  
        
        
       // //Open GUI
        GUI_Home Home = new GUI_Home();
        Home.show();
    }
}