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
public class Player {
    
    private int health;
    private final int MAX_HEALTH;
    private int projectiles;
    private int weapon;
    private boolean throwWeapon;
    private ActiveAbilities abilities;
    private Enemy upTarget;
    private Enemy rightTarget;
    private Enemy downTarget;
    private Enemy leftTarget;
    
    public Player(int max, ActiveAbilities a, int p, int w){
        MAX_HEALTH = max;
        health = max;
        abilities = a;
        projectiles = p;
        weapon = w;
        throwWeapon = false;
    }
    
    public void attack(int direction){
        if(hasPower(Constants.Abilities.AbilityNames.DEEP_IMPACT)){
            
        }else if(hasPower(Constants.Abilities.AbilityNames.SHOCKWAVE)){
            
        }else if(hasPower(Constants.Abilities.AbilityNames.SLOW_MOTION)){
            
        }else if(throwWeapon){
            
        }else if(projectiles!=0){
            
        }else{
            
        }
    }
    
    public int getHealth(){
        return health;
    }
    public void loseHealth(){
        health--;
    }
    public void gainHealth(){
        if(!fullHealth())
            health++;
    }
    public boolean fullHealth(){
        return health==MAX_HEALTH;
    }
    
    public int getProjectiles(){
        return projectiles;
    }
    public void reduceProjectiles(){
        projectiles--;
    }
    public void fillProjectiles(){
        if(projectiles==0){
            if(hasPower(Constants.Abilities.AbilityNames.EXTRA_PROJECTILES))
                projectiles+=2;
            projectiles++;
        }
    }
    public boolean infiniteProjectiles(){
        return projectiles==-1;
    }
    
    public int getWeaponHitsLeft(){
        return weapon;
    }
    public void pickUpWeapon(){
        if(weapon==0){
            if(hasPower(Constants.Abilities.AbilityNames.EXTENDED_WEAPON_USE))
                weapon+=5;
            weapon+=3;
        }else{
            throwWeapon = true;
        }
    }
    public boolean infiniteWeapon(){
        return weapon==-1;
    }
    public boolean hasPower(int p){
        return abilities.hasPower(p);
    }
}
