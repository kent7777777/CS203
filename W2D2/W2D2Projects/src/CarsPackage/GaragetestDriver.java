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
public class GaragetestDriver {
    public static void main(String[] args){
        Garage g1 = new Garage();
        Car c1 = new Car();
        Truck t1 = new Truck();
        t1.setModel("Truck Truck");
        Item i1 = new Item();
        Item i2 = new Item();
        Item i3 = new Item();
        g1.store(t1);
        System.out.println(g1.retrieve().getModel());
        
        
        
    }
}
