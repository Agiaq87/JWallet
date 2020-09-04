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
public class DBPermissionException extends Exception {

    public DBPermissionException() {
        super("You don't have permission to access or write on db file");
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
