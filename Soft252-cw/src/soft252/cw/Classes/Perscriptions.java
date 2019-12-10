// @author mwilson-slider

package soft252.cw.Classes;
public class Perscriptions 
{
    //Variables
    protected String Patient_IDL = "Unknown";
    protected String Patient_IDN = "0000";
    protected String Prescription_IDN = "0000";
    protected String Perscription_Name = "Unknown";
    protected String Perscription_Quantity = "0000";
    protected String Perscption_Dosage = "0000";

    //Constructors
    public Perscriptions(String Patient_IDN, String Prescription_IDN, String Perscription_Name, String Perscription_Quantity, String Perscption_Dosage){
    Patient_IDL = "P";
    this.Patient_IDN = Patient_IDN;
    this.Prescription_IDN = Prescription_IDN;
    this.Perscription_Name = Perscription_Name;
    this.Perscription_Quantity = Perscription_Quantity;
    this.Perscption_Dosage = Perscption_Dosage;
    }   

    //Getters
    public String getPatient_IDL() {
        return Patient_IDL;
    }
    public String getPatient_IDN() {
        return Patient_IDN;
    }
    public String getPrescription_IDN() {
        return Prescription_IDN;
    }
    public String getPerscription_Name() {
        return Perscription_Name;
    }
    public String getPerscription_Quantity() {
        return Perscription_Quantity;
    }
    public String getPerscption_Dosage() {
        return Perscption_Dosage;
    }

    //Setters
    public void setPatient_IDL(String Patient_IDL) {
        this.Patient_IDL = Patient_IDL;
    }
    public void setPatient_IDN(String Patient_IDN) {
        this.Patient_IDN = Patient_IDN;
    }
    public void setPrescription_IDN(String Prescription_IDN) {
        this.Prescription_IDN = Prescription_IDN;
    }
    public void setPerscription_Name(String Perscription_Name) {
        this.Perscription_Name = Perscription_Name;
    }
    public void setPerscription_Quantity(String Perscription_Quantity) {
        this.Perscription_Quantity = Perscription_Quantity;
    }
    public void setPerscption_Dosage(String Perscption_Dosage) {
        this.Perscption_Dosage = Perscption_Dosage;
    }
    
}
