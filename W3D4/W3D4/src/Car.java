
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kevin
 */
public class Car extends Automobile implements Serializable {
    private boolean convertable;
    private int trunkCapactiry;
    
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
