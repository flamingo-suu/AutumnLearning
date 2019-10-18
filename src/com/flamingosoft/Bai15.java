package com.flamingosoft;

public class Bai15 {
    private boolean ok = false;
    private int n,k;
    private int[] a;


    private Bai15(int n, int k){
        this.n = n;
        this.k = k;
        a = new int[n+1];
        for (int i = 1; i <=k; i++) {
            a[i] = i;
        }
    }

    private void in(){
        for (int i = 1; i <=k; i++) {
            System.out.print(a[i]);
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

    private void solve(){
        while (!ok){
            in();
            sinh();
        }
    }
    public static void main(String[] args) {
        new Bai15(10,4).solve();
    }
}
