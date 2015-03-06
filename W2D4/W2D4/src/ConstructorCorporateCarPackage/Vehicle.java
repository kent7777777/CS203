/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructorCorporateCarPackage;

/**
 *
 * @author Kevin
 */
public abstract class Vehicle {
    private int x;
    private int y;
    private int speed;
    private int direction;
    
    public Vehicle(){
        this(0, 0, 0);
        this.speed = 0;
    }
    
    public Vehicle(int x, int y){
        this(x, y, 0);
        this.speed = 0;
    }
    
    public Vehicle(int x, int y, int direction){
        this.x =  x;
        this.y =  y;
        this.direction = (int) direction;
        this.speed = 0;
    }
    
    
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
