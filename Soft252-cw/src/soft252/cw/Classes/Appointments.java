// @author mwilson-slider

package soft252.cw.Classes;
public class Appointments 
{
    //Variables
    protected Integer Appointment_Number = 0000;
    protected String Patient_IDL = "Unknown";
    protected String Patient_IDN = "0000";
    protected String Doctor_IDL = "D";
    protected String Doctor_IDN =  "0000";
    protected String Patient_Notes = " ";
    private String AP_Time = "unknown";
    private String AP_Date = "unknown";

    //Constructors
    public Appointments(String Patient_IDN, String Doctor_IDN, String AP_Time, String AP_Date, String Patient_Notes){
    this.Patient_IDL = "P";
    this.Patient_IDN = Patient_IDN;
    this.Doctor_IDL = "D";
    this.Doctor_IDN =  Doctor_IDN;
    this.AP_Time = AP_Time;
    this.AP_Date = AP_Date;
    this.Patient_Notes = Patient_Notes; 
    }
    
    //Getters
    public Integer getAppointment_Number() {
        return Appointment_Number;
    }
    public String getPatient_IDL() {
        return Patient_IDL;
    }
    public String getPatient_IDN() {
        return Patient_IDN;
    }
    public String getDoctor_IDL() {
        return Doctor_IDL;
    }
    public String getDoctor_IDN() {
        return Doctor_IDN;
    }
    public String getPatient_Notes() {
        return Patient_Notes;
    }
    public String getAP_Time() {
        return AP_Time;
    }
    public String getAP_Date() {
        return AP_Date;
    }
    

    
    //Setters
    public void setAppointment_Number(Integer Appointment_Number) {
        this.Appointment_Number = Appointment_Number;
    }
    public void setPatient_IDL(String Patient_IDL) {
        this.Patient_IDL = Patient_IDL;
    }
    public void setPatient_IDN(String Patient_IDN) {
        this.Patient_IDN = Patient_IDN;
    }
    public void setDoctor_IDL(String Doctor_IDL) {
        this.Doctor_IDL = Doctor_IDL;
    }
    public void setDoctor_IDN(String Doctor_IDN) {
        this.Doctor_IDN = Doctor_IDN;
    }
    public void setPatient_Notes(String Patient_Notes) {
        this.Patient_Notes = Patient_Notes;
    }
    public void setAP_Time(String AP_Time) {
        this.AP_Time = AP_Time;
    }
    public void setAP_Date(String AP_Date) {
        this.AP_Date = AP_Date;
    }
    
}
