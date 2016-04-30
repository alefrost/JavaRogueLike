/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rltut;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alexfrost
 */
public class World {
    private Tile[][] tiles;
    private int width;
    public int width() { return width; }
    
    private int height;
    public int height() { return height; }
    
    private List<Creature> creatures;
    public List<Creature> creatures() {
        return creatures;
    }
    public Creature creature(int x, int y) {
        for (Creature c : creatures) {
            if (c.x == x && c.y == y ) {
                return c;
            }
        }
        return null;
    }
    
    public World(Tile[][] tiles) {
        this.tiles = tiles;
        this.width = tiles.length;
        this.height = tiles[0].length;
        this.creatures = new ArrayList<Creature>();
    }
    
    /*
     * Returns the tile at the given coordinates. 
     * If the requested coordinates are outside of the 
     * world, then it will return Tile.BOUNDS
     */
    public Tile tile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height)
            return Tile.BOUNDS;
        else
            return tiles[x][y];
    }
    
    /*
     * Returns the glyph to display at the given coordinates
     */
    public char glyph(int x, int y) {
        return tile(x,y).glyph();
    }
    
    /*
     * Returns the color of the tile at the given coordinates
     */
    public Color color(int x, int y) {
        return tile(x,y).color();
    }
    
    /*
     * Changes the tile at the specified coordinates to a
     * FOOR tile if it is diggable.
     */
    public void dig(int x, int y) {
        if (tile(x,y).isDiggable()) {
            tiles[x][y] = Tile.FLOOR;
        }
    }
    
    /*
     * Places the given creature at a random, valid, unoccupied tile.
     */
    public void addAtEmptyLocation(Creature creature) {
        int x;
        int y;
        
        do {
            x = (int)(Math.random() * width);
            y = (int)(Math.random() * height);
        }
        while (!tile(x,y).isGround() || creature(x,y) != null);
        
        creature.x = x;
        creature.y = y;
        creatures.add(creature);
    }
    
    /*
     * Removes a creature from the world
     */
    public void remove(Creature other) {
        creatures.remove(other);
    }
    
    public void update() {
        List<Creature> toUpdate = new ArrayList<Creature>(creatures);
        for (Creature creature : toUpdate) {
            creature.update();
        }
    }
}
