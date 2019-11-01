package com.flamingosoft.two;

import java.util.Scanner;

public class Bai15 {
    private int n;
    private long k;
    private static long[] F;
    private Bai15(Scanner scanner) {
        n = scanner.nextInt();
        k = scanner.nextLong();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        F = new long[93];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i < 93; i++) {
            F[i] = F[i-1] + F[i-2];
        }
        for (int i = 0; i < nTest; i++) {
            new Bai15(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        System.out.println(tim(n, k));
    }

    private char tim(int n, long k) {
        if (n == 1) return 'A';
        if (n == 2) return 'B';
        if (k <= F[n-2]) return tim(n-2,k);
        return tim(n-1,k-F[n-2]);
    }
}
