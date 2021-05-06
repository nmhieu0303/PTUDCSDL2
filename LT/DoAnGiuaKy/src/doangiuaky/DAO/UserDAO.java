/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doangiuaky.DAO;

import doangiuaky.MyDataAccessHelper;
import doangiuaky.POJO.UserPojo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hhiii
 */
public class UserDAO {
       
        public List<UserPojo> GetAll() {
        String query = "select * from user";
        List<UserPojo> list = new ArrayList<>();
        MyDataAccessHelper helper = new MyDataAccessHelper();
        
        try {

            helper.Open();
            ResultSet rs = helper.ExecuteQuery(query);
            while (rs.next()) {
                UserPojo sp = new UserPojo(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("phone"),
                    rs.getInt("balance"),
                    rs.getInt("type")
                );
                list.add(sp);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            helper.Close();
        }
        return list;
    }

    public boolean Insert(UserPojo user) {
        String query = "usp_insertUser(?,?)";
        boolean ret = true;
        MyDataAccessHelper helper = new MyDataAccessHelper();
        helper.Open();
        try {
            ret = helper.CallStoreProcedure(query, new Object[]{user.getName(),user.getPhone()});
        } catch (Exception e) {
            
        }
        finally{
            helper.Close();
        }
        return ret;
    } 
    
    public int GetBalance(int userId) {
        int rs = -1;
        MyDataAccessHelper helper = new MyDataAccessHelper();
        Connection conn = MyDataAccessHelper.conn;
        helper.Open();
        try {
            CallableStatement call = conn.prepareCall("{? = CALL uf_getBalance(?)}");
            call.registerOutParameter(1, Types.INTEGER);
            call.setInt(2, userId);
            call.execute();
            return call.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            helper.Close();
        }
        return rs;
    } 
    
       public boolean Deposit(int userId, int amount, String description) {
        String query = "usp_deposit(?,?,?)";
        boolean ret = true;
        MyDataAccessHelper helper = new MyDataAccessHelper();
        helper.Open();
        try {
            ret = helper.CallStoreProcedure(query, new Object[]{userId,amount,description});
        } catch (Exception e) {
            
        }
        finally{
            helper.Close();
        }
        return ret;
    } 
    
//    public boolean Update(Integer id,UserPojo sp) {
//        String query = "usp_updateSP(?,?,?,?)";
//        boolean ret = true;
//        MyDataAccessHelper helper = new MyDataAccessHelper();
//        helper.Open();
//        try {
//            ret = helper.CallStoreProcedure(query, new Object[]{id,sp.getTensp(),sp.getGiagoc(),sp.getGiaban()});
//        } catch (Exception e) {
//            
//        }
//        finally{
//            helper.Close();
//        }
//        return ret;
//    }
//    
//    public boolean Delete(Integer id) {
//        String query = "usp_deleteSP(?)";
//        boolean ret = true;
//        MyDataAccessHelper helper = new MyDataAccessHelper();
//        helper.Open();
//        try {
//            ret = helper.CallStoreProcedure(query, new Object[]{id});
//        } catch (Exception e) {
//            
//        }
//        finally{
//            helper.Close();
//        }
//        return ret;
//    }
}
