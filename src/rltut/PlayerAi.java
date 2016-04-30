/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rltut;

/**
 *
 * @author alexfrost
 */
public class PlayerAi extends CreatureAi {
    public PlayerAi(Creature creature) {
        super(creature);
    }
    
    public void onEnter(int x, int y, Tile tile) {
        if (tile.isGround()) {
            creature.x = x;
            creature.y = y;
        } else if (tile.isDiggable()) { 
            creature.dig(x,y);
        }
    }
}
