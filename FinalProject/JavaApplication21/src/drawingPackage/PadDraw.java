/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingPackage;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class PadDraw extends JComponent{
    Image image;
    Graphics2D graphics2D;
    private int currentX;
    private int currentY;
    private int oldX;
    private int oldY;
    
    public PadDraw(){
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                oldX = e.getX();
                oldY = e.getY();
            }
        });
        
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
                currentX = e.getX();
                currentY = e.getY();
                graphics2D.drawLine(oldX, oldY, currentX, currentY);
                repaint();
                oldX = currentX;
                oldY = currentY;
            }
        });
                
    }
    @Override
    public void paintComponent(Graphics g){
            if(image == null){
                image = createImage(getSize().width, getSize().height);
                graphics2D = (Graphics2D)image.getGraphics();
                graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                clear();
            }
            g.drawImage(image, 0, 0, null);
    }        
    
    public void clear(){
        graphics2D.setPaint(Color.white);
        graphics2D.fillRect(0, 0, getSize().width, getSize().height);
        graphics2D.setPaint(Color.black);
        repaint();
    }   
    
    public void red(){
        graphics2D.setPaint(Color.red);
        repaint();
        }
    public void black(){
        graphics2D.setPaint(Color.black);
        repaint();
    }
    public void magenta(){
        graphics2D.setPaint(Color.magenta);
        repaint();
    }
    public void green(){
        graphics2D.setPaint(Color.green);
        repaint();
    }
    public void blue(){
        graphics2D.setPaint(Color.blue);
        repaint();
    }
    
}

