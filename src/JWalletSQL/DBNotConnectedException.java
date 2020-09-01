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
public class DBNotConnectedException extends Exception {

    public DBNotConnectedException() {
        super("DB not connected, you need to create a connection with db first");
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
