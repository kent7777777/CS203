/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kevin
 */
public class Car {
    private int x;
    private int y;
    
    void sety(int y){
        this.y = y;
    }
    void setx(int x){
        this.x = x;
    }
    void moveUp(int a){
        this.y = this.y + a;
    }
    void moveDown(int a){
        this.y = this.y - a;
    }
    void moveRight(int a){
        this.x = this.x + a;
    }
    void moveLeft(int a){
        this.x = this.x - a;
    }
    String printLocation(){
        return x + " " + y;
        
    }
    
}
