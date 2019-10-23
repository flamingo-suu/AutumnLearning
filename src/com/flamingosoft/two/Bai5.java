package com.flamingosoft.two;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            Arrays.sort(a);
            for (int j = 0; j < n - 1; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println(a[n-1]);
        }
        scanner.close();
    }
}
