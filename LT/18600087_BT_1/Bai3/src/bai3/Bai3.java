/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap N: ");
        n = scan.nextInt();
        float sum = S(n);
        System.out.println("Tong tu 1 den 1/" + n + " la: " + sum);
    }

    private static float S(int N) {
        float sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 * 1 / i;
        }
        return sum;
    }

}
