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
public class Ability {
    private final Constants.Abilities.AbilityNames ID;
    private final int COOLDOWN;
    private int turnsUntilUse;
    private final boolean ACTIVATE_INSTANTLY;
    
    public Ability(Constants.Abilities.AbilityNames id, int cd, boolean ai){
        ID = id;
        COOLDOWN = cd;
        turnsUntilUse = cd;
        ACTIVATE_INSTANTLY = ai;
    }
    
    public void reduceCooldown(){
        if(turnsUntilUse>0){
            turnsUntilUse--;
            if(turnsUntilUse==0&&ACTIVATE_INSTANTLY){
                activate();
            }
        }
    }
    
    public void activate(){
        turnsUntilUse = COOLDOWN;
    }
    
    public int getTurnsUntilUse(){
        return turnsUntilUse;
    }
    
    public Constants.Abilities.AbilityNames getID(){
        return ID;
    }
}
