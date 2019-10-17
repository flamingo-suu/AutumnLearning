package com.flamingosoft;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[10][10];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                a[j][k] = scanner.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[k][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
