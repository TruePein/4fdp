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
public class Enemy_Colored extends Enemy {

    public Enemy_Colored(int h, Directions[] o) {
        super(Type.COLORED);
        hits = hitsLeft = h;
        order = new Directions[o.length];
        System.arraycopy(o, 0, order, 0, o.length);
        orderPointer = 0;
    }

    private enum Directions {

        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private final int hits;
    private int hitsLeft;
    private final Directions[] order;
    private int orderPointer;

    public int getHits() {
        return hits;
    }

    public int getHitsLeft() {
        return hitsLeft;
    }
}
