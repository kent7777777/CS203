/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIapps;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class Calculator {
    private JFrame frame;
    private JTextField field;
    private JButton CButton;
    private JPanel panelMain;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    
    public static void main(String[] args){
        Calculator run = new Calculator();
        run.go();
    }
    
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        field = new JTextField();
        CButton = new JButton("C");
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panelMain = new JPanel();
        
        
        button1 = new JButton("7");
        button2 = new JButton("8");
        button3 = new JButton("9");
        button4 = new JButton("+");
        button5 = new JButton("4");
        button6 = new JButton("5");
        button7 = new JButton("6");
        button8 = new JButton("-");
        button9 = new JButton("1");
        button10 = new JButton("2");
        button11 = new JButton("3");
        button12 = new JButton("*");
        button13 = new JButton(".");
        button14 = new JButton("0");
        button15 = new JButton("=");
        button16 = new JButton("/");
        button1.setPreferredSize(new Dimension(50,50));
        button2.setPreferredSize(new Dimension(50,50));
        button3.setPreferredSize(new Dimension(50,50));
        button4.setPreferredSize(new Dimension(50,50));
        button5.setPreferredSize(new Dimension(50,50));
        button6.setPreferredSize(new Dimension(50,50));
        button7.setPreferredSize(new Dimension(50,50));
        button8.setPreferredSize(new Dimension(50,50));
        button9.setPreferredSize(new Dimension(50,50));
        button10.setPreferredSize(new Dimension(50,50));
        button11.setPreferredSize(new Dimension(50,50));
        button12.setPreferredSize(new Dimension(50,50));
        button13.setPreferredSize(new Dimension(50,50));
        button14.setPreferredSize(new Dimension(50,50));
        button15.setPreferredSize(new Dimension(50,50));
        button16.setPreferredSize(new Dimension(50,50));
        CButton.setPreferredSize(new Dimension(50,50));
        field.setPreferredSize(new Dimension(160,50));
        
        CButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("");
            }
            
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel3.add(button9);
        panel3.add(button10);
        panel3.add(button11);
        panel3.add(button12);
        panel4.add(button13);
        panel4.add(button14);
        panel4.add(button15);
        panel4.add(button16);
        panel5.add(field);
        panel5.add(CButton);
        
        
        frame.getContentPane().add(BorderLayout.CENTER, panelMain);
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS ));
        
        panelMain.add(panel5);
        panelMain.add(panel1);
        panelMain.add(panel2);
        panelMain.add(panel3);
        panelMain.add(panel4);
        frame.setVisible(true);
        
    }
    
    public class ButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            field.setText(field.getText() + button.getText());
        }
        
}
    
    
}