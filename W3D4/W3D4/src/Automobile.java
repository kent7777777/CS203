/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kevin
 */
public class Automobile {
    private String make;
    private String model;
    private int year;
    private String color;
    private int speed;
    
    public void Accelerate(){
        this.speed += 10;
        if(this.speed < 0){
            this.speed = 0;
        }
    }

    public void Brake(){
        this.speed -= 10;
    }
    public int getSpeed() {
            return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void move(){
        System.out.println(this.make + " " + this.model + " goes vroom vroom!");
    }
}
