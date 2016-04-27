/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rltut;

import java.awt.Color;

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
    
    public World(Tile[][] tiles) {
        this.tiles = tiles;
        this.width = tiles.length;
        this.height = tiles[0].length;
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
}
