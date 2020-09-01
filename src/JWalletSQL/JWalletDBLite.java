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
package JWalletSQL;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Wrapper for jdbc-sqlite 
 * 
 * @author alessandrogiaquinto
 */
public class JWalletDBLite {
    
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
     * 1.5) Check if db file exist
     * If fileName is not set with setFileName,
     * it use the default value
     * @return boolean DB exist
     * @throws DBNotFoundException 
     */
    public static boolean checkFile() throws DBNotFoundException{
        var db = new File(fileName);
        
        /*if (!db.isFile()) { NOT WORK
            throw new DBNotFoundException();
        }*/
        
        path = driver + ":" + db.getName();
        
        return (!path.isEmpty() || path.isBlank());
    }
    
    /**
     * 2) The second step, established a connection to DB
     * @return boolean DB connection 
     * @throws DriverNotRegisterException 
     * @throws DBNotFoundException 
     */
    public static boolean dbConnect() throws DriverNotRegisterException, DBNotFoundException {
        if (register == null) {
            throw new DriverNotRegisterException();
        }
        
        /*if (!path.isEmpty() || path.isBlank()) {
            throw new DBNotFoundException();
        }*/
        System.err.println(path);
        
        try {
            conn = DriverManager.getConnection(path);
            meta = conn.getMetaData();
        } catch (SQLException ex) {
            return false;
        }
        
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
        
        try {
            if (registerDriver() && checkFile()) {
                try {
                    temp = dbConnect();
                } catch(DriverNotRegisterException | DBNotFoundException e) {
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
        } catch (DBNotFoundException ex) {
            return false;
        }
        
        try {
            temp = stat.execute(
                "CREATE TABLE IF NOT EXISTS `address` (" +
                "    `id` INT NOT NULL AUTO_INCREMENT," +
                "    `user` VARCHAR(150) NOT NULL," +
                "    `telephone` VARCHAR(13) NOT NULL," +
                "    `email` VARCHAR(150) NOT NULL," +
                "    `data` DATETIME CURRENT_TIMESTAMP, " +
                "    PRIMARY KEY(`id`)" + 
                "    );"
            );
            
            temp &= stat.execute(
                "CREATE TABLE IF NOT EXISTS `income` (" +
                "    `id` INT NOT NULL AUTO_INCREMENT," +
                "    `type` VARCHAR(15) NOT NULL," +    // Fixed or variable...
                "    `name` VARCHAR(80) NOT NULL," +
                "    `value` VARCHAR(13) NOT NULL," +
                "    `occur` VARCHAR(150)," +   // Ricorda questa tabella raccoglie sia i fixed che i variable, ognuna con i suoi attributi
                "    `cause` VARCHAR(150)," +
                "    `data` DATETIME CURRENT_TIMESTAMP, " +
                "    PRIMARY KEY(`id`)" + 
                "    );"
            );
            
            temp &= stat.execute(
                    // Da fare...
                "CREATE TABLE IF NOT EXISTS `outcome` (" +
                "    `id` INT NOT NULL AUTO_INCREMENT," +
                "    `type` VARCHAR(15) NOT NULL," +    // Fixed or variable...
                "    `name` VARCHAR(80) NOT NULL," +
                "    `value` VARCHAR(13) NOT NULL," +
                "    `occur` VARCHAR(150)," +   // Ricorda questa tabella raccoglie sia i fixed che i variable, ognuna con i suoi attributi
                "    `cause` VARCHAR(150)," +
                "    `data` DATETIME CURRENT_TIMESTAMP, " +
                "    PRIMARY KEY(`id`)" + 
                "    );"
            );
        } catch (SQLException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return temp;
    }
    
    public static boolean checkTableExists(String table) throws DBNotConnectedException, StatementNotReadyException {
        
        if (conn == null) {
            throw new DBNotConnectedException(); 
        }
        
        if (stat == null) {
            throw new StatementNotReadyException();
        }
        
        try {
            var rs = meta.getTables(null, null, table,  null);
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return false;
    }

    /**
     * Return driver of
     * @return String driver
     */
    public static String getDriverType() {
        return driverType;
    }
    
    /**
     * Return DB file name
     * @return String DB file name
     */
    public static String getFileName() {
        return fileName;
    }
    
    /**
     * Set name of DB file
     * If checkFile throws Exception, use to specify 
     * the DB file name then use checkFile
     * @param fileName 
     */
    public static void setFileName(String fileName) {
        JWalletDBLite.fileName = fileName;
    }
    
    
    
    private static String driverType = "org.sqlite.JDBC";
    private static String driver = "jdbc:sqlite";
    private static Class register;
    private static Connection conn;
    private static Statement stat;
    private static DatabaseMetaData meta;
    
    private static String fileName = "JWallet.db";
    private static String path = "";
}
