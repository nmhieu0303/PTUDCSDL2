/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai280;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class Bai280 {

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
        
        int vt=0;
        for(int i=0 ; i<n; i++)
        {
            if(a[i] == 1)
            {
                float temp = a[i];
                a[i] = a[vt];
                a[vt] = temp;
                vt++;
            }
        }
        
        
        System.out.print("Mang sau khi dua cac gia tri 1 ve dau: ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }
    }
    
}
