/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai220;

import java.util.Scanner;


public class Bai220{

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
            if(a[i] % 10 == 5)
                dem++;
        }
        System.out.print("So luong gia tri tan cung la 5 trong mang: " + dem);
    }

}
