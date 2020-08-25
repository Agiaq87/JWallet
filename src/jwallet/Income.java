/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwallet;

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
