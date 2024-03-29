// @author mwilson-slider

package soft252.cw.Classes;
public class Secretary 
{
    //Variables
    protected String Secretary_IdentificationLetter = "S";
    protected Integer Secretary_IdentificationNumber = 0001;
    protected String Secretary_FirstName = "Unknown";
    protected String Secretary_SurName = "Unknown";
    protected String Secretary_StreetNumber = "00";
    protected String Secretary_StreetName = "Unknown";
    protected String Secretary_City = "Unknown";
    protected String Secretary_Postcode = "Unknown";
    protected String Secretary_Username = "Unknown";
    protected String Secretary_Password = "Unknown";
    
    //Constructor
    public Secretary(String Secretary_FirstName, String Secretary_SurName, String Secretary_StreetNumber, String Secretary_StreetName, String Secretary_City, String Secretary_Postcode, String Secretary_Username, String Secretary_Password) {
        this.Secretary_FirstName = Secretary_FirstName;
        this.Secretary_SurName = Secretary_SurName;
        this.Secretary_StreetNumber = Secretary_StreetNumber;
        this.Secretary_StreetName = Secretary_StreetName;
        this.Secretary_City = Secretary_City;
        this.Secretary_Postcode = Secretary_Postcode;  
        this.Secretary_Username = Secretary_Username;
        this.Secretary_Password = Secretary_Password;
    }  
    
    //Getters
    public String getSecretary_IdentificationLetter() {
        return Secretary_IdentificationLetter;
    }
    public Integer getSecretary_IdentificationNumber() {
        return Secretary_IdentificationNumber;
    }
    public String getSecretary_FirstName() {
        return Secretary_FirstName;
    }
    public String getSecretary_SurName() {
        return Secretary_SurName;
    }
    public String getSecretary_StreetNumber() {
        return Secretary_StreetNumber;
    }
    public String getSecretary_StreetName() {
        return Secretary_StreetName;
    }
    public String getSecretary_City() {
        return Secretary_City;
    } 
    public String getSecretary_Postcode() {
        return Secretary_Postcode;
    }
    public String getSecretary_Username() {
        return Secretary_Username;
    }
    public String getSecretary_Password() {
        return Secretary_Password;
    }
       
       
    //Setters
    public void setSecretary_IdentificationLetter(String Secretary_IdentificationLetter) {
        this.Secretary_IdentificationLetter = Secretary_IdentificationLetter;
    }
    public void setSecretary_IdentificationNumber(Integer Secretary_IdentificationNumber) {
        this.Secretary_IdentificationNumber = Secretary_IdentificationNumber;
    }
    public void setSecretary_FirstName(String Secretary_FirstName) {
        this.Secretary_FirstName = Secretary_FirstName;
    }
    public void setSecretary_SurName(String Secretary_SurName) {
        this.Secretary_SurName = Secretary_SurName;
    }
    public void setSecretary_StreetNumber(String Secretary_StreetNumber) {
        this.Secretary_StreetNumber = Secretary_StreetNumber;
    }
    public void setSecretary_StreetName(String Secretary_StreetName) {
        this.Secretary_StreetName = Secretary_StreetName;
    }
    public void setSecretary_City(String Secretary_City) {
        this.Secretary_City = Secretary_City;
    }
    public void setSecretary_Postcode(String Secretary_Postcode) {
        this.Secretary_Postcode = Secretary_Postcode;
    }
    public void setSecretary_Username(String Secretary_Username) {
        this.Secretary_Username = Secretary_Username;
    }
    public void setSecretary_Password(String Secretary_Password) {
        this.Secretary_Password = Secretary_Password;
    }

}
