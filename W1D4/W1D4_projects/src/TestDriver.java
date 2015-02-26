/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class TestDriver {
    public static void main(String[] args){
        GuineaPig g1 = new GuineaPig();
        Scientist s1 = new Scientist();
        g1.setName("Pat");
        int number = 1;
        System.out.println(g1.getName() + " " + number);
        s1.changeThese(number, g1);
        System.out.println(g1.getName() + " " + number);
    }
}
