/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameOfLifePackage;

/**
 *
 * @author Kevin
 */
public class LifeCheck {
    //boolean currentBoolean;
    //Makes a list of 8 surrounding booleans
    public int Check(boolean[][] b, int n1, int n2){
        //currentBoolean = b[n1][n2];
        int answers = 0;
        
//        for(int i = -1; i < 2; i++){
//            for(int j = -1; j < 2; j++){
//                if(!((n1 + i == n1) && (n2 + j == n2))){
//                    if(!((n1 + i > b.length - 1) || (n1 + i < 0) || (n2 + j > b[0].length - 1) || (n2 + j < 0))){
//                        answers++;
//                    }
//                }
//            }
//        }
        if (isPossible(b,n1-1,n2-1) && b[n1-1][n2-1]) {
            answers++;
        }
        if (isPossible(b,n1-1,n2) && b[n1-1][n2]) {
            answers++;
        }
        if (isPossible(b,n1-1,n2+1) && b[n1-1][n2+1]) {
            answers++;
        }
        if (isPossible(b,n1,n2-1) && b[n1][n2-1]) {
            answers++;
        }
        if (isPossible(b,n1,n2+1) && b[n1][n2+1]) {
            answers++;
        }
        if (isPossible(b,n1+1,n2-1) && b[n1+1][n2-1]) {
            answers++;
        }
        if (isPossible(b,n1+1,n2) && b[n1+1][n2]) {
            answers++;
        }
        if (isPossible(b,n1+1,n2+1) && b[n1+1][n2+1]) {
            answers++;
        }
        
        System.out.println(n1 + " " + n2 + " " + answers);
        return answers;
    }
    
    private boolean isPossible(boolean[][] b, int n1, int n2) {
        return n1 >= 0 && n1 < b.length && n2 >= 0 && n2 < b[0].length; 
    }
    
    //see if boolean is true or false
    public boolean isAlive(boolean currentBoolean, int tr){
        
        boolean alive = false;
        
       
        
        if(tr < 2 || tr > 3){
            alive = false;
        }
        if((currentBoolean) && ((tr == 2) || (tr == 3))){
            alive = true;
        }
        if(!(currentBoolean) && (tr == 3)){
            alive = true;
        }
        
        
        return alive;
    }
}
