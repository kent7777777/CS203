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
public abstract class Vehicle {
    private int x;
    private int y;
    private int speed;
    private int direction;
    
    public void move(int amount){
        x = (int) (Math.cos(direction) * speed);
        y = (int) (Math.sin(direction) * speed);
    }
    
    public void turn(int amount){
        direction += amount;
        if(direction > 360){
            direction -= 360;
        }else if(direction < 0){
            direction += 360;
        }
    }
    
    public abstract void accelerate();
    public abstract void brake();
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
}
