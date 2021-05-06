/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tuan03;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class SanPham {
    
    String MaSP;
    String TenSP;
    String NgaySX;
    int SoLuong;
    double GiaBan;

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(String NgaySX) {
        this.NgaySX = NgaySX;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    
    public void NhapThongTin()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap Ma san pham: ");
        MaSP =  sc.nextLine();
        System.out.print("Nhap Ten san pham: ");
        TenSP = sc.nextLine();
        System.out.print("Nhap Ngay San Xuat: ");
        NgaySX = sc.nextLine();
        System.out.print("Nhap So luong: ");
        SoLuong = sc.nextInt();
        System.out.print("Nhap Gia Ban ");
        GiaBan = sc.nextDouble();
    }
    
    public void XuatThongTin()
    {
        System.out.println(String.format("MaSP: %s - Ten SP: %s - NgaySX: %s - So luong:%d - Gia ban: %f", MaSP, TenSP,NgaySX,SoLuong,GiaBan));
    }
}
