package com.flamingosoft;

import java.util.Scanner;

public class Bai2 {
    private static int[] a;
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            n = scanner.nextInt();
            a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            if (checkResult()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
    private static boolean checkResult(){
        for (int j = 0; j < n/2; j++) {
            if (a[j] != a[n - j - 1]) return false;
        }
        return true;
    }
}
