/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemies;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class Enemy_Brawler extends Enemy {

    private ArrayList<ArrayList<Integer>> moves;

    public Enemy_Brawler(ArrayList<ArrayList<Integer>> m) {
        super(Type.BRAWLER,1);
        moves = new ArrayList<>();
        for (ArrayList<Integer> a : m) {
            ArrayList temp = new ArrayList();
            for (int i : a) {
                temp.add(i);
            }
            moves.add(temp);
        }
    }
}
