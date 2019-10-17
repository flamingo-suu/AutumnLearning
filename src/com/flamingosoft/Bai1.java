package com.flamingosoft;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        long[] F = new long[93];
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i < 93; i++) {
            F[i] = F[i-1] + F[i-2];
        }
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            System.out.println(F[n-1]);
        }
        scanner.close();

    }
}
