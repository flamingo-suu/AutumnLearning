package com.flamingosoft.three;

import java.util.Scanner;

public class Bai16 {
    private int n,m;
    private int[][] a;
    private boolean[][] chuaXet;

    private Bai16(Scanner scanner) {
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n+1][m+1];
        chuaXet = new boolean[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = scanner.nextInt();
                chuaXet[i][j] = true;
            }
        }
    }

    private void DFS(int x,int y){
        chuaXet[x][y] = false;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai16(scanner).solve();
        scanner.close();
    }

    private void solve() {

    }
}
