/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingPackage;

/**
 *
 * @author Kevin
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class paint {
    private Icon iconB;
    private Icon iconM;
    private Icon iconB1;
    private Icon iconG;
    private Icon iconR;
    private JFrame frame;
    private Container content;
    private JPanel panel;
    private JButton clearButton;
    private JButton blueButton;
    private JButton magentaButton;
    private JButton blackButton;
    private JButton greenButton;
    private JButton redButton;
    
    public static void main(String[] args){
        paint start = new paint();
        start.go();
    }
    public void go(){
        iconB = new ImageIcon("blue.gif");
        iconM = new ImageIcon("magenta.gif");
        iconB1 = new ImageIcon("black.gif");
        iconG = new ImageIcon("green.gif");
        iconR = new ImageIcon("red.gif");
        
        
        frame = new JFrame("Paint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = frame.getContentPane();
        content.setLayout(new BorderLayout());
        
        final PadDraw drawPad = new PadDraw();
        content.add(drawPad, BorderLayout.CENTER);
        
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(32, 64));
        panel.setMinimumSize(new Dimension(32, 68));
        panel.setMaximumSize(new Dimension(32, 68));
        
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPad.clear();
            } 
        });
        
        redButton = new JButton(iconR);
        redButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                drawPad.red();
            }
        });
        
        greenButton = new JButton(iconG);
        greenButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPad.green();
            }
        });
        
        blackButton = new JButton(iconB1);
        blackButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPad.black();
            }
        });
        
        magentaButton = new JButton(iconM);
        magentaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPad.magenta();
            }
        });
        
        blueButton = new JButton(iconB);
        blueButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                drawPad.blue();
            }
        });
        
        blackButton.setPreferredSize(new Dimension(16, 16));
        magentaButton.setPreferredSize(new Dimension(16, 16));
        redButton.setPreferredSize(new Dimension(16, 16));
        blueButton.setPreferredSize(new Dimension(16, 16));
        greenButton.setPreferredSize(new Dimension(16,16));
        
        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blackButton);
        panel.add(magentaButton);
        panel.add(blueButton);
        panel.add(clearButton);
        
        content.add(panel, BorderLayout.NORTH);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
