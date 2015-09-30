/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.finger.death.punch;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Eric
 */
public class MainScreen extends JFrame implements KeyListener {

    public MainScreen() {
        super("4 Finger Death Punch");
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new StartPanel(this));
//        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {//shouldnt be implemented until actual levels
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP: {
                upPressed();
                break;
            }
            case KeyEvent.VK_RIGHT: {
                rightPressed();
                break;
            }
            case KeyEvent.VK_DOWN: {
                downPressed();
                break;
            }
            case KeyEvent.VK_LEFT: {
                leftPressed();
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    
    private void upPressed(){//advance to next scren //depends on what is selected when up is pressed
        //JOptionPane.showMessageDialog(rootPane, "Up pressed");
        this.setVisible(false);
    }
    
    private void rightPressed(){//chooses next option
        JOptionPane.showMessageDialog(rootPane, "Right pressed");
    }
    
    private void downPressed(){//exit
        System.exit(0);
    }
    
    private void leftPressed(){//choses right option
        JOptionPane.showMessageDialog(rootPane, "Left pressed");
    }
}
