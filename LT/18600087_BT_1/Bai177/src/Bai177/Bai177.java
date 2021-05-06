/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai177;

import java.util.Scanner;

public class Bai177 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float []a;
        int n,x = 3 ,y = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Liet ke ca so trong [" + x + "," + y + "]");
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        a = new float[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextFloat();
        }

        System.out.println("Cac so nam trong [" + x + "," + y + "]");

        for(int i=0 ; i<n ; i++)
        {
            if( x <= a[i] && a[i] <= y)
                System.out.println("a["+ i + "]= " + a[i]);
        }
    }

}
