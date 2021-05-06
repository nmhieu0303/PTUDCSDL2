/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai241;

import java.util.Scanner;


public class Bai241 {

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

        for(int i=0 ; i<n ; i++)
        {
            System.out.println("a["+ i + "]= " + a[i]);
        }

        int flag =0;
        for(int i=0; i<n-1 ;i++)
        {
            if(a[i] + 1  != a[i + 1])
                flag = 1;
        }
        if(flag == 1)
            System.out.print("Ton tai hai gia tri khong lien tiep");
        else
            System.out.print("Khong ton tai hai gia tri khong lien tiep");
    }

}
