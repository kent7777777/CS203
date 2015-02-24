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
public class CarTestDrive {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        c1.setx(0);
        c1.sety(0);
        c2.setx(5);
        c2.setx(6);
        c1.moveDown(3);
        c1.moveRight(7);
        c2.moveUp(3);
        c2.moveDown(9);
        System.out.print(c1.printLocation());
        System.out.print(c2.printLocation());
    }
    
}
