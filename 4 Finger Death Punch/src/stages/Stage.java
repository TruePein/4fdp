/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stages;

/**
 *
 * @author stone
 */
public class Stage {

    protected enum Type {

        MOB,
        SPEED,
        PROJECTILE,
        DEFENDER,
        MULTI,
        INFINITE,
        BOSS
    }
    
    protected Type type;
    protected boolean abilitiesAllowed;
    protected int speed;
}
