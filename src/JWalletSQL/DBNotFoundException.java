/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JWalletSQL;

/**
 *
 * @author alessandrogiaquinto
 */
public class DBNotFoundException extends Exception {

    public DBNotFoundException() {
        super("DB file not exist");
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
