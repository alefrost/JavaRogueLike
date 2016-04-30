/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rltut;

import asciiPanel.AsciiPanel;

/**
 *
 * @author alexfrost
 */
public class CreatureFactory {
    private World world;
    
    public CreatureFactory(World world) {
        this.world = world;
    }
    
    public Creature newPlayer() {
        Creature player = new Creature(world, '@', AsciiPanel.brightWhite);
        world.addAtEmptyLocation(player);
        new PlayerAi(player);
        return player;
    }
}
