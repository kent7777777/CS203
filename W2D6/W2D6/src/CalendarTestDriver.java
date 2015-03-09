/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
import java.util.Calendar;
public class CalendarTestDriver {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        c.set(1996, 2, 14, 7, 0);
        System.out.println(c.getTime());
        
        
    }
    
}
