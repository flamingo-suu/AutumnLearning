package com.flamingosoft.three;

import java.util.Scanner;

public class Bai11 {
    private int m,n;
    private int[][] a;
    public Bai11(Scanner scanner) {
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();;
            a[i][x] = 1;
            a[i][y] = 1;
        }
    }
    private void solve(){
        for (int i = 1; i <n ; i++) {
            for (int j = i+1; j <=m ; j++) {
                if(a[i][j] == 1){
                    System.out.print(i + " " + j);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai11(scanner).solve();
        scanner.close();
    }
}
