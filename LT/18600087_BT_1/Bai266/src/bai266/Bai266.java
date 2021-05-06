/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai266;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class Bai266 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        System.out.print("Nhap x: ");
        float x = sc.nextFloat();
        System.out.print("Nhap vi tri can them: ");
        int k = sc.nextInt();
        for(int i=n; i>k; i--)
        {
            a[i] = a[i-1];
        }
        a[k] = x;
        n++;
        
        System.out.print("Mang sau khi them gia tri " + x + " vao vi tri " + k + ": ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }
    }
    
}
