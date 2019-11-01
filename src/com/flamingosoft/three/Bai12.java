package com.flamingosoft.three;

import java.util.Scanner;

public class Bai12 {
    private int n;
    private int[][] a;
    public Bai12(Scanner scanner) {
        n = scanner.nextInt();
        a = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }
    private void solve(){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(a[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai12(scanner).solve();
        scanner.close();
    }
}
