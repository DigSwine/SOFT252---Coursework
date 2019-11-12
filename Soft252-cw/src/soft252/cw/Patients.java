// @author mwilson-slider

package soft252.cw;
public class Patients 
{
    //Variables
    protected String Patient_IdendificationLetter = "P";
    protected Integer Patient_IdentificationNumber = 0001;
    protected String Patient_Firstname = "Unknown";
    protected String Patient_Surname = "Unknown";
    protected String Patient_Gender = "Unknown";
    protected Integer Patient_Age = 0;
    protected Integer Patient_StreetNumber = 0;
    protected String Patient_StreetName = "Unknown";
    protected String Patient_CityName = "Plymouth";
    protected String Patient_PostCode = "PL1 1AA";

    //Constructor

    public Patients(String Patient_Firstname, String Patient_Surname, String Patient_Gender, Integer Patient_Age, Integer Patient_StreetNumber, String Patient_StreetName, String Patient_CityName, String Patient_PostCode) {
        this.Patient_Firstname = Patient_Firstname;
        this.Patient_Surname = Patient_Surname;
        this.Patient_Gender = Patient_Gender;
        this.Patient_Age = Patient_Age;
        this.Patient_StreetNumber = Patient_StreetNumber;
        this.Patient_StreetName = Patient_StreetName;
        this.Patient_CityName = Patient_CityName;
        this.Patient_PostCode = Patient_PostCode;    
    }

    //Getters
    public String getPatient_IdendificationLetter() {
        return Patient_IdendificationLetter;
    }
    public Integer getPatient_IdentificationNumber() {
        return Patient_IdentificationNumber;
    }
    public String getPatient_Firstname() {
        return Patient_Firstname;
    }
    public String getPatient_Surname() {
        return Patient_Surname;
    }
    public String getPatient_Gender() {
        return Patient_Gender;
    }
    public Integer getPatient_Age() {
        return Patient_Age;
    }
    public Integer getPatient_StreetNumber() {
        return Patient_StreetNumber;
    }
    public String getPatient_StreetName() {
        return Patient_StreetName;
    }
    public String getPatient_CityName() {
        return Patient_CityName;
    }
    public String getPatient_PostCode() {
        return Patient_PostCode;
    }

    //Setters
    public void setPatient_IdendificationLetter(String Patient_IdendificationLetter) {
        if(Patient_IdendificationLetter != null && !Patient_IdendificationLetter.isEmpty()){
        this.Patient_IdendificationLetter = Patient_IdendificationLetter;
        }  
    }
    public void setPatient_IdentificationNumber(Integer Patient_IdentificationNumber) {
        if(Patient_IdentificationNumber != null){
        this.Patient_IdentificationNumber = Patient_IdentificationNumber;
        }
    }
    public void setPatient_Firstname(String Patient_Firstname) {
        if(Patient_Firstname != null && !Patient_Firstname.isEmpty()){   
        this.Patient_Firstname = Patient_Firstname;
        }
    }
    public void setPatient_Surname(String Patient_Surname) {
       if(Patient_Surname != null && !Patient_Surname.isEmpty()){
        this.Patient_Surname = Patient_Surname;
        }
    }
    public void setPatient_Gender(String Patient_Gender) {
       if(Patient_Gender != null && !Patient_Gender.isEmpty()){
        this.Patient_Gender = Patient_Gender;
        }
    }
    public void setPatient_Age(Integer Patient_Age) {
        this.Patient_Age = Patient_Age;
    }
    public void setPatient_StreetNumber(Integer Patient_StreetNumber) {
        this.Patient_StreetNumber = Patient_StreetNumber;
    }
    public void setPatient_StreetName(String Patient_StreetName) {
        this.Patient_StreetName = Patient_StreetName;
    }
    public void setPatient_CityName(String Patient_CityName) {
        this.Patient_CityName = Patient_CityName;
    }
    public void setPatient_PostCode(String Patient_PostCode) {
        this.Patient_PostCode = Patient_PostCode;
    }
    
}