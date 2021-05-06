/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tuan03;

//import com.mysql.cj.jdbc.;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author HocVien
 */
public class DataConnectManager {
    
    Connection conn = null;
    static String ConnectionString ="jdbc:mysql://localhost/QuanLySanPhamDB?zeroDateTimeBehavior=convertToNull";
    private PreparedStatement pre;
    
    public Connection getConnection()
    {
        try{
            Properties connectionProps = new Properties();
            connectionProps.put("user", "root");
            connectionProps.put("password", "");
            conn = DriverManager.getConnection(ConnectionString, connectionProps);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    
    public ResultSet getDataTable(String strSQL, Connection connection)
    {
        ResultSet rs = null;
        try
        {
            if (conn != null) {
                Statement st = conn.createStatement();
                rs = st.executeQuery(strSQL);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
               
        }
        return rs;
    }
    
    public int executeUpdate()
    {
        try
        {
            if (conn != null) {
               int kq = getPre().executeUpdate();
               if(kq!=0){
                   return kq;
               }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }


    public PreparedStatement getPre() {
        return pre;
    }


    public void setPre(PreparedStatement pre) {
        this.pre = pre;
    }
    
}
