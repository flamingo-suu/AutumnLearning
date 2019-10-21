package com.flamingosoft;

public class Bai23 {
    private static long Prime(long n){
        long i;
        if (n<2) return 0;
        if (n==2 || n==3) return 1;
        if (n%2==0 || n%3==0) return 0;
        for (i=5;i<Math.sqrt(n);i+=6){
            if (n%i == 0 || n%(i+2) ==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        long i=1;
        long dem=0;
        long n =1000000;
        while (dem <= n) {
            i++;
            if (Prime(i) ==1){
//                System.out.println(i);
                dem++;
            }
        }
        System.out.println(i);
    }
}
