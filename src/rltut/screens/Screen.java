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
public interface Screen {
    public void displayOutput(AsciiPanel terminal);
    
    public Screen respondToUserInput(KeyEvent Key);
}
