/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIapp;

/**
 *
 * @author Kevin
 */
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class FrameClass {
    private JLabel label;
    
    public static void main(String[] args){
        FrameClass s = new FrameClass();
        s.start();
    }
    
    public void start(){
        JFrame frame = new JFrame("Problem One");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JButton sayHello = new JButton("Hello");
        sayHello.addActionListener(new helloListener());
        frame.getContentPane().add(BorderLayout.NORTH, sayHello);
        
        JButton sayGoodbye = new JButton("Good Bye");
        sayGoodbye.addActionListener(new goodbyeListener());
        frame.getContentPane().add(BorderLayout.SOUTH, sayGoodbye);
        
        label = new JLabel("Nothing yet");
        frame.getContentPane().add(BorderLayout.CENTER, label);
        
        frame.setVisible(true);
    }
    
    private class helloListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setText("Hello");
        }
    }
    
    private class goodbyeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setText("Good Bye");
        }
    }
}
