package com.flamingosoft.one;

import java.util.Scanner;

public class Bai13 {
    private int n;
    private int k;
    private int[] a;
    private boolean ok = false;

    private void in(){
        for (int i = 1; i <=n; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    private boolean test(){
        int kt=0;
        for (int i = 1; i <=n; i++)
        {
            kt = kt+a[i];
        }
        return kt == k;
    }
    private void sinh(){
        int i=n;
        while (a[i] == 1)
        {
            i--;
        }
        if (i==0) {
            ok = true;
        }
        else
        {
            a[i] =1;
            for (int j = i+1; j <= n; j++)
            {
                a[j] = 0;
            }

        }

    }

    private void solve() {
        a = new int[111];
        while (!ok){
            if (test()){
                in();
            }
            sinh();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            Bai13 bai13 = new Bai13();
            bai13.setN(scanner.nextInt());
            bai13.setK(scanner.nextInt());
            bai13.solve();
        }
        scanner.close();
    }

    private void setK(int nextInt) {
        this.k = nextInt;
    }

    private void setN(int nextInt) {
        this.n = nextInt;
    }
}
