// @Morgan wilson-slider
package soft252.cw.Classes;

public class DoctorRatings {
    private int Doctor_ID = 0;
    private int Patient_ID = 0;
    private String Patient_comment = "Unknown";
    private double Rating = 0;

    public DoctorRatings(int Doctor_ID, int Patient_ID, String Patient_comment, double Rating) {
        this.Doctor_ID = Doctor_ID;
        this.Patient_ID = Patient_ID;
        this.Patient_comment = Patient_comment;
        this.Rating = Rating;
    }
    
    public int getDoctor_ID() {
        return Doctor_ID;
    }
    public int getPatient_ID() {
        return Patient_ID;
    }
    public String getPatient_comment() {
        return Patient_comment;
    }
    public double getRating() {
        return Rating;
    }

    public void setDoctor_ID(int Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }
    public void setPatient_ID(int Patient_ID) {
        this.Patient_ID = Patient_ID;
    }
    public void setPatient_comment(String Patient_comment) {
        this.Patient_comment = Patient_comment;
    }
    public void setRating(double rating) {
        this.Rating = rating;
    }
}
