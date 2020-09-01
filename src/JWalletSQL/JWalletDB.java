/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JWalletSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * A more generic Wrapper, for use JWallet with other DB.
 * For the moment, this class it's a simple copy of the 
 * JWalletDBLite (sorry, i'll studying much more to do a good wrapper).
 * NOT READY TO PRODUCTION
 * @author alessandrogiaquinto
 */
class JWalletDB {
    /**
     * 0) Set the driver 
     * Note: this it's intended to be OPTIONAL;
     * If not set, the driver switch to default (SQLITE)
     * @param driver 
     */
    public static void setDriver(String driver) {
        driverType = driver;
    }
    
    /**
     * 1) The first step, register a driver specified in param
     * @param driverType
     * @return boolean register result
     */
    public static boolean registerDriver(String driverType) {
        try {
            register = Class.forName(driverType);
        } catch (ClassNotFoundException ex) {
            return false;
        }
        
        return true;
    }
    
    /**
     * 1)  The first step, register a driver with default (SQLITE)
     * @return boolean register result
     */
    public static boolean registerDriver() {
        try {
            register = Class.forName(driverType);
        } catch (ClassNotFoundException ex) {
            return false;
        }
        
        return register.toString().equals("class org.sqlite.JDBC");
    }
    
    /**
     * 2) Check if db file 
     * @param path
     * @return 
     */
    public static boolean checkFile(String path) {
        return false;
    }
    
    /**
     * 2) The second step, established a connection to DB
     * @return boolean DB connection 
     * @throws DriverNotRegisterException 
     */
    public static boolean dbConnect() throws DriverNotRegisterException {
        if (register == null) {
            throw new DriverNotRegisterException();
        }
        
        try {
            conn = DriverManager.getConnection(" ");
        } catch (SQLException ex) {
            return false;
        }
        
        System.err.println(conn.toString());
        
        return true;
    }
    
    /**
     * 3) Make statement
     * @return boolean statement ok
     * @throws DBNotConnectedException 
     */
    public static boolean makeStatement() throws DBNotConnectedException {
        if (conn == null ) {
            throw new DBNotConnectedException();    
        }
        
        try {
            if (conn.isClosed()){
                return false;
            } 
        } catch (SQLException ex) {
            throw new DBNotConnectedException();
        }
        
        try {
            stat = conn.createStatement();
        } catch (SQLException ex) {
            return false;
        }
        
        return true;
    }
    
    /**
     * A convenience method for make DB ready 
     * @return boolean all set and ready
     */
    public static boolean makeReady() {
        boolean temp = false;
        
        if (registerDriver()) {
            try {
                temp = dbConnect();
            } catch(DriverNotRegisterException e) {
                return false;
            }
            
            if (temp) {
                try {
                    temp = makeStatement();
                } catch (DBNotConnectedException ex) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private static String driverType = "org.sqlite.JDBC";
    private static Class register;
    private static Connection conn;
    private static Statement stat;
    
    private static String path;
    private static String username;
    private static String password;
}
