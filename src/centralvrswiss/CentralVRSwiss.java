package centralvrswiss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;

//import vrml.*;
//import vrml.field.*;
//import vrml.node.*;

/**
 * 
 * @author Nathan
 */
public class CentralVRSwiss {
    
    private static ArrayList xAxe;
    private static ArrayList yAxe;
    private static ArrayList zAxe;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        initialize();
        
    }
    
    public static void initialize() {
        try {
            PrintWriter pw = new PrintWriter(new File("points/53394620_dsm_1m.dat"));
            StringBuilder sb = new StringBuilder();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CentralVRSwiss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void shutdown ( ) {
    
    }
    
    public static void processEvent(Event event) {
        
    }
}
