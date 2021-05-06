/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai243;

import java.util.Scanner;


public class Bai243 {

    public static boolean isPrime(int number) {
        for (int i = 2, sq = (int)Math.sqrt(number); i < sq; i++)
        {
            if (number % i == 0) return false;
        }
        return true;
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

        int flag =0;
        for(int i=0; i<n ;i++)
        {
            if(isPrime(a[i])) flag = 1;

        }
        if(flag == 1)
            System.out.print("Ton tai so nguyen to");
        else
            System.out.print("Khong ton tai so nguyen to");
    }

}
