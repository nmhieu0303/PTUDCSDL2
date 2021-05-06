/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai178;

import java.util.Scanner;

public class Bai178 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float []a;
        int n,x = 3 ,y = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Liet ke cac so chan trong [" + x + "," + y + "]");
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        a = new float[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Nhap a["+ i + "]: ");
            a[i] = sc.nextFloat();
        }

        System.out.println("Cac so chan nam trong [" + x + "," + y + "]");

        for(int i=0 ; i<n ; i++)
        {
            if( x <= a[i] && a[i] <= y && a[i]%2==0)
                System.out.println("a["+ i + "]= " + a[i]);
        }
    }

}
