/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageArrayList;

/**
 *
 * @author Kevin
 */
import java.util.LinkedList;

public class ArrayListAverage {
    public static void main(String[] args){
        LinkedList<Integer> ints = new LinkedList<> ();
        int total = 0;
        for(int i = 0; i < 100; i++){
            int num = (int) (Math.random() * 100);
            num += total;
            ints.add(num);
        }
        int Average = total/ints.size();
        ints.contains(Average);
        
    }
}
