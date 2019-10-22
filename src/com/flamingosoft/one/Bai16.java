package com.flamingosoft.one;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai16(scanner).solve();
        }
        scanner.close();
    }

    private int n;

    private Bai16(Scanner scanner) {
        n  = scanner.nextInt();

    }

    private void solve() {

    }
}
