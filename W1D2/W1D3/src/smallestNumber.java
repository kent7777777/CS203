/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class smallestNumber {
    public static void main(String[] args){
        double[] numbers = new double[100];
        for(int i = 0;i < numbers.length;i++){
            numbers[i] = Math.random() * (i+1);
            System.out.println(numbers[i]);
        }
        double smallest = 100;
        for(int i =0;i < numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
    System.out.println(smallest);
    }
}
