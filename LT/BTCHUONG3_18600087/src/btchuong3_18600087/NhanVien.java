/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btchuong3_18600087;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hhiii
 */
public class NhanVien {

    private int manv;
    private String hoten;
    
    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    public List<NhanVien> TimKiem(String tukhoa){
        List<NhanVien> kqua = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Dr
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
