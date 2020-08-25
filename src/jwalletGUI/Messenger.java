/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwalletGUI;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * Class to manage message of main application with an Swing.jLabel
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
    
    
    public void setPositiveMsg(String msg) {
        display.setForeground(Color.GREEN);
        display.setText(msg);
    }
    
    
    private javax.swing.JLabel display;
}
