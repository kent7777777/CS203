package UpdatedBall;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static java.awt.BorderLayout.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static javax.swing.JFrame.*;

/**
 *
 * @author mzijlstra
 */
public class BallAnimation {

    private JFrame frame;
    private int x = 0;
    private int y = 0;
    private int ChangeY = 0;
    private int ChangeX = 0;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;

    public static void main(String[] args) {
        BallAnimation a = new BallAnimation();
        a.go();
    }

    public void go() {
        frame = new JFrame("Moving ball");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        DrawPanel d = new DrawPanel();
        frame.getContentPane().add(CENTER, d);
        MyKeyListener keys = new MyKeyListener();
        frame.addKeyListener(keys);
        frame.setSize(600, 600);
        frame.setVisible(true);
        

        while(true){
            if (up) {
                ChangeY -=1;
            } else if (down) {
                ChangeY += 1;
            }
            if (left) {
                ChangeX -= 1;
            } else if (right) {
                ChangeX += 1;
            }
            x += ChangeX;
            y += ChangeY;
            if(x > 575){
                x = 575;
            }
            if(x < 25){
                x = 25;
            }
            if(y > 575){
                y = 575;
            }
            if(y < 25){
                y = 25;
            }
            try{
            frame.repaint();
            Thread.sleep(10);
            }catch(Exception e){
                
            }
        }

    }
    
    public class MyKeyListener implements KeyListener{
        
        
        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = true;
            }
            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = true;
            }
            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = true;
            }
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = false;
            }
        
        }
    }

    public class DrawPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {


            g.setColor(Color.blue);
            g.fillOval(x, y, 25, 25);
        }
    }

}