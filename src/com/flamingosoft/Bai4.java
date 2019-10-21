//package com.flamingosoft;

import java.util.HashMap;
import java.util.Scanner;

public class Bai4 {
    private static int n;
    private static int[] a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            n = scanner.nextInt();
            a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            System.out.println("Test " + (i+1) + ":");
            countArrays();
        }
        scanner.close();
    }

    private static void countArrays() {
        int[] b = new int[n];
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        int tmp=0;
        for (int value : a) {
            if (!hashMap.containsKey(value)){
                hashMap.put(value,1);
                b[tmp] = value;
                tmp++;
            }else {
                int val = hashMap.get(value);
                hashMap.put(value,val+1);
            }
        }
        for (int i = 0; i < tmp; i++) {
            System.out.println(b[i] +" xuat hien " + hashMap.get(b[i])+ " lan");
        }
    }
}
