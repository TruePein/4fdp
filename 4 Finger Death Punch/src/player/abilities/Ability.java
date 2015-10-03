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
public abstract class Ability {

    /**
     * The name of the ability.
     */
    protected final AbilityName NAME;
    /**
     * The maximum cooldown of the ability. Generally, the number of turn that
     * must occur between uses.
     */
    protected final int COOLDOWN;
    /**
     * The current cooldown of the ability. The number of turns until the next
     * use of the ability.
     */
    protected int turnsUntilUse;
    /**
     * Whether or not the ability activates immediately when the cooldown
     * reaches 0 of if the will be activated on the next turn.
     */
    protected final boolean ACTIVATE_INSTANTLY;

    /**
     * The enumerated values of the names that the ability can have.
     */
    public enum AbilityName {

        EXTRA_PROJECTILES,
        EXTENDED_WEAPON_USE,
        EXTENDED_RANGE,
        HEAL,
        DEFLECT_GREY,
        DEFLECT_COLOR,
        RAIN_WEAPONS,
        SLOW_ENEMIES,
        SLOW_ASSAULT,
        SHOCKWAVE,
        DEEP_IMPACT,
        GREY_OUT,
        SLOW_MOTION
    }

    /**
     * Constructor for the ability class.
     *
     * @param n The name of the ability, as an enumerated value.
     * @param cd The cooldown of the ability.
     * @param ai Whether or not the ability is activated instantly or on the
     * next move.
     */
    public Ability(AbilityName n, int cd, boolean ai) {
        NAME = n;
        COOLDOWN = cd;
        turnsUntilUse = cd;
        ACTIVATE_INSTANTLY = ai;
    }

    /**
     * Reduces the cooldown of the ability. When the cooldown reaches 0, the
     * ability will activate.
     */
    public void reduceCooldown() {
        if (turnsUntilUse > 0) {
            turnsUntilUse--;
            if (turnsUntilUse == 0 && ACTIVATE_INSTANTLY) {
                activate();
            }
        }
    }

    /**
     * Activates the ability. Each ability will do different things. Their
     * implementation depends on the subclass.
     */
    public abstract void activate();

    /**
     * Returns the number of turns until the ability can be used.
     *
     * @return int - Returns the number of turns until the ability can be used.
     */
    public int getTurnsUntilUse() {
        return turnsUntilUse;
    }

    /**
     * Returns the name of the ability as an enumerated value.
     *
     * @return AbilityName - Returns the name of the ability as an enumerated
     * value.
     */
    public AbilityName getNAME() {
        return NAME;
    }

    /**
     * Returns the maximum cooldown of the ability. No matter how many turns
     * there are until use, this will return the same number.
     *
     * @return int -Returns the maximum cooldown of the ability.
     */
    public int getCOOLDOWN() {
        return COOLDOWN;
    }
}
