// @author mwilson-slider

package soft252.cw;
public class Perscriptions 
{
    //Variables
    protected String Patient_IDL = "Unknown";
    protected Integer Patient_IDN = 0000;
    protected Integer Prescription_IDN = 0000;
    protected String Perscription_Name = "Unknown";
    protected Integer Perscription_Quantity = 0000;
    protected Integer Perscption_Dosage = 0000;

    //Constructors
    public Perscriptions(Integer Patient_IDN, Integer Prescription_IDN, String Perscription_Name, Integer Perscription_Quantity, Integer Perscption_Dosage){
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
    public Integer getPatient_IDN() {
        return Patient_IDN;
    }
    public Integer getPrescription_IDN() {
        return Prescription_IDN;
    }
    public String getPerscription_Name() {
        return Perscription_Name;
    }
    public Integer getPerscription_Quantity() {
        return Perscription_Quantity;
    }
    public Integer getPerscption_Dosage() {
        return Perscption_Dosage;
    }

    //Setters
    public void setPatient_IDL(String Patient_IDL) {
        this.Patient_IDL = Patient_IDL;
    }
    public void setPatient_IDN(Integer Patient_IDN) {
        this.Patient_IDN = Patient_IDN;
    }
    public void setPrescription_IDN(Integer Prescription_IDN) {
        this.Prescription_IDN = Prescription_IDN;
    }
    public void setPerscription_Name(String Perscription_Name) {
        this.Perscription_Name = Perscription_Name;
    }
    public void setPerscription_Quantity(Integer Perscription_Quantity) {
        this.Perscription_Quantity = Perscription_Quantity;
    }
    public void setPerscption_Dosage(Integer Perscption_Dosage) {
        this.Perscption_Dosage = Perscption_Dosage;
    }
    
}
