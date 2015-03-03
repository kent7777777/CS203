/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsPackage;

/**
 *
 * @author Kevin
 */
import java.util.ArrayList;

public class Garage {
    private Automobile a;
    private ArrayList<Item> items = new ArrayList<>();
    
    public void store(Automobile a){
        this.a = a;
    }
    
    public void store(Item i){
        items.add(i);
    }
    
    public Automobile retrieve(){
        return this.a;
    }
    
    public Item retrieve(int index){
        return items.get(index);
    }

}
