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

public class AutomoblieTestDrive {
    public static void main(String args){
        ArrayList<Automobile> autos = new ArrayList<>();
        Truck t1 = new Truck();
        Truck t2 = new Truck();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        
        autos.add(t1);
        autos.add(t2);
        autos.add(c1);
        autos.add(c2);
        autos.add(c3);
        
        for(Automobile A : autos){
            for(int i = 0; i < 3; i++){
                A.Accelerate();
            }
            A.Brake();
            System.out.println(A.getSpeed());
        }
        
    }
    
}
