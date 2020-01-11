//@author mwilson-slider
package soft252.cw.Classes;

public class Feedback {
    private int Doctor_Id = 0;
    private String Doctor_Feedback = "Unknown";

    public Feedback(int Doctor_Id, String Doctor_Feedback) {
        this.Doctor_Id = Doctor_Id;
        this.Doctor_Feedback = Doctor_Feedback;
    }
    
    public int getDoctor_Id() {
        return Doctor_Id;
    }
    public String getDoctor_Feedback() {
        return Doctor_Feedback;
    }

    public void setDoctor_Id(int Doctor_Id) {
        this.Doctor_Id = Doctor_Id;
    }

    public void setDoctor_Feedback(String Doctor_Feedback) {
        this.Doctor_Feedback = Doctor_Feedback;
    }
}