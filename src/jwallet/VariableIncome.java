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
package jwallet;

import java.util.Objects;

/**
 * Variable Income
 * @author alessandrogiaquinto
 */
public class VariableIncome extends Income {
    
    /**
     * Constructor of
     * @param name
     * @param value 
     */
    public VariableIncome(String name, double value) {
        super(name, value);
        this.description = "";
    }

    public VariableIncome(String name, double value, String description) {
        super(name, value);
        this.description = description;
    }
    
    /**
     * Return description of
     * @return String description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Set description of
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Return values of
     * @return String values
     */
    @Override
    public String toString() {
        return "VariableIncome{" + 
                "\nName=" + super.getName() +
                "\nValue=" + super.getValue() +
                "\nRounded=" + super.getRounded() +
                "\nDescription=" + description + 
                '}';
    }
    
    /**
     * Equals method
     * @param obj
     * @return boolean equals
     */
    @Override
    public boolean equals(Object obj) {
        if( obj != null && obj instanceof VariableIncome){
            boolean pass = super.equals(obj); 
            VariableIncome t = (VariableIncome)obj;
            
            return this.description.equals(t.description);
        }
        
        return false;
    }
    
    
    private String description;
}
