/*
Copyright (C) 2020  Alessandro Giaquinto agiaquinto87@gmail.com
This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
