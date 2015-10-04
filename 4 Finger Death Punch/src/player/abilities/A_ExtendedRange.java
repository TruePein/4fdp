/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.abilities;

/**
 *
 * @author stone
 */
public class A_ExtendedRange extends Ability {

    /**
     * Constructor for the ability. No parameters needed.
     */
    public A_ExtendedRange() {
        super(AbilityName.EXTENDED_RANGE, 30, true);
    }

    /**
     * Activates the ability. Activates when the player defeats 30 enemies. This
     * will extend the range that the player can attack an enemy. It will begin
     * it's cooldown after the effect has worn off.
     */
    @Override
    public void activate() {

    }
}
