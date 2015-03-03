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
public class Truck extends Automobile {
    private int carryingCapacity;
    private boolean hasTailGate;
    
    @Override
    public void Accelerate(){
        this.setSpeed(7 - getSpeed());
        if(this.getSpeed() < 0){
            this.setSpeed(0);
        }
    }


    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public boolean isHasTailGate() {
        return hasTailGate;
    }

    public void setHasTailGate(boolean hasTailGate) {
        this.hasTailGate = hasTailGate;
    }
    
}
