/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotepadPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class MyNotePad {
    private JFrame frame;
    private JTextArea field;
    private JButton sB;
    private JButton lB;
    private JPanel panel;
    public static void main(String[] args){
        MyNotePad pad = new MyNotePad();
        pad.go();
    }
    public void go(){
        frame = new JFrame("Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        field = new JTextArea();
        sB = new JButton("Save");
        sB.addActionListener(new MyListener());
        lB = new JButton("Load");
        lB.addActionListener(new MyListener());
        panel = new JPanel();
        panel.add(sB);
        panel.add(lB);
        
        
        
        frame.getContentPane().add(BorderLayout.CENTER, field);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
        
    }
    public class MyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if(b.getText() == "Save"){
            try{
                FileWriter writer = new FileWriter("notes.txt");
                writer.write(field.getText());
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MyNotePad.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else if(b.getText() == "Load"){
                try{
                    String text = new String(Files.readAllBytes(Paths.get("notes.txt")));
                    field.setText(text);
                } catch (IOException ex) {
                    Logger.getLogger(MyNotePad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
