/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doangiuaky;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tupham
 */
public class MyDataAccessHelper {

    public static Connection conn = null;
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost/banhang";
    final String USER = "root";
    final String PASS = "";

    public void Open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception ex) {
            Logger.getLogger(MyDataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyDataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ResultSet ExecuteQuery(String query) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(MyDataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public boolean ExecuteUpdate(String query) {
        boolean ret = true;
        try {
            Statement stmt = conn.createStatement();
            ret = stmt.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(MyDataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    public boolean CallStoreProcedure(String name, Object[] in) {
        boolean ret = true;
        try {
            CallableStatement call = conn.prepareCall(String.format("{call %s}", name));
            for (int i = 0; i < in.length; i++) {
                if (in[i] instanceof Integer) {
                    call.setInt(i + 1, Integer.parseInt(in[i].toString()));
                }
                if (in[i] instanceof String) {
                    call.setString(i + 1, in[i].toString());
                }
            }
            ret = call.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MyDataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
//     public boolean CallFunction(String result, String name, Object[] in) {
//        boolean ret = true;
//        try {                    
//            CallableStatement call = conn.prepareCall(String.format("{call ? = %s}", name));
//          
//            for (int i = 0; i < in.length; i++) {
//                if (in[i] instanceof Integer) {
//                    call.setInt(i + 1, Integer.parseInt(in[i].toString()));
//                }
//                if (in[i] instanceof String) {
//                    call.setString(i + 1, in[i].toString());
//                }
//            }
//            ret = call.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(MyDataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return ret;
//    }
    

    
   
}
