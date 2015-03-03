/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DotComGamePackage;

/**
 *
 * @author Kevin
 */
import java.util.*;
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "  : ( ");
            } else{
                result = "hit";
            }
        }
        return result;
    }
}
