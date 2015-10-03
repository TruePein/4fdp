/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Eric
 */
public class Constants {

    public static class Abilities {

        //ability status
        protected class AbilityStatus {
            public static final int LOCKED = 0;
            public static final int UNLOCKED = 1;
            public static final int EQUIPED = 2;
        }
        //ability cooldowns
        protected class AbilityCooldowns{
            public static final int EXTRA_PROJECTILES_COOLDOWN = 1;
            public static final int EXTENDED_WEAPON_USE_COOLDOWN = 1;
            public static final int EXTENDED_RANGE_COOLDOWN = 30;
            public static final int HEAL_COOLDOWN = 99;
            public static final int DEFLECT_GREY_COOLDOWN = 50;
            public static final int DEFLECT_COLOR_COOLDOWN = 40;
            public static final int RAIN_WEAPONS_COOLDOWN = 35;
            public static final int SLOW_ENEMIES_COOLDOWN = 36;
            public static final int SLOW_ASSAULT_COOLDOWN = 37;
            public static final int SHOCKWAVE_COOLDOWN = 41;
            public static final int DEEP_IMPACT_COOLDOWN = 51;
            public static final int GREY_OUT_COOLDOWN = 55;
            public static final int SLOW_MOTION_COOLDOWN = 57;
        }
        public static final int NUM_OF_ABILITIES = 11;
    }
    
    protected enum Directions{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
