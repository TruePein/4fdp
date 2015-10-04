/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author Eric
 */
public class MainScreen extends JFrame{

    public MainScreen() {
        super("4 Finger Death Punch");
        wWidth = 400;
        wHeight = 400;
        setSize(wWidth, wHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        insets = getInsets();
        setSize(insets.left+wWidth+insets.right, insets.top+wHeight+insets.bottom);
        add(new StartPanel(this));
//        addKeyListener(this);
    }
    
    private int fps;
    private int wWidth;
    private int wHeight;
    private BufferedImage backBuffer;
    private Insets insets;
    private KeyInput input;
    
    public void run(){
        initialize();
    }
    
    public void initialize(){
        backBuffer = new BufferedImage(wWidth, wHeight, BufferedImage.TYPE_INT_RGB);
        input=new KeyInput(this);
    }
    
    public void update(){
        
    }
    
    public void draw(){
        
    }
}
