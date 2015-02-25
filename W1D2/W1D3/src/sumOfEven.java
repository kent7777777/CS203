/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class sumOfEven {
    public static void main(String[] args){
        int[] num = {3, 8, 4, 10, 14, 5, 21};
        int sum = 0;
        for(int i = 0;i < num.length;i++){
            if(num[i]%2 == 0){
                sum = sum + num[i];
            }
        }
        System.out.println(sum);
    }
}

