package com.flamingosoft.one;

import java.util.Scanner;

public class Bai15 {
    private boolean ok = false;
    private int n,k;
    private int[] a;
    private int[] b;


    private Bai15(Scanner scanner){
        this.n = scanner.nextInt();
        this.k = scanner.nextInt();
        a = new int[k+1];
        b = new int[k+1];
        for (int i = 1; i <=k; i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i];
        }
    }

    private void in(int[] x){
        int len = x.length;
        for (int i = 1; i <len; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }

    private void sinh(){
        int i = k;
        while (a[i] == n-k+i){
            i--;
        }
        if (i==0){
            ok = true;
        }
        else {
            a[i] = a[i]+1;
            for (int j = i+1; j <= k; j++) {
                a[j] = a[j-1]+1;
            }
        }
    }
    private void test(){
        int dem =0;
        for (int i = 1; i < k + 1; i++) {
            if (b[i] != a[i])
            {
                dem++;
            }
        }
        if (dem!=0){
            System.out.println(dem);
        }else {
            System.out.println(k);
        }
    }

    private void solve(){
//        while (!ok){
            in(b);
            sinh();
            test();
            in(a);
//        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai15(scanner).solve();
        scanner.close();
    }
}
