package StaticCar;

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
    
    public Car(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    public static void sety(Car This, int y){
        This.y = y;
    }
    public static void setx(Car This,int x){
        This.x = x;
    }
    public static void moveUp(Car This, int a){
        This.y = This.y + a;
    }
    public static void moveDown(Car This, int a){
        This.y = This.y - a;
    }
    public static void moveRight(Car This, int a){
        This.x = This.x + a;
    }
    public static void moveLeft(Car This, int a){
        This.x = This.x - a;
    }
    public static String printLocation(Car This){
        
        return This.x + " " + This.y;
        
    }
    
}
