package com.flamingosoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai4();
        bai5();
    }
    private static void bai1(){
        Scanner scanner = new Scanner(System.in);
        long[] F = new long[93];
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i < 93; i++) {
            F[i] = F[i-1]+F[i-2];
        }
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n=scanner.nextInt();
            System.out.println(F[n-1]);
        }
        scanner.close();
    }
    private static void bai2(){
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            boolean dx = false;
            for (int j = 0; j < n; j++) {
                dx = (a[j] == a[n - j - 1]);
            }
            if (dx){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
    private static void bai3(){
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {

        }
        scanner.close();
    }
    private static void bai4(){
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] dem = new int[100001];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                dem[a[j]] ++;
            }
            for (int j = 0; j < 100001; j++) {
                if (dem[j] >0){
                    System.out.println(dem[j]);
                }
            }
        }
        scanner.close();
    }
    private static void bai5(){
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
    private static void bai6(){
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                a[j][k] = scanner.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                b[j][k] = a[k][j];
            }
        }
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                b[j][k] = a[k][j];
            }
        }
        scanner.close();
    }
}
