/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai176;

import java.util.Scanner;

public class Bai176 {

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
        a = new float[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextFloat();
        }

        System.out.println("Cac so am trong mang: ");

        for(int i=0 ; i<n ; i++)
        {
            if(a[i] < 0)
                System.out.println("a["+ i + "]= " + a[i]);
        }
    }

}
