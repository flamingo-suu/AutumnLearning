package com.flamingosoft.two;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println(a[n-1]);
        }
        scanner.close();
    }
}
