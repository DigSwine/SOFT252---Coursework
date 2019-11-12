// @author mwilson-slider

package soft252.cw;
public class Secretary 
{
    //Variables
    protected String Secretary_IdentificationLetter = "S";
    protected Integer Secretary_IdentificationNumber = 0001;
    protected String Secretary_FirstName = "Unknown";
    protected String Secretary_SurName = "Unknown";
    protected Integer Secretary_StreetNumber = 00;
    protected String Secretary_StreetName = "Unknown";
    protected String Secretary_City = "Unknown";
    protected String Secretary_Postcode = "Unknown";
    
    //Constructor
    public Secretary(String Secretary_FirstName, String Secretary_SurName, Integer Secretary_StreetNumber, String Secretary_StreetName, String Secretary_City, String Secretary_Postcode) {
        this.Secretary_FirstName = Secretary_FirstName;
        this.Secretary_SurName = Secretary_SurName;
        this.Secretary_StreetNumber = Secretary_StreetNumber;
        this.Secretary_StreetName = Secretary_StreetName;
        this.Secretary_City = Secretary_City;
        this.Secretary_Postcode = Secretary_Postcode;  
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
    public Integer getSecretary_StreetNumber() {
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
    public void setSecretary_StreetNumber(Integer Secretary_StreetNumber) {
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

}
