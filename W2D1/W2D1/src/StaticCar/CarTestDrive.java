package StaticCar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kevin
 */
public class CarTestDrive {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        Car.setx(c1, 0);
        Car.sety(c1, 0);
        Car.setx(c2, 5);
        Car.sety(c2, 6);
        Car.moveDown(c1, 3);
        Car.moveRight(c1, 7);
        Car.moveUp(c2, 3);
        Car.moveDown(c2, 9);
        
        
        System.out.print(Car.printLocation(c1));
        System.out.print(Car.printLocation(c2));
    }
    
}
