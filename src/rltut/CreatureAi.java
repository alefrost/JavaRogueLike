/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rltut;

/**
 *
 * @author alexfrost
 */
public class CreatureAi {
    protected Creature creature;
    
    public CreatureAi(Creature creature) {
        this.creature = creature;
        this.creature.setCreatureAi(this);
    }
    
    public void onEnter(int x, int y, Tile tile) { }
} 
