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
public class ActiveAbilities {

    /**
     * The array of abilities that will be active.
     */
    protected Ability[] activeAbilities;

    /**
     *
     * @param a Ability[] - The array of abilities that will be active.
     */
    public ActiveAbilities(Ability[] a) {
        activeAbilities = new Ability[a.length];
        System.arraycopy(a, 0, activeAbilities, 0, a.length);
    }

    /**
     * Checks the array of active abilities for the ability specified in the
     * parameter. Calling function would need to use
     * Ability.AbilityName.{ability name here}
     *
     * @param p Assumed to be a constant already predefined.
     * @return true - if the specified ability is in the array of active
     * abilities.
     */
    public boolean hasPower(Ability.AbilityName p) {
        for (Ability a : activeAbilities) {
            if (a.getNAME() == p) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the ability at the specified location. If the specified value
     * falls outside the range of the array, null will be returned.
     *
     * @param i int - The position in the array to get the ability from.
     * @return Ability - The ability at the specified location. Null - If i is
     * outside the range of the array.
     */
    public Ability getAbility(int i) {
        if (i < activeAbilities.length && i >= 0) {
            return activeAbilities[i];
        }
        return null;
    }
}
