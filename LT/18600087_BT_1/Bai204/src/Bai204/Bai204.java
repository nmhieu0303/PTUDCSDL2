/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai204;

import java.util.Scanner;

public class Bai204 {

    public static void main(String[] args) {
        // TODO code application logic here

        float []a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tong cac gia tri lon hon so lien truoc ");
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        a = new float[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextFloat();
        }

        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }

        int tong =0;
        for(int i=1 ; i<n ; i++)
        {
            if(a[i]>a[i-1])tong += a[i];
        }
        System.out.print("Tong cac gia tri lon hon so lien truoc : " + tong);
    }

}
