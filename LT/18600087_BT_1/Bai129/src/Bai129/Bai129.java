/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai129;

import java.util.Scanner;

public class Bai129{

    public static void main(String[] args) {
        // TODO code application logic here
        int []a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang mot chieu cac so nguyen ");
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Xuat mang mot chieu cac so nguyen ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }
    }

}
