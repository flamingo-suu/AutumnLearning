package com.flamingosoft.three;

import java.util.Scanner;

public class Bai13 {
    private int n;
    private int[][] a;
    public Bai13(Scanner scanner) {
        n = scanner.nextInt();
        a = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            int x= scanner.nextInt();
            int y = scanner.nextInt();
            a[i][x] = 1;
            a[i][y] = 1;
        }
    }
    private void solve(){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai13(scanner).solve();
        scanner.close();
    }
}
