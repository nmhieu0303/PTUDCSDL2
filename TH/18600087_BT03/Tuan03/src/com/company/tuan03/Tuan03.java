/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tuan03;

import java.util.List;
import java.util.Scanner;

/**
 * @author HocVien
 */
public class Tuan03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            System.out.println("**********************************");
            System.out.println("***************MENU***************");
            System.out.println("**********************************");
            System.out.println("1. Xuat danh sach cac san pham");
            System.out.println("2. Them san pham");
            System.out.println("3. Xoa bo 1 san pham");
            System.out.println("4. Thay doi thong tin cua 1 san pham");
            System.out.println("5. Tim kiem san pham theo ten");
            System.out.println("6. Sap xep cac san pham theo thu tu gia ban tang dan");
            System.out.println("7. Xuat ra file nhi phan");
            System.out.println("8. Thoat chuong trinh");
            Scanner sc = new Scanner(System.in);
            System.out.print("Mhap lua chon cua ban: ");
            int chon = sc.nextInt();
            QuanLySanPham quanly = new QuanLySanPham();
            switch (chon) {
                case 1: {
                    try {
                        List<SanPham> lst = quanly.getAllSanPham();
                        for (SanPham sp : lst) {
                            sp.XuatThongTin();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    try {
                        System.out.println("Nhap san pham can them: ");
                        SanPham sp = new SanPham();
                        sp.NhapThongTin();
                        int kq = quanly.ThemSanPham(sp);
                        if (kq == 1) {
                            System.out.println("Them thanh cong !!!");
                            List<SanPham> lst = quanly.getAllSanPham();
                            for (SanPham sp2 : lst) {
                                sp2.XuatThongTin();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3: {
                    try {
                        sc.nextLine();
                        System.out.print("Nhap MaSP can xoa : ");
                        String masp = sc.nextLine();

                        int kq = quanly.XoaSanPham(masp);
                        if (kq > 0) {
                            System.out.println("Xoa san pham thanh cong !!!");
                            List<SanPham> lst = quanly.getAllSanPham();
                            for (SanPham sp2 : lst) {
                                sp2.XuatThongTin();
                            }
                        }else{
                            System.out.println("Xoa khong thanh cong!");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 4: {
                    try {
                        sc.nextLine();
                        System.out.print("Nhap MaSP can sua : ");
                        String masp = sc.nextLine();
                        System.out.println("Nhap thong tin moi: ");
                        SanPham sp = new SanPham();
                        sp.NhapThongTin();
                        int kq = quanly.CapNhatSanPham(masp, sp);
                        if (kq > 0) {
                            System.out.println("Sua san pham thanh cong !!!");
                            List<SanPham> lst = quanly.getAllSanPham();
                            for (SanPham sp2 : lst) {
                                sp2.XuatThongTin();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5: {
                    try {
                        sc.nextLine();
                        System.out.print("Nhap TenSP can tim : ");
                        String tenSP = sc.nextLine();
                        List<SanPham> lst = quanly.TimSanPhamTheoTen(tenSP);
                        for (SanPham sp : lst) {
                                sp.XuatThongTin();
                            }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 6: {
                    try {
                        System.out.println("Sap xep cac san pham theo gia ban tang dan : ");
                        String tenSP = sc.nextLine();
                        List<SanPham> lst = quanly.getAllSanPham();
                        lst.sort((sp1,sp2)-> Double.compare(sp1.getGiaBan(),sp2.getGiaBan()));
                        for (SanPham sp : lst) {
                            sp.XuatThongTin();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 8:
                    return;
            }
        } while (true);
    }

    private static String readline(Scanner sc) {
        String line = "";
        do {
            line = sc.nextLine();
        } while(line.length() == 0);

        return line;
    }

}
