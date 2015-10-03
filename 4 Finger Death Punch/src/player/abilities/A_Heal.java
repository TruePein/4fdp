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
public class A_Heal extends Ability{
    
    public A_Heal(){
        super(AbilityName.HEAL, 99, true);
    }
    
    @Override
    public void activate(){
        if(player.Player.fullHealth()){
            turnsUntilUse = COOLDOWN;
        }
    }
}
