/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author Eric
 */
public class StartPanel extends JPanel {

    private JFrame frame;
    private KeyInput input;
    private ImageIcon image;
    private BufferedImage backBuffer;
    private int options;

    public StartPanel(JFrame f) {
        frame = f;

    }

    public void run() {
        initialize();
        while (true) {
            update();
        }
    }

    public void initialize() {
        input = new KeyInput(this);
        JLabel img = new JLabel(new ImageIcon("src\\main\\resources\\images\\start screen\\test.jpg"));
        this.add(img);
        frame.repaint();
        frame.pack();
    }

    public void update() {
        if (input.isKeyHit(KeyEvent.VK_UP)) {
            upPressed();
        }
        if (input.isKeyHit(KeyEvent.VK_DOWN)) {
            downPressed();
        }
        if (input.isKeyHit(KeyEvent.VK_RIGHT)) {
            rightPressed();
        }
        if (input.isKeyHit(KeyEvent.VK_LEFT)) {
            leftPressed();
        }
    }

    private void upPressed() {//advance to next scren //depends on what is selected when up is pressed
        switch (options) {
            case 0: {//play
                this.removeAll();
                frame.repaint();
                break;
            }
            case 1: {//settings
                this.removeAll();
                JLabel img = new JLabel(new ImageIcon("src\\main\\resources\\images\\start screen\\test.jpg"));
                this.add(img);
                frame.repaint();
                frame.pack();
                break;
            }
            case 2: {//credits
                break;
            }
            case 3: {//score?
                break;
            }
        }
    }

    private void rightPressed() {//chooses next option
        if (options < 2) {
            options++;
        }
    }

    private void downPressed() {//exit
        System.exit(0);
    }

    private void leftPressed() {//choses right option
        if (options > 0) {
            options--;
        }
    }

}
