package com.flamingosoft.one;//package com.flamingosoft;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] res = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    a[j][k] = scanner.nextInt();
                }
            }
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k < m; k++) {
                    b[k][j] = a[j][k];
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        res[j][k] = res[j][k]+ a[j][l]*b[l][k];
                    }
                }
            }
            System.out.println("Test " + (i+1)+ ":");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n-1; k++) {
                    System.out.print(res[j][k] +" ");
                }
                System.out.print(res[j][n-1]);
                System.out.println();
            }
        }
        scanner.close();
    }
}
