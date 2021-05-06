/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai293;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class Bai293 {

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
         
        for(int l=1; l<=n; l++)
        {
            System.out.println("Mag con co chieu dai " + l + ": ");
            for(int vt=0; vt<=n-l; vt++)
            {
                for(int i=0; i<l; i++)
                {
                    System.out.print(a[vt+i] + " ");
                }
                 System.out.println();
            }
           
        }
    }
    
}
