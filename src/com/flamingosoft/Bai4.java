package com.flamingosoft;

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
        int[] dem = new int[100001];
        int tmp = 0;
        for (int value : a) {
            for (int j = 0; j <= tmp; j++) {
                if (value == b[j]) {
                    dem[b[j]]++;
                }
            }
            b[tmp] = value;
            dem[value]++;
            tmp++;
        }
        for (int i = 0; i < tmp; i++) {
            System.out.println(b[i] +"  " + dem[b[i]]);
        }
    }
}
