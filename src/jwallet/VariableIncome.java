/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
