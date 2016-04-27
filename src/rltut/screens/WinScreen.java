/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rltut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

/**
 *
 * @author alexfrost
 */
public class WinScreen implements Screen {
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("You won.", 1, 1);
        terminal.writeCenter("-- press [enter] to restart --", 22);
    }
    
    public Screen respondToUserInput(KeyEvent key) {
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
    }
}
