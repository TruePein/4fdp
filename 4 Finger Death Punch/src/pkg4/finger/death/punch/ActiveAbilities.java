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
public class ActiveAbilities {
    private Ability[] activeAbilities;
    
    public ActiveAbilities(Ability[] a){
        activeAbilities = new Ability[a.length];
        System.arraycopy(a, 0, activeAbilities, 0, a.length);
    }
    
    /**
     * Checks the array of active abilities for the ability specified in the parameter.
     * Calling function would need to use Constants.Abilities.AbilityNames.{ability name here}
     * 
     * @param p Assumed to be a constant already predefined.
     * @return 
     */
    public boolean hasPower(Constants.Abilities.AbilityNames p){
        for(Ability a: activeAbilities){
            if(a.getID()==p){
                return true;
            }
        }
        return false;
    }
}
