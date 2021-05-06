/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tuan03;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author HocVien
 */
public class QuanLySanPham {


    public List<SanPham> getAllSanPham() {
        Connection connection = null;
        ResultSet rs = null;
        List<SanPham> lst = new ArrayList<SanPham>();
        try {
            DataConnectManager dataConnnectManager = new DataConnectManager();
            connection = dataConnnectManager.getConnection();
            String strSQL = "SELECT * FROM SanPham";
            rs = dataConnnectManager.getDataTable(strSQL, connection);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setNgaySX(rs.getDate("NgaySX").toString());
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setGiaBan(rs.getDouble("GiaBan"));
                lst.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    rs.close();
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tuan03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lst;
    }

    public List<SanPham> TimSanPhamTheoTen(String ten){
        Connection connection = null;
        ResultSet rs = null;
        List<SanPham> lst = new ArrayList<SanPham>();
       try{
            DataConnectManager dataConnectManager = new DataConnectManager();
            connection = dataConnectManager.getConnection();
            String strSQL = "SELECT * FROM sanpham WHERE LOWER(TenSP) LIKE LOWER('%"+ten+"%')";
            rs=dataConnectManager.getDataTable(strSQL,connection);
            while (rs.next()){
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setNgaySX(rs.getDate("NgaySX").toString());
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setGiaBan(rs.getDouble("GiaBan"));
                lst.add(sp);
           }
       }catch (Exception ex){
           ex.printStackTrace();
       }finally {
            if (connection != null) {
                try {
                    rs.close();
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tuan03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lst;
    }
//    public SanPham getSanPhamByMaSP(String MaSP) {
//        Connection connection = null;
//        ResultSet rs = null;
//        SanPham sp = new SanPham();
//        try {
//            DataConnectManager dataConnnectManager = new DataConnectManager();
//            connection = dataConnnectManager.getConnection();
//            String strSQL = "SELECT * FROM SanPham WHERE MaSP = ";
//            rs = dataConnnectManager.getDataTable(strSQL, connection);
//            while (rs.next()) {
//                SanPham sp = new SanPham();
//                sp.setMaSP(rs.getString("MaSP"));
//                sp.setTenSP(rs.getString("TenSP"));
//                sp.setNgaySX(rs.getDate("NgaySX").toString());
//                sp.setSoLuong(rs.getInt("SoLuong"));
//                sp.setGiaBan(rs.getDouble("GiaBan"));
//                lst.add(sp);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (connection != null) {
//                try {
//                    rs.close();
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(Tuan03.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        return lst;
//    }

    public int ThemSanPham(SanPham sp) {
        Connection connection = null;
        int kq = 0;
        try {
            DataConnectManager dataConnnectManager = new DataConnectManager();
            connection = dataConnnectManager.getConnection();
            String strSQL = "INSERT INTO SanPham (`MaSP`, `TenSP`, `NgaySX`, `SoLuong`, `GiaBan`) VALUES(?,?,?,?,?)";
            PreparedStatement pre = (PreparedStatement) connection.prepareStatement(strSQL);

            pre.setString(1, sp.getMaSP());
            pre.setString(2, sp.getTenSP());
//            pre.setString(3, sp.getNgaySX());

            Date myDate = new SimpleDateFormat("dd/MM/yyyy").parse(sp.getNgaySX());
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

            pre.setDate(3, sqlDate);
            pre.setInt(4, sp.getSoLuong());
            pre.setDouble(5, sp.getGiaBan());
            dataConnnectManager.setPre(pre);
            kq = dataConnnectManager.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tuan03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return kq;
    }

    public int CapNhatSanPham(String MaSP,SanPham sp) {
        Connection connection = null;
        int kq = 0;
        try {
            DataConnectManager dataConnnectManager = new DataConnectManager();
            connection = dataConnnectManager.getConnection();
            String strSQL = "UPDATE `sanpham` SET `MaSP` = ?,`TenSP`=?,`NgaySX`=?,`SoLuong`=?,`GiaBan`=? WHERE `MaSP` = ?";
            PreparedStatement pre = (PreparedStatement) connection.prepareStatement(strSQL);

            pre.setString(1,sp.getMaSP());
            pre.setString(2, sp.getTenSP());
            //Date
            Date myDate = new SimpleDateFormat("dd/MM/yyyy").parse(sp.getNgaySX());
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
            pre.setDate(3, sqlDate);
            pre.setInt(4, sp.getSoLuong());
            pre.setDouble(5, sp.getGiaBan());
            pre.setString(6, MaSP);
            dataConnnectManager.setPre(pre);
            kq = dataConnnectManager.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tuan03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return kq;
    }

    public int XoaSanPham(String MaSP){
        Connection connection = null;
        int kq = 0;
        try{
            DataConnectManager dataConnectManager = new DataConnectManager();
            connection = dataConnectManager.getConnection();
            String strSQL= "DELETE FROM sanpham WHERE MaSP = ?";
            PreparedStatement pre = (PreparedStatement) connection.prepareStatement(strSQL);

            pre.setString(1,MaSP);
            dataConnectManager.setPre(pre);
            kq = dataConnectManager.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(connection!=null){
              try{
                  connection.close();
              }catch (SQLException ex){
                  Logger.getLogger(Tuan03.class.getName()).log(Level.SEVERE,null,ex);
              }
            }
        }
        return kq;
    }
}
