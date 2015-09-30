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
public class Abilities {
    private Ability[] abilities;
    private final int MAX_POINTS = 3;
    private int pointsSoftCap;
    private int pointsSpent;
    
    public Abilities(){
        abilities = new Ability[Constants.Abilities.NUM_OF_ABILITIES];
    }
}
