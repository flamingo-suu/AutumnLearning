package com.flamingosoft.one;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int r = n * n;
            int h = 0;
            int c = n - 1;
            int[][] a = new int[n][n];
            while (r > 0) {
                for (int j = h; j <= c; j++) {
                    a[h][j] = r;
                    r--;
                }
                for (int j = h + 1; j <= c; j++) {
                    a[j][c] = r;
                    r--;
                }
                for (int j = c - 1; j >= h; j--) {
                    a[c][j] = r;
                    r--;
                }
                for (int j = c - 1; j > h; j--) {
                    a[j][h] = r;
                    r--;
                }
                h++;
                c--;
            }
            System.out.println("Test " + (i+1) + ":");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (k<n-1){
                        System.out.print(a[j][k] + " ");
                    }else {
                        System.out.print(a[j][k]);
                    }

                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
