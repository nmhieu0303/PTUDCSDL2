/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap N: ");
        n = scan.nextInt();
        long sum = S(n);
        System.out.println("Tong binh phuong tu 1 den " + n + " la: " + sum);
    }

    private static long S(int N) {
        long sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i ^ 2;
        }
        return sum;
    }

}
