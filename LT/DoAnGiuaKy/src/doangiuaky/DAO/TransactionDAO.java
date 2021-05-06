/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doangiuaky.DAO;

import doangiuaky.MyDataAccessHelper;
import doangiuaky.POJO.SanPhamPojo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hhiii
 */
public class TransactionDAO {
        public List<SanPhamPojo> GetAll() {

        String query = "select * from sanpham";
        List<SanPhamPojo> list = new ArrayList<>();
        MyDataAccessHelper helper = new MyDataAccessHelper();
        try {

            helper.Open();
            ResultSet rs = helper.ExecuteQuery(query);
            while (rs.next()) {
                SanPhamPojo sp = new SanPhamPojo(
                    rs.getInt("id"),
                    rs.getString("tensp"),
                    rs.getInt("giagoc"),
                    rs.getInt("giaban")
                );
                list.add(sp);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            helper.Close();
        }
        return list;
    }

    public boolean Insert(SanPhamPojo sp) {
        String query = "usp_insertSP(?,?,?)";
        boolean ret = true;
        MyDataAccessHelper helper = new MyDataAccessHelper();
        helper.Open();
        try {
            ret = helper.CallStoreProcedure(query, new Object[]{sp.getTensp(),sp.getGiagoc(),sp.getGiaban()});
        } catch (Exception e) {
            
        }
        finally{
            helper.Close();
        }
        return ret;
    } 
    
    public boolean Update(Integer id,SanPhamPojo sp) {
        String query = "usp_updateSP(?,?,?,?)";
        boolean ret = true;
        MyDataAccessHelper helper = new MyDataAccessHelper();
        helper.Open();
        try {
            ret = helper.CallStoreProcedure(query, new Object[]{id,sp.getTensp(),sp.getGiagoc(),sp.getGiaban()});
        } catch (Exception e) {
            
        }
        finally{
            helper.Close();
        }
        return ret;
    }
    
    public boolean Delete(Integer id) {
        String query = "usp_deleteSP(?)";
        boolean ret = true;
        MyDataAccessHelper helper = new MyDataAccessHelper();
        helper.Open();
        try {
            ret = helper.CallStoreProcedure(query, new Object[]{id});
        } catch (Exception e) {
            
        }
        finally{
            helper.Close();
        }
        return ret;
    }
}
