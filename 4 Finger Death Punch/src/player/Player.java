/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import enemies.Enemy;
import player.abilities.ActiveAbilities;
import player.abilities.Ability;

/**
 *
 * @author Eric
 */
public class Player {
/**
 * 
 */
    private static int health;
    /**
     * 
     */
    private static int MAX_HEALTH;
    /**
     * 
     */
    private int projectiles;
    /**
     * 
     */
    private int weapon;
    /**
     * 
     */
    private boolean throwWeapon;
    /**
     * 
     */
    private ActiveAbilities abilities;
    
/**
 * 
 * @param max
 * @param a
 * @param p
 * @param w 
 */
    public Player(int max, ActiveAbilities a, int p, int w) {
        MAX_HEALTH = max;
        health = max;
        abilities = a;
        projectiles = p;
        weapon = w;
        throwWeapon = false;
    }
/**
 * 
 * @param direction 
 */
    public void attack(int direction) {
        if (hasPower(Ability.AbilityName.DEEP_IMPACT)) {

        } else if (hasPower(Ability.AbilityName.SHOCKWAVE)) {

        } else if (hasPower(Ability.AbilityName.SLOW_MOTION)) {

        } else if (throwWeapon) {

        } else if (projectiles != 0) {

        } else {

        }
    }
/**
 * 
 * @return 
 */
    public int getHealth() {
        return health;
    }
/**
 * 
 */
    public void loseHealth() {
        health--;
    }
/**
 * 
 */
    public void gainHealth() {
        if (!fullHealth()) {
            health++;
        }
    }
/**
 * 
 * @return 
 */
    public static boolean fullHealth() {
        return health == MAX_HEALTH;
    }
/**
 * 
 * @return 
 */
    public int getProjectiles() {
        return projectiles;
    }
/**
 * 
 */
    public void reduceProjectiles() {
        projectiles--;
    }
/**
 * 
 */
    public void fillProjectiles() {
        if (projectiles == 0) {
            if (hasPower(Ability.AbilityName.EXTRA_PROJECTILES)) {
                projectiles += 2;
            }
            projectiles++;
        }
    }
/**
 * 
 * @return 
 */
    public boolean infiniteProjectiles() {
        return projectiles == -1;
    }
/**
 * 
 * @return 
 */
    public int getWeaponHitsLeft() {
        return weapon;
    }
/**
 * Occurs when the player picks up a weapon. If the player isn't holding one at the time, a number of turns are added
 */
    public void pickUpWeapon() {
        if (weapon == 0) {
            if (hasPower(Ability.AbilityName.EXTENDED_WEAPON_USE)) {
                weapon += 5;
            }
            weapon += 3;
        } else {
            throwWeapon = true;
        }
    }
/**
 * Returns true if the player is holding a weapon for an infinite amount of time.
 * @return true - If the player is holding a weapon for an infinite amount of time.
 */
    public boolean infiniteWeapon() {
        return weapon == -1;
    }
/**
 * Returns whether or not the player has the specified ability in its ActiveAbilites set.
 * @param p - AbilityName The name of the ability that is being looked for. It is an enumerated value.
 * @return true - if the player has the specified ability in its ActiveAbilites set.
 */
    public boolean hasPower(Ability.AbilityName p) {
        return abilities.hasPower(p);
    }
}
