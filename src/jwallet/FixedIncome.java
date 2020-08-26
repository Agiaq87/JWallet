/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwallet;

/**
 * Fixed Income class
 * @author alessandrogiaquinto
 */
public class FixedIncome extends Income{

    /**
     * Constructor of
     * with default period
     * @param name
     * @param value 
     */
    public FixedIncome(String name, double value) {
        super(name, value);
        this.period = Period.DAILY;
    }
    
    /**
     * Constructor of
     * @param period
     * @param name
     * @param value 
     */
    public FixedIncome(Period period, String name, double value) {
        super(name, value);
        this.period = period;
    }
    
    
    
    
    
    private Period period;
}
