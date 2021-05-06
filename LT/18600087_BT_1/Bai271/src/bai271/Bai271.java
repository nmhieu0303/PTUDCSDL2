/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai271;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class Bai271 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float []a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        a = new float[100];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextFloat();
        }

        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }
        
        System.out.print("Nhap vi tri can xoa: ");
        int k = sc.nextInt();
        for(int i=k ; i<n-1; i++)
            a[i] = a[i+1];
        n--;
        
        System.out.print("Mang sau khi xoa gia tri tai vi tri " + k + ": ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }
    }
    
}

