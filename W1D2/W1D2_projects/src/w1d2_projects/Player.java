/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2_projects;

/**
 *
 * @author Kevin
 */
import java.io.*;
public class Player {
    int num = 0;
    
    public void guess(){
        Console c = System.console();
        
        num =  Integer.parseInt(c.readLine());
        System.out.println("guessing " + num);
    }
    
}
