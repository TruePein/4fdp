/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author stone
 */
public class KeyInput implements KeyListener {

    /**
     * Holds an array of all the keys that are released. When they get
     * released,the value at the corresponding key code is set to false.
     */
    private boolean[] keyReleased;
    /**
     * Holds an array of all the keys that are pressed. When a key is pressed
     * and released, the value at the corresponding key code is set to true and
     * false respectively.
     */
    private boolean[] keyPressed;
    /**
     * Holds an array of all keys that have been hit. A single hit counts as a
     * press that hasn't been released.
     */
    private boolean[] keyHit;

    /**
     * Constructor for the KeyInput object. Assigns this object as the
     * KeyListener to the component given and initializes the boolean arrays
     * that hold the information of the keys.
     *
     * @param c The component that will have this KeyListener assigned to it.
     */
    public KeyInput(Component c) {
        c.addKeyListener(this);
        keyReleased = new boolean[256];
        for (int i = 0; i < keyReleased.length; i++) {
            keyReleased[i] = false;
        }
        keyPressed = new boolean[256];
        keyHit = new boolean[256];
    }

    /**
     * Checks if the key corresponding to the given key code has been hit. A hit
     * counts as a single press that has yet to be released. This method returns
     * true the first time it is called during a press and false the rest of the
     * time.
     *
     * @param keyCode The code of the corresponding key.
     * @return true - On the first call of a key that has been hit.<br>false -
     * On any subsequent calls or if the hey hasn't been hit.
     */
    public boolean isHeyHit(int keyCode) {
        if (keyCode >= 0 && keyCode < 256) {
            if (keyHit[keyCode]) {
                keyHit[keyCode] = false;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the key corresponding to the given key code has been pressed.
     * Will return true as long as the key is being pressed.
     *
     * @param keyCode The code of the corresponding key.
     * @return true - If the key is being pressed.<br>false - If the key is not
     * being pressed.
     */
    public boolean isKeyPressed(int keyCode) {
        if (keyCode >= 0 && keyCode < 256) {
            return keyPressed[keyCode];
        }
        return false;
    }

    @Deprecated
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * The method that is called when a key is pressed. It sets the
     * corresponding value in keyPressed to true, and on the first key hit, the
     * value in keyReleased and keyHit to false ant true respectively.
     *
     * @param e The KeyEvent that was triggered by the key press.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < 256) {
            keyPressed[keyCode] = true;
            if (keyReleased[keyCode]) {
                keyReleased[keyCode] = false;
                keyHit[keyCode] = true;
            }
        }
    }

    /**
     * The method that is called when a key is released. It sets the
     * corresponding value in keyReleased and keyPressed to true and false
     * respectively.
     *
     * @param e The KeyEvent that was triggered by the key press.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < 256) {
            keyReleased[keyCode] = true;
            keyPressed[keyCode] = false;
        }

    }
}
