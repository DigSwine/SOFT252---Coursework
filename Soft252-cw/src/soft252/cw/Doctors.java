// @author mwilson-slider

package soft252.cw;
public class Doctors 
{
    //Variables
    protected String Doctor_IdentificationLetter = "D";
    protected Integer Doctor_IdentificationNumber = 0001;
    protected String Doctor_FirstName = "Unknown";
    protected String Doctor_SurName = "Unknown";
    protected Integer Doctor_StreetNumber = 00;
    protected String Doctor_StreetName = "Unknown";
    protected String Doctor_City = "Plymouth";
    protected String Doctor_Postcode = "PL1";

    //Getters
    public String getDoctor_IdentificationLetter() {
        return Doctor_IdentificationLetter;
    }
    public Integer getDoctor_IdentificationNumber() {
        return Doctor_IdentificationNumber;
    }
    public String getDoctor_FirstName() {
        return Doctor_FirstName;
    }
    public String getDoctor_SurName() {
        return Doctor_SurName;
    }
    public Integer getDoctor_StreetNumber() {
        return Doctor_StreetNumber;
    }
    public String getDoctor_StreetName() {
        return Doctor_StreetName;
    }
    public String getDoctor_City() {
        return Doctor_City;
    }
    public String getDoctor_Postcode() {
        return Doctor_Postcode;
    }

    //Setters
    public void setDoctor_IdentificationLetter(String Doctor_IdentificationLetter) {
        this.Doctor_IdentificationLetter = Doctor_IdentificationLetter;
    }  
    public void setDoctor_IdentificationNumber(Integer Doctor_IdentificationNumber) {
        this.Doctor_IdentificationNumber = Doctor_IdentificationNumber;
    }
    public void setDoctor_FirstName(String Doctor_FirstName) {
        if(Doctor_FirstName != null && Doctor_FirstName.isEmpty()){
            this.Doctor_FirstName = Doctor_FirstName;
        }
    }
    public void setDoctor_SurName(String Doctor_SurName) {
        if(Doctor_SurName != null && Doctor_SurName.isEmpty()){
        this.Doctor_SurName = Doctor_SurName;
        }
    }
    public void setDoctor_StreetNumber(Integer Doctor_StreetNumber) {
        this.Doctor_StreetNumber = Doctor_StreetNumber;
    }
    public void setDoctor_StreetName(String Doctor_StreetName) {
        this.Doctor_StreetName = Doctor_StreetName;
    }
    public void setDoctor_City(String Doctor_City) {
        this.Doctor_City = Doctor_City;
    }
    public void setDoctor_Postcode(String Doctor_Postcode) {
        this.Doctor_Postcode = Doctor_Postcode;
    }
    
    
}