package com.flamingosoft.two;

import java.util.Scanner;

public class Bai3 {
    private int n;
    private int[] a;
    private Bai3(Scanner scanner) {
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai3(scanner).solve();
        scanner.close();
    }

    private void solve() {
        for (int i = 1; i < n; i++) {
            int j = i;
            int key = a[i];
            while (j>0 && a[j-1] >key){
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
            for (int k = 0; k < i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println(a[i]);
        }

    }
}
