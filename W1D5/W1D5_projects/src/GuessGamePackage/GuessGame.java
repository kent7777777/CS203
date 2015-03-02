/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2_projects;

/**
 *
 * @author Kevin
 */
public class GuessGame {
    public void startGame(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Number between 0 and 9");
        
        while(true){
            System.out.println("Number to guess is" + guess1);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guess1 = p1.num;
            System.out.println("Player one guessed" + guess1);
            
            guess2 = p2.num;
            System.out.println("Player two guessed" + guess2);
            
            guess3 = p3.num;
            System.out.println("Player three guessed" + guess3);
            
            if (guess1 == targetNumber){
                p1isRight = true;
            }
            if (guess2 == targetNumber){
                p2isRight = true;
            }
            if (guess3 == targetNumber){
                p3isRight = true;
            }
            System.out.println(p1isRight + " " + p2isRight + " " + p3isRight);
        }
    }
}
