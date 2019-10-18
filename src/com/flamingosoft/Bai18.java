package com.flamingosoft;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai18(scanner.nextInt()).solve();
        scanner.close();
    }

    private int n;
    private int[] xuoi;
    private int[] nguoc;
    private int[] cheo;
    private Bai18(int n){
        this.n = n;
        xuoi = new int[n*2];
        nguoc = new int[n*2];
        cheo = new int[n];
    }
    private void solve(){

    }

}
