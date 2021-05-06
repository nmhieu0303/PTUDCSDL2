/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai218;

import java.util.Scanner;

/**
 *
 * @author HocVien
 */
public class Bai218{

    /**
     * @param args the command line arguments
     */
    public static boolean soDoiXung(int number){
        int numCheck = number, temp = 0;
        while(numCheck != 0) {
            int digit = numCheck % 10;
            temp = temp * 10 + digit;
            numCheck /= 10;
        }
        return number == temp;
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

        int dem = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(soDoiXung(a[i]) )
                dem++;
        }
        System.out.print("So luong so doi xung trong mang: " + dem);
    }

}
