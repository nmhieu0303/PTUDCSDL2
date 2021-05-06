/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai217;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class Bai217{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int []a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }

        int dem = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(a[i] % 7 == 0)
                dem++;
        }
        System.out.print("So luong gia tri chia het cho 7 trong mang: " + dem);
    }

}
