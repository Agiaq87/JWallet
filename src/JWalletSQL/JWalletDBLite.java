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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

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
            ex.printStackTrace();
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
     * @throws JWalletSQL.DBPermissionException 
     */
    public static boolean checkFile() throws DBNotFoundException, DBPermissionException{
        file = new File(fileName);
        
        System.err.println(file.getAbsolutePath());
        
        if ( !file.canRead() && !file.canWrite() ) {
            if (!file.setWritable(true)) {
                throw new DBPermissionException();
            }
        }
        
        path = driver + ":" + file.getName();
        
        System.err.println(path);
        
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
        
        if (!path.isEmpty() || path.isBlank()) {
            throw new DBNotFoundException();
        }
        
        System.err.println(path);
        
        try {
            conn = DriverManager.getConnection(path);
            meta = conn.getMetaData();
        } catch (SQLException ex) {
            ex.printStackTrace();
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
            ex.printStackTrace();
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
        file = new File(fileName);
        
        // 1) Registra il driver
        try {
            register = Class.forName(driverType);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        // 2) Verifica sul file
        if ( !file.canRead() && !file.canWrite() ) {
            if (!file.setWritable(true)) {
                return false;
            }
        }
        
        path = driver + ":" + file.getName();
        System.err.println(path);
        
        if (!path.isEmpty() || path.isBlank()) {
            return false;
        }
        
        try {
            conn = DriverManager.getConnection(path);
            meta = conn.getMetaData();
            System.err.println(conn.toString());
            System.err.println(meta.toString());
        } catch (SQLException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        try {
            stat = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        System.err.println("Start check table");
        
        try {
            stat.execute(
                "CREATE TABLE IF NOT EXISTS address (\n" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "user TEXT NOT NULL,\n" +
                "telephone TEXT NOT NULL,\n" +
                "mail TEXT NOT NULL,\n" +
                "data TEXT NOT NULL\n" +
                ");"
            );
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        /*
        stat.execute(
                "CREATE TABLE IF NOT EXISTS income (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "type TEXT NOT NULL," +
                "name TEXT NOT NULL," +
                "value TEXT NOT NULL," +
                "occur TEXT," +
                "cause TEXT," +
                "data TEXT NOT NULL" +
                ")"
            );*/
            
            /*temp &= stat.execute(
                    // Da fare...
                "CREATE TABLE IF NOT EXISTS outcome (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "type TEXT NOT NULL," +    // Fixed or variable...
                "name TEXT NOT NULL," +
                "value TEXT NOT NULL," +
                "occur TEXT," +   // Ricorda questa tabella raccoglie sia i fixed che i variable, ognuna con i suoi attributi
                "cause TEXT," +
                "data TEXT NOT NULL " +
                ")"
            );*/
        System.err.println("DB seems OK");
        return true;
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
    
    public static boolean insertAddress(String name, String telephone, String mail){        
        try {
            stat.execute(
                    "INSERT INTO address (user, telephone, mail, data) VALUES (" +
                            "'" + name + "', '" + telephone + "', '" + mail + "', '" + formatter.format(date) + "'" +
                            ")"
            );
        } catch (SQLException ex) {
            Logger.getLogger(JWalletDBLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
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
    
    private static String fileName = "JWallet.sqlite";
    private static String path = "";
    private static File file;
    
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    private static Date date = new Date(); 
}
