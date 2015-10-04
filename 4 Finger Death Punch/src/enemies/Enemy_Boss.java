/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemies;

/**
 *
 * @author stone
 */
public class Enemy_Boss extends Enemy{
    
    public Enemy_Boss(Enemy_Colored[] s){
        super(Type.BOSS,1);
    }
    private int totalHealth;
    private Enemy_Colored[] stages;
}
