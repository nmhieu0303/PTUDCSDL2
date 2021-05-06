/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai219;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author HocVien
 */
public class Bai219{

    public static void addElement(Map<Float, Integer> map, float element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }

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

        // tìm số lần xuất hiện của các phần tử
        Map<Float, Integer> map = new TreeMap<Float, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, a[i]);
        }


        for (Float key : map.keySet()) {
            System.out.printf(key + " xuất hiện %d lần.\n", map.get(key));
        }
    }
}
