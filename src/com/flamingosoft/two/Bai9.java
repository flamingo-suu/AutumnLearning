package com.flamingosoft.two;

import java.util.Scanner;

public class Bai9 {
    private int n,k;
    private int a[];
    public Bai9(Scanner scanner) {
        n = scanner.nextInt();
        k = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai9(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        int l = 0;
        int r = n-1;
        int res = -1;
        while (l < r){
            int mid = (l+r)/2;
            if (a[mid] > k){
                r = mid-1;
            }
            else if (a[mid] < k){
                l = mid + 1;
            }else {
                res = mid;
                break;
            }
        }
        if (res!=-1){
            System.out.println(res+1);
        }else {
            System.out.println("NO");
        }
    }
}
