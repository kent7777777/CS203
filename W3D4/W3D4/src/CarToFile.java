
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class CarToFile {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        try{
            FileOutputStream fos = new FileOutputStream("Cars.sav");
            ObjectOutputStream carOut = new ObjectOutputStream(fos);
            carOut.writeObject(c1);
            carOut.writeObject(c2);
            carOut.writeObject(c3);
        }catch(Exception e){ }
    }
}
