/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai202;

import java.util.Scanner;

public class Bai202 {
    public static boolean daule(int number){
        while (number>9){
            number/=10;
        };
        return number%2!=0;
    }

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

        int tong =0;
        for(int i=0 ; i<n ; i++)
        {
            if(daule(a[i]))tong += a[i];

        }
        System.out.print("Tong cac gia tri co chu so dau la so le trong mang: " + tong);
    }

}
