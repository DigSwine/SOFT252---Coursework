// @author mwilson-slider
package soft252.cw;

//Data Imports
import soft252.cw.GUI.GUI_Home;
import java.io.*;
import java.io.File;
import soft252.cw.Classes.DataHandler;

public class Soft252Cw
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("Data.txt");
        DataHandler Data = new DataHandler();
        
        if(!file.exists() && !file.isDirectory()) {
        Data.setData();
        Soft252Cw.main(args);
       }
       else{
            Data.getData();
            //Open GUI
            GUI_Home Home = new GUI_Home();
            Home.GetUser(Data);
            Home.show();
        }
    }
}