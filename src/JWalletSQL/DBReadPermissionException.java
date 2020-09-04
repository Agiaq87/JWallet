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
public class DBReadPermissionException extends Exception {

    public DBReadPermissionException() {
        super("you don't have permission to read");
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
