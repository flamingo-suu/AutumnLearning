package com.flamingosoft.three;

import java.util.Scanner;

public class Bai10 {
    private int m,n;
    private int[][] a;
    public Bai10(Scanner scanner) {
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();;
            a[x][y] = 1;
            a[y][x] = 1;
        }
    }
    private void solve(){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(a[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai10(scanner).solve();
        scanner.close();
    }
}
