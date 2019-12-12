// @author mwilson-slider

package soft252.cw.Classes;
public class Admin 
{
    //Variables
    protected String Admin_IdentificationLetter = "A";
    protected Integer Admin_IdentificationNumber = 0001;
    protected String Admin_FirstName = "Unknown";
    protected String Admin_SurName = "Unknown";
    protected String Admin_StreetNumber = "00";
    protected String Admin_StreetName = "Unknown";
    protected String Admin_City = "Plymouth";
    protected String Admin_PostCode = "PL1";
    protected String Admin_Username = "Unknown";
    protected String Admin_Password = "unknown";

    //Constructor
    public Admin(String Admin_FirstName, String Admin_SurName, String Admin_StreetNumber, String Admin_StreetName, String Admin_City, String Admin_PostCode, String Admin_Username, String Admin_Password) {
        this.Admin_FirstName = Admin_FirstName;
        this.Admin_SurName = Admin_SurName;
        this.Admin_StreetNumber = Admin_StreetNumber;
        this.Admin_StreetName = Admin_StreetName;
        this.Admin_City = Admin_City;
        this.Admin_PostCode = Admin_PostCode;
        this.Admin_Username = Admin_Username;
        this.Admin_Password = Admin_Password;
    }
    
    
    //Getters
    public String getAdmin_IdentificationLetter() {
        return Admin_IdentificationLetter;
    }
    public Integer getAdmin_IdentificationNumber() {
        return Admin_IdentificationNumber;
    }
    public String getAdmin_FirstName() {
        return Admin_FirstName;
    }
    public String getAdmin_SurName() {
        return Admin_SurName;
    }
    public String getAdmin_StreetNumber() {
        return Admin_StreetNumber;
    }
    public String getAdmin_StreetName() {
        return Admin_StreetName;
    }
    public String getAdmin_City() {
        return Admin_City;
    }
    public String getAdmin_PostCode() {
        return Admin_PostCode;
    }
    public String getAdmin_Username() {
        return Admin_Username;
    }
    public String getAdmin_Password() {
        return Admin_Password;
    }
    
    //Setters
    public void setAdmin_IdentificationLetter(String Admin_IdentificationLetter) {
        if(Admin_IdentificationLetter != null && !Admin_IdentificationLetter.isEmpty()){
        this.Admin_IdentificationLetter = Admin_IdentificationLetter;
        }
    }
    public void setAdmin_IdentificationNumber(Integer Admin_IdentificationNumber) {
        this.Admin_IdentificationNumber = Admin_IdentificationNumber;
    }
    public void setAdmin_FirstName(String Admin_FirstName) {
        if(Admin_FirstName != null && !Admin_FirstName.isEmpty()){
        this.Admin_FirstName = Admin_FirstName;
        }
    }
    public void setAdmin_SurName(String Admin_SurName) {
        if(Admin_SurName != null && !Admin_SurName.isEmpty()){
        this.Admin_SurName = Admin_SurName;
        }
    }
    public void setAdmin_StreetNumber(String Admin_StreetNumber) {
        this.Admin_StreetNumber = Admin_StreetNumber;
    }
    public void setAdmin_StreetName(String Admin_StreetName) {
        this.Admin_StreetName = Admin_StreetName;
    }
    public void setAdmin_City(String Admin_City) {
        this.Admin_City = Admin_City;
    }
    public void setAdmin_PostCode(String Admin_PostCode) {
        this.Admin_PostCode = Admin_PostCode;
    }
    public void setAdmin_Username(String Admin_Username) {
        this.Admin_Username = Admin_Username;
    }
    public void setAdmin_Password(String Admin_Password) {
        this.Admin_Password = Admin_Password;
    }
    
}
