package com.flamingosoft.two;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    private int n,k;
    private int[] a,b;
    public Bai10(Scanner scanner) {
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        k = scanner.nextInt();
        b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai10(scanner).solve();
        scanner.close();
    }

    private void solve() {
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            System.out.println(getNumberStore(b[i]));
        }
    }

    private int getNumberStore(int b) {
        int l = 0;
        int r = n-1;
        while (l < r){
            int mid = (l+r)/2;
            if (a[mid] > b){
                r = mid-1;
            }
            else if (a[mid] < b){
                l = mid + 1;
            }else {
                break;
            }
        }
        return 1;
    }
}
