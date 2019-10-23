package com.flamingosoft.two;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n= scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            int l = 0;
            int r = n-1;

            if (l ==r){
                System.out.println("YES");
            }else {
                System.out.println(r-l+1);
            }
        }
        scanner.close();
    }
}
