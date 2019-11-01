package com.flamingosoft.three;

import java.util.Scanner;

public class Bai18 {
    private int n,m,u;
    private int[][] s;
    private boolean[] chuaXet;
    private Bai18(Scanner scanner){
        n = scanner.nextInt();
        m = scanner.nextInt();
        u = scanner.nextInt();
        s = new int[n+1][n+1];
        chuaXet = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            s[a][b] = 1;
            s[b][a] = 1;
            chuaXet[a] = true;
            chuaXet[b] = true;
        }
    }

    private void DFS(int x){
        chuaXet[x] = false;
        System.out.println(x);
        for (int i = 1; i <=n ; i++) {
            if (chuaXet[i] && s[x][i] == 1){
                DFS(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai18(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        DFS(u);
    }
}
