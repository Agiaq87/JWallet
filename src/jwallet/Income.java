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
package JWallet;

import java.util.Objects;

/**
 * Income class
 * @author alessandrogiaquinto
 */
public abstract class Income {
    
    /**
     * Constructor
     * @param name
     * @param value
     */
    public Income(String name, double value) {
        this.name = name;
        this.value = value;
        this.rounded = (int)value;
    }
    
    /**
     * Return name of
     * @return String name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set name of
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Return value of
     * @return 
     */
    public double getValue() {
        return value;
    }
    
    /**
     * Set value of
     * @param value 
     */
    public void setValue(double value) {
        this.value = value;
    }
    
    /**
     * Return rounded value of
     * @return 
     */
    public int getRounded() {
        return rounded;
    }   
    
    /**
     * Equals method
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Income) {
            Income t = (Income)obj;
            
            return this.name.equals(t.getName()) && this.value == t.getValue();
        }
        
        return false;
    }
    
    
     
    
    private String name;
    private double value;
    private int rounded;
}
