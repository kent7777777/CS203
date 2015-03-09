/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsPackage;

/**
 *
 * @author Kevin
 */
public class ExceptionTestDriver {
    public static void doThingA() throws MyException{ 
        doThingB(); 
    }
    public static void doThingB() throws MyException{ 
        doThingC(); 
    }
    public static void doThingC() throws MyException { 
        doThingD(); 
    }
    public static void doThingD() throws MyException{ 
        try{
            throw new MyException("a message");
        }catch(Exception e){
            throw new MyException("didn't really want to deal with it", e);
        }finally{
            System.out.println("were finally doing it");
    }
    }
    
    public static void main(String[] args){
            try{
                throw new MyException("hi");
            }catch(Exception e){
                System.out.println("nope");
            }
        
    }
}
