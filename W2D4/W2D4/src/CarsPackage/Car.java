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
public class Car extends Automobile {
    private boolean convertable;
    private int trunkCapactiry;
    
    
    public Car(String make, String model, int year, String color,
            boolean convertible, int trunkCapacity){
        super(make, model, year, color);
        this.convertable = convertible;
        this.trunkCapactiry = trunkCapacity;
    }
    
    @Override
    public void Accelerate(){
        this.setSpeed(12 - getSpeed());
        if(this.getSpeed() < 0){
            this.setSpeed(0);
        }
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public int getTrunkCapactiry() {
        return trunkCapactiry;
    }

    public void setTrunkCapactiry(int trunkCapactiry) {
        this.trunkCapactiry = trunkCapactiry;
    }
    
}
