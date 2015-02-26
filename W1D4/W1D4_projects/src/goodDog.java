/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class goodDog {

    private int size;
    public int getSize(){
        return size;
    }
    
    public void setSize(int s){
        size = s;
    }
    
    public void bark(){
        if(size > 60){
            System.out.println("Wooof!");
        }else if (size > 14){
            System.out.println("Ruff!");
        }else{
            System.out.println("Yip!");
        }
    }
    
}
