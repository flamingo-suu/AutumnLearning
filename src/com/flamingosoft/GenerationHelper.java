package com.flamingosoft;

class GenerationHelper {
    private static int n =5;
    private static int[] a;
    private static boolean ok = false;

    private static void in(){
        for (int i = 1; i <=n; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    private static boolean test(){
        int kt=0;
        for (int i = 1; i <=n; i++)
        {
            kt = kt+a[i];
        }
        return kt ==3;
    }
    private static void sinh(){
        int i=n;
        while (a[i] == 1)
        {
            i--;
        }
        if (i==0) ok = true;
        else
        {
            a[i] =1;
            for (int j = i+1; j <= n; j++)
            {
                a[j] = 0;
            }

        }

    }

    static void solve() {
        a = new int[111];
        while (ok){
            if (test()){
                in();
            }
            sinh();
        }
    }
}
