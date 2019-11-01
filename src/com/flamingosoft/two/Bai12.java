package com.flamingosoft.two;

import java.util.Scanner;

public class Bai12 {
    private int n, k;
    private static final long M = 1000000007;

    private Bai12(Scanner scanner) {
        n = scanner.nextInt();
        k = scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai12(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        System.out.println(pow(n, k));
    }

    private long pow(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            long temp = pow(a, n / 2);
            if (n % 2 == 0)
                return temp * temp % M;
            else
                return temp * temp * a % M;
        }
    }
}
