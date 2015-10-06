package main;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A custom KeyListener that can tell which keys are up, down, and have been
 * hit. It can also tell if any keys are currently pressed as well as save the
 * last KeyEvent.
 *
 * @author stone
 */
public class KeyInput implements KeyListener {

    /**
     * Holds an array of all the keys that are pressed. When a key is pressed
     * and released, the value at the corresponding key code is set to true and
     * false respectively.
     */
    private boolean[] keyPressed;
    /**
     * Holds an array of all keys that have been hit. A single hit counts as a
     * press that hasn't been released. Right after a key is pressed, the value
     * at the corresponding key code is set to true, but after it is read, it is
     * set to false until the next press.
     */
    private boolean[] keyHit;
    /**
     * Holds the information of the last key pressed.
     */
    private KeyEvent lastKeyPressed;

    /**
     * Constructor for the KeyInput object. Assigns this object as the
     * KeyListener to the component given and initializes the boolean arrays
     * that hold the information of the keys.
     *
     * @param c The component that will have this KeyListener assigned to it.
     */
    public KeyInput(Component c) {
        c.addKeyListener(this);
        keyPressed = new boolean[256];
        keyHit = new boolean[256];
        lastKeyPressed = null;
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
    public boolean isKeyHit(int keyCode) {
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
    public boolean isKeyDown(int keyCode) {
        if (keyCode >= 0 && keyCode < 256) {
            return keyPressed[keyCode];
        }
        return false;
    }

    /**
     * Checks if the key corresponding to the given key code is not pressed.
     * Will return true as long as the key is not being pressed.
     *
     * @param keyCode The code of the corresponding key.
     * @return true - If the key is not being pressed.<br>false - If the key is
     * being pressed.
     */
    public boolean isKeyUp(int keyCode) {
        if (keyCode >= 0 && keyCode < 256) {
            return !keyPressed[keyCode];
        }
        return false;
    }

    @Deprecated
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * The method that is called when a key is pressed. On the first key hit, it
     * sets the corresponding value in {@link #keyPressed} and {@link #keyHit}
     * to true as well as setting the {@link #lastKeyPressed} parameter to the
     * KeyEvent that is the parameter.
     *
     * @param e The KeyEvent that was triggered by the key press.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < 256) {
            if (!keyPressed[keyCode]) {
                keyPressed[keyCode] = true;
                keyHit[keyCode] = true;
                lastKeyPressed = e;
            }
        }
    }

    /**
     * The method that is called when a key is released. It sets the
     * corresponding value in {@link #keyPressed} to false.
     *
     * @param e The KeyEvent that was triggered by the key release.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < 256) {
            keyPressed[keyCode] = false;
        }
    }

    /**
     * Checks {@link #keyPressed} to see if there is currently a pressed key.
     * Returns true if there is a pressed key, false if there isn't.
     *
     * @return true - If there is a pressed key.<br>false - If no keys are
     * pressed.
     */
    public boolean anyKeyPressed() {
        for (boolean b : keyPressed) {
            if (b) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the {@link #lastKeyPressed} has been initialized yet.
     *
     * @return true - If {@link #lastKeyPressed} has been initialized.<br>false
     * - If {@link #lastKeyPressed} hasn't been initialized yet.
     */
    private boolean isLastKeyPressedNull() {
        return lastKeyPressed == null;
    }

    /**
     * Returns the {@link #lastKeyPressed} KeyEvent. If there has been no key
     * press yet, an exception is thrown.
     *
     * @return KeyEvent - The last KeyEvent that was registered.
     * @throws NullPointerException thrown if there has been no key press yet.
     */
    public KeyEvent getLastKeyPressed() throws NullPointerException {
        if (!isLastKeyPressedNull()) {
            return lastKeyPressed;
        }
        throw new NullPointerException("laskKeyPressed not initialized.");
    }

    /**
     * Returns the key code of the {@link #lastKeyPressed} KeyEvent. If there
     * has been no key press yet, an exception is thrown.
     *
     * @return int - The key code of the {@link #lastKeyPressed} KeyEvent.
     * @throws NullPointerException thrown if there has been no key press yet.
     */
    public int getLastKeyCode() throws NullPointerException {
        if (!isLastKeyPressedNull()) {
            return lastKeyPressed.getKeyCode();
        }
        throw new NullPointerException("laskKeyPressed not initialized.");
    }

    /**
     * Returns the key char of the {@link #lastKeyPressed} KeyEvent. If there
     * has been no key press yet, an exception is thrown.
     *
     * @return char - The key char of the {@link #lastKeyPressed} KeyEvent.
     * @throws NullPointerException thrown if there has been no key press yet.
     */
    public char getLastKeyChar() throws NullPointerException {
        if (!isLastKeyPressedNull()) {
            return lastKeyPressed.getKeyChar();
        }
        throw new NullPointerException("laskKeyPressed not initialized.");
    }
}
