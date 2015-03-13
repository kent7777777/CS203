
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class CarOutFile {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("Cars.sav");
            ObjectInputStream carIn = new ObjectInputStream(fis);
            Car c1 = (Car) carIn.readObject();
            Car c2 = (Car) carIn.readObject();
            Car c3 = (Car) carIn.readObject();
            
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
        }catch(Exception e){}
    }
}
