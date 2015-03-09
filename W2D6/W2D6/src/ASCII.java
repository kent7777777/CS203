/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class ASCII {
    public static void main(String[] args){
        for(int i = 32; i < 129; i++){
            System.out.print(i + " ");
            System.out.print((i - 12) + " ");
            System.out.println((i + 8) + " ");
            System.out.print(String.format("%c", i) + " ");
        }
    }
}
