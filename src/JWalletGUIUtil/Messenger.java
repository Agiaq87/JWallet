/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JWalletGUIUtil;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * Display message in main view
 * @author alessandrogiaquinto
 */
public class Messenger {
    
    /**
     * Constructor of
     * @param display 
     */
    public Messenger(JLabel display) {
        this.display = display;
    }
    
    /**
     * Set a message with green color
     * @param msg 
     */
    public void setPositiveMessage(String msg) {
        this.display.setForeground(Color.GREEN);
        this.display.setText(msg);
    }
    
    public void setErrorMessage(String msg) {
        this.display.setForeground(Color.red);
        this.display.setText(msg);
    }
    
    private final JLabel display;
}
