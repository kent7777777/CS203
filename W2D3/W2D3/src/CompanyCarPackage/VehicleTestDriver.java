/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompanyCarPackage;

/**
 *
 * @author Kevin
 */
import java.util.ArrayList;

public class VehicleTestDriver {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Asset> assests = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
        CorporateCar hondy = new CorporateCar();
        vehicles.add(hondy);
        assests.add(hondy);
        objects.add(hondy);
        vehicles.get(0).accelerate();
        vehicles.get(0).brake();
        assests.get(0).getPurchasePrice();
        objects.get(0).toString();
            }
          
}
