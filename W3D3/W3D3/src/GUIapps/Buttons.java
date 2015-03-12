/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIapps;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class Buttons {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    
    public static void main(String[] args){
        Buttons run = new Buttons();
        run.go();
    }
    
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        button1 = new JButton("A");
        button1.setPreferredSize(new Dimension(120,120));
        button1.addActionListener(new MyListenerA());
        panel1.add(button1);
        
        button2 = new JButton("B");
        button2.setPreferredSize(new Dimension(120,120));
        button2.addActionListener(new MyListenerB());
        panel1.add(button2);
        
        button3 = new JButton("C");
        button3.setPreferredSize(new Dimension(120,120));
        button3.addActionListener(new MyListenerC());
        panel2.add(button3);
        
        button4 = new JButton("D");
        button4.setPreferredSize(new Dimension(120,120));
        button4.addActionListener(new MyListenerD());
        panel2.add(button4);
        frame.getContentPane().add(BorderLayout.NORTH, panel1);
        frame.getContentPane().add(BorderLayout.SOUTH, panel2);
        frame.setVisible(true);
        
    }
    
    public class MyListenerA implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button A pressed");
        }
    }
    public class MyListenerB implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button B pressed");
        }
    }
    public class MyListenerC implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button C pressed");
        }
    }
    public class MyListenerD implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button D pressed");
        }
    }
    
}
