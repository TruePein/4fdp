/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.abilities;

/**
 *
 * @author Eric
 */
public class A_ExtraProjectiles extends Ability {

    /**
     * Constructor for the ability. No parameters needed.
     */
    public A_ExtraProjectiles() {
        super(AbilityName.EXTRA_PROJECTILES, 1, false);
    }

    /**
     * Activates the ability. Activates when the player defeats an enemy holding
     * projectiles in close combat. If the enemy isn't holding projectiles, the
     * game will keep trying to activate it after every turn. It will only reset
     * it's cooldown when the player throws his last projectile.
     */
    @Override
    public void activate() {

    }
}
