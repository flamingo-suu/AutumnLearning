package com.flamingosoft;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Bai3 {
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
            solve();
        }
        scanner.close();
    }

    private static void solve() {
        Queue<Integer> queue = new PriorityQueue<>();
        int dem = 0;
        int mx = 0;
        int i=0;
        while (i<n-1){
            for (int j = i+1; j < n; j++) {
                if (a[j]-a[j-1] > 0){
                    dem++;
                    i++;
                    if (j == n-1){
                        if (mx == dem){
                            queue.add(j);
                        }else if (mx < dem){
                            queue.clear();
                            queue.add(j);
                        }
                        break;
                    }
                }else {
                    if (mx < dem){
                        queue.clear();
                        queue.add(i);
                        mx = dem;
                        dem=0;
                    }else if (dem == mx){
                        dem = 0;
                        queue.add(i);
                    }else {
                        dem = 0;
                    }
                    i = j;
                    break;
                }
            }
        }
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
