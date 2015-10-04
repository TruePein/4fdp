/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemies;

/**
 *
 * @author Eric
 */
public class Enemy {

    /**
     *
     */
    protected enum Type {

        GREY,
        THROWER,
        SPRINTER,
        COLORED,
        BRAWLER,
        BOSS
    }
    /**
     *
     */
    private Type type;
    /**
     *
     */
    private int x;
    /**
     *
     */
    private int y;
    /**
     *
     */
    private float dx;
    /**
     *
     */
    private float dy;
    /**
     *
     */
    private player.Player target;
    /**
     *
     */
    private int speed;

    /**
     *
     * @param t
     * @param s
     */
    public Enemy(Type t, int s) {
        type = t;
        speed = s;
    }

    /**
     *
     */
    public void move() {
        int xDiff = x - target.getX();
        int yDiff = y - target.getY();
    }

    /**
     *
     * @param x
     * @param y
     */
    public void move(int x, int y) {

    }
}
