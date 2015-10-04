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
public class A_ExtendedWeaponUse extends Ability {

    /**
     * Constructor for the ability. No parameters needed.
     */
    public A_ExtendedWeaponUse() {
        super(AbilityName.EXTENDED_WEAPON_USE, 1, false);
    }

    /**
     * Activates the ability. Activates when the player picks up a melee weapon.
     * If the player doesn't pick up a weapon, the game will keep trying to
     * activate it after every turn. It will only reset it's cooldown when the
     * player drops the weapon(automatic).
     */
    @Override
    public void activate() {

    }
}
