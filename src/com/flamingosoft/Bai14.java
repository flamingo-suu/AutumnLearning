package com.flamingosoft;

import java.util.Scanner;

public class Bai14 {
    private int n;
    private int k;
    private int[] a;
    private boolean ok = false;

    private void in(){
        for (int i = 1; i <=n; i++)
        {
            if (a[i] != 1){
                System.out.print("A");
            }else {
                System.out.print("B");
            }
        }
        System.out.println();
    }
    private boolean test(){
        int dem=0;
        int i=1;
        while (i<=n){
            if (a[i] == 0){
                int j = i;
                while (j<=n && a[j] == 0){
                    j++;
                }
                if (j-i == k){
                    dem = dem+1;
                }
                i=j;
            }
            i++;

        }
        return dem == 1;
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
            Bai14 bai14 = new Bai14();
            bai14.setN(scanner.nextInt());
            bai14.setK(scanner.nextInt());
            bai14.solve();
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
