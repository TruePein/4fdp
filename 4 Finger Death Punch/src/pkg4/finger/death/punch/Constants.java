/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.finger.death.punch;

/**
 *
 * @author Eric
 */
public class Constants {

    protected class Abilities {

        //ability status
        protected class AbilityStatus {
            public static final int LOCKED = 0;
            public static final int UNLOCKED = 1;
            public static final int EQUIPED = 2;
        }
        //ability names
        protected class AbilityNames {
            public static final int EXTRA_PROJECTILES = 0;
            public static final int EXTENDED_WEAPON_USE = 1;
            public static final int EXTENDED_RANGE = 2;
            public static final int HEAL = 3;
            public static final int DEFLECT_GREY = 4;
            public static final int DEFLECT_COLOR = 5;
            public static final int RAIN_WEAPONS = 6;
            public static final int SLOW_ENEMIES = 7;
            public static final int SLOW_ASSAULT = 8;
            public static final int SHOCKWAVE = 9;
            public static final int DEEP_IMPACT = 10;
            public static final int GREY_OUT = 11;
            public static final int SLOW_MOTION = 12;
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
    
    protected class Enemies{
        protected class Type{
            public static final int GREY = 0;
            public static final int THROWER = 1;
            public static final int COLORED = 2;
            public static final int BRAWLER = 3;
        }
    }
    
    protected class Directions{
        public static final int UP = 0;
        public static final int RIGHT = 1;
        public static final int DOWN = 2;
        public static final int LEFT = 3;
    }
    
    protected class Stages{
        protected class Type{
            public static final int MOB = 0;
            public static final int SPEED = 1;
            public static final int PROJECTILE = 2;
            public static final int DEFENDER = 3;
            public static final int MULTI = 4;
            public static final int INFINITE = 5;
            public static final int BOSS = 6;
        }
    }
}
