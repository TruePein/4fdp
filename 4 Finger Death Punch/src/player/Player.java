/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import main.MainScreen;
import player.abilities.ActiveAbilities;
import player.abilities.Ability;

/**
 *
 * @author Eric
 */
public class Player {

    /**
     * Boolean for knowing when the player is busy in an animation. If the
     * player is busy, no other input will be accepted.
     */
    private boolean busy;
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
     * X position of the player. The player is always in the center of the
     * screen, so this never changes.
     */
    private final int X;
    /**
     * Y position of the player. The player is always in the center of the
     * screen, so this never changes.
     */
    private final int Y;
    /**
     *
     */
    private final main.MainScreen mainScreen;

    /**
     *
     * @param ms
     * @param max
     * @param a
     * @param p
     * @param w
     */
    public Player(MainScreen ms, int max, ActiveAbilities a, int p, int w) {
        MAX_HEALTH = max;
        health = max;
        abilities = a;
        projectiles = p;
        weapon = w;
        throwWeapon = false;
        mainScreen = ms;
        X = ms.getMiddleX();
        Y = ms.getMiddleY();
        busy = false;
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
     * Occurs when the player picks up a weapon. If the player isn't holding one
     * at the time, a number of turns are added
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
     * Returns true if the player is holding a weapon for an infinite amount of
     * time.
     *
     * @return true - If the player is holding a weapon for an infinite amount
     * of time.
     */
    public boolean infiniteWeapon() {
        return weapon == -1;
    }

    /**
     * Returns whether or not the player has the specified ability in its
     * ActiveAbilites set.
     *
     * @param p AbilityName The name of the ability that is being looked for. It
     * is an enumerated value.
     * @return true - if the player has the specified ability in its
     * ActiveAbilites set.
     */
    public boolean hasPower(Ability.AbilityName p) {
        return abilities.hasPower(p);
    }

    /**
     * Returns the x-value coordinate of the player.
     *
     * @return int - The x-value coordinate of the player.
     */
    public int getX() {
        return X;
    }

    /**
     * Returns the y-value coordinate of the player.
     *
     * @return int - The y-value coordinate of the player.
     */
    public int getY() {
        return Y;
    }
}
