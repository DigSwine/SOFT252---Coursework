// @author mwilson-slider

package soft252.cw;
public class Clinic 
{
    //Variables for clinc
    protected String Clinic_Name = "Unknown";
    protected Integer Clinic_StreetNumber = 00;
    protected String Clinic_StreetName = "Unknown";
    protected String Clinic_City = "Unknown";
    protected String Clinic_PostCode = "Unknown";
    
    //Variables for Stock
    protected Integer Item_IdentificationNumber = 0;
    protected String Item_Name = "Unknown";
    protected Double Item_Price = 0.00;
    protected String Item_Type = "Unknown";
    protected String Item_Description = "Unknown";
    protected Integer Item_Stock = 0;
    
    //Constructor
    public Clinic(String Clinic_Name, Integer Clinic_StreetNumber, String Clinic_StreetName, String Clinic_City, String Clinic_PostCode) {
        this.Clinic_Name = Clinic_Name;
        this.Clinic_StreetNumber = Clinic_StreetNumber;
        this.Clinic_StreetName = Clinic_StreetName;
        this.Clinic_City = Clinic_City;
        this.Clinic_PostCode = Clinic_PostCode;
    }
    public Clinic(String Item_Name, Double Item_Price, String Item_Type, String Item_Description, Integer Item_Stock){
        this.Item_Name = Item_Name;
        this.Item_Price = Item_Price;
        this.Item_Type = Item_Type;
        this.Item_Description = Item_Description;
        this.Item_Stock = Item_Stock;
    }
    
    //Clinic
    //Getters
     public String getClinic_Name() {
        return Clinic_Name;
    }
     public Integer getClinic_StreetNumber() {
        return Clinic_StreetNumber;
    }
     public String getClinic_StreetName() {
        return Clinic_StreetName;
    }
     public String getClinic_City() {
        return Clinic_City;
    }
     public String getClinic_PostCode() {
        return Clinic_PostCode;
    }
     
    //Setters
    public void setClinic_Name(String Clinic_Name) {
        this.Clinic_Name = Clinic_Name;
    }
    public void setClinic_StreetNumber(Integer Clinic_StreetNumber) {
        this.Clinic_StreetNumber = Clinic_StreetNumber;
    }
    public void setClinic_StreetName(String Clinic_StreetName) {
        this.Clinic_StreetName = Clinic_StreetName;
    }
    public void setClinic_City(String Clinic_City) {
        this.Clinic_City = Clinic_City;
    }
    public void setClinic_PostCode(String Clinic_PostCode) {
        this.Clinic_PostCode = Clinic_PostCode;
    }

    //Clinic Stock
    //Getters
    public Integer getItem_IdentificationNumber() {
        return Item_IdentificationNumber;
    }
    public String getItem_Name() {
        return Item_Name;
    }
    public Double getItem_Price() {
        return Item_Price;
    }
    public String getItem_Type() {
        return Item_Type;
    }
    public String getItem_Description() {
        return Item_Description;
    }
    public Integer getItem_Stock() {
        return Item_Stock;
    }
    //Setters
    public void setItem_IdentificationNumber(Integer Item_IdentificationNumber) {
        this.Item_IdentificationNumber = Item_IdentificationNumber;
    }
    public void setItem_Name(String Item_Name) {
        this.Item_Name = Item_Name;
    }
    public void setItem_Price(Double Item_Price) {
        this.Item_Price = Item_Price;
    }
    public void setItem_Type(String Item_Type) {
        this.Item_Type = Item_Type;
    }
    public void setItem_Description(String Item_Description) {
        this.Item_Description = Item_Description;
    }
    public void setItem_Stock(Integer Item_Stock) {
        this.Item_Stock = Item_Stock;
    }
      
}
