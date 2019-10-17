package com.flamingosoft;

import java.util.Scanner;

public class Bai2 {
    private static boolean checkResult = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < n/2; j++) {
                checkResult = (a[j] == a[n - j - 1]);
            }
            if (checkResult){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
