/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Eric
 */
public class StartPanel extends JPanel implements KeyListener{

    private JFrame frame;
    
    public StartPanel(JFrame f) {
        frame = f;
        addKeyListener(this);
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:{
                upPressed();
                break;
            }
            case KeyEvent.VK_RIGHT:{
                rightPressed();
                break;
            }
            case KeyEvent.VK_DOWN:{
                downPressed();
                break;
            }
            case KeyEvent.VK_LEFT:{
                leftPressed();
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void upPressed(){//advance to next scren //depends on what is selected when up is pressed
        //JOptionPane.showMessageDialog(rootPane, "Up pressed");
        this.setVisible(false);
    }
    
    private void rightPressed(){//chooses next option
        JOptionPane.showMessageDialog(frame.getRootPane(), "Right pressed");
    }
    
    private void downPressed(){//exit
        System.exit(0);
    }
    
    private void leftPressed(){//choses right option
        JOptionPane.showMessageDialog(frame.getRootPane(), "Left pressed");
    }
    
}
