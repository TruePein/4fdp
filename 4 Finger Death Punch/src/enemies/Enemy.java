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

    protected enum Type {

        GREY,
        THROWER,
        COLORED,
        BRAWLER,
        BOSS
    }
    private Type type;

    public Enemy(Type t) {
        type = t;
    }
}
