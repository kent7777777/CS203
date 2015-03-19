/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameOfLifePackage;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.CENTER;

/**
 *
 * @author Kevin
 */
public class GameOfLife extends JFrame {

    private JFrame frame;
    private int i;
    private int j;
    private myDrawPanel drawPanel = new myDrawPanel();
    private boolean[][] cells = new boolean[25][25];
    private boolean[][] newCells = new boolean[cells.length][cells[0].length];
    private int surrounding;
    private boolean alive = false;
    private Scanner enter = new Scanner(System.in);
    private int tf = 0;
    private LifeCheck checker = new LifeCheck();

    public static void main(String[] args) {
        GameOfLife start = new GameOfLife();
        start.go();
    }

    public class myDrawPanel extends JPanel {

        @Override
        public void paintComponent(Graphics gr) {
            gr.setColor(Color.BLUE);

            for (i = 0; i < cells.length; i++) {

                for (j = 0; j < cells[i].length; j++) {

                    surrounding = checker.Check(cells, i, j);
                    alive = checker.isAlive(cells[i][j], surrounding);
                    newCells[i][j] = alive;
                    if (alive) {
                        gr.fillOval(j * 20, i * 20, 20, 20);
                    }
                }
            }
            cells = newCells;

        }
    }

    public void go() {
        frame = new JFrame("Game of Life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        drawPanel.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(CENTER, drawPanel);
        frame.pack();
        frame.setVisible(true);

        for (boolean[] cell : cells) {
            for (j = 0; j < cell.length; j++) {
                tf = (int) (Math.random() * 4);
                if (tf < 1) {
                    cell[j] = true;
                } else {
                    cell[j] = false;
                }
            }
        }

        while (true) {
            frame.repaint();
            enter.nextLine();

        }
    }
}
