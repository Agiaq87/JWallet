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
public class DBWritePermissionException extends Exception {

    public DBWritePermissionException() {
        super("You don't have permission to write into database");
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
}
