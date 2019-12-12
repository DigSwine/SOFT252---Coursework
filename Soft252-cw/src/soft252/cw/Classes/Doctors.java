// @author mwilson-slider

package soft252.cw.Classes;
import java.util.ArrayList;

public class Doctors 
{
    //Variables
    protected String Doctor_IdentificationLetter = "D";
    protected Integer Doctor_IdentificationNumber = 0001;
    protected String Doctor_FirstName = "Unknown";
    protected String Doctor_SurName = "Unknown";
    protected String Doctor_StreetNumber = "00";
    protected String Doctor_StreetName = "Unknown";
    protected String Doctor_City = "Plymouth";
    protected String Doctor_Postcode = "PL1";
    private String Doctor_User = "Unknown";
    private String Doctor_Password = "Unknown";
    private String Doctor_Rateing = "Unknown";
    
    
    //Constructor
    public Doctors(String Doctor_FirstName, String Doctor_SurName, String Doctor_StreetNumber, String Doctor_StreetName, String Doctor_City, String Doctor_Postcode, String Doctor_User, String Doctor_Password, String Doctor_Rateing) {
        this.Doctor_FirstName = Doctor_FirstName;
        this.Doctor_SurName = Doctor_SurName;
        this.Doctor_StreetNumber = Doctor_StreetNumber;
        this.Doctor_StreetName = Doctor_StreetName;
        this.Doctor_City = Doctor_City;
        this.Doctor_Postcode = Doctor_Postcode;       
        this.Doctor_User = Doctor_User;
        this.Doctor_Password = Doctor_Password;
        this.Doctor_Rateing = Doctor_Rateing;
    }

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
    public String getDoctor_StreetNumber() {
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
    public String getDoctor_User() {
        return Doctor_User;
    }
    public String getDoctor_Password() {
        return Doctor_Password;
    }
    public String getDoctor_Rateing() {
        return Doctor_Rateing;
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
    public void setDoctor_StreetNumber(String Doctor_StreetNumber) {
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
    public void setDoctor_User(String Doctor_User) {
        this.Doctor_User = Doctor_User;
    }

    public void setDoctor_Password(String Doctor_Password) {
        this.Doctor_Password = Doctor_Password;
    }
    public void setDoctor_Rateing(String Doctor_Rateing) {
        this.Doctor_Rateing = Doctor_Rateing;
    }
    
    
}