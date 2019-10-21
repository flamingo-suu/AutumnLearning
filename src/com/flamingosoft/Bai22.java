package com.flamingosoft;

import java.util.Scanner;

public class Bai22 {
    private int n;
    private Bai22(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai22(scanner.nextInt()).solve();
        }
        scanner.close();
    }

    private void solve() {
        if (n%2!=0){
            System.out.println(0);
        }else {
            int dem = 0;
            for (int i = 2; i <n/2 ; i+=2) {

            }
        }
    }
}
