/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.abilities;

/**
 * Ability to heal the player for 1 health. If the player isn't at full health,
 * then the ability will activate instantly. Else, the ability will wait until
 * the player takes damage before activating.
 *
 * @author stone
 */
public class A_Heal extends Ability {

    /**
     * Constructor for the ability. No parameters needed.
     */
    public A_Heal() {
        super(AbilityName.HEAL, 99, true);
    }

    /**
     * Activates the ability. If the player is already at full health, the
     * countdown won't reset, and the game will keep trying to activate it.
     */
    @Override
    public void activate() {
        if (player.Player.fullHealth()) {
            turnsUntilUse = COOLDOWN;
        }
    }
}
