package com.flamingosoft.two;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-2; i++) {
            for (int j = n-1; j >i ; j--){
                if (a[j] < a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println(a[n-1]);
        }
        scanner.close();
    }
}
