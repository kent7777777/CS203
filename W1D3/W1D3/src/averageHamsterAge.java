/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class averageHamsterAge {
    
    public static void main(String[] args){
        Hamster[] hamsters = new Hamster[100];
        for(int i = 0;i < hamsters.length;i++){
            hamsters[i] = new Hamster();
            hamsters[i].age = Math.random() * 3;
            System.out.println(hamsters[i].age);
        }
        double totalAge = 0;
        for(int i = 0;i < hamsters.length;i++){
            totalAge = totalAge + hamsters[i].age;
        }
        System.out.println(totalAge/hamsters.length);
    }
    
}
