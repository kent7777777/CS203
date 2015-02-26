/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class TestComparison {
    public static void main(String[] args){
        byte b = 5;
        short s = 5;
        int i = 5;
        long L= 5;
        float f = 5.0f;
        double d = 5.0;
        String s1 = "Mi";
        String s2 = "Mi";
        String s3 = "Mi";
        
        System.out.println(b == s);
        System.out.println(b == i);
        System.out.println(b == L);
        System.out.println(b == f);
        System.out.println(b == d);
        System.out.println(s1 == s2);
        System.out.println(s1 + s2 == s3);
        
    }
}
