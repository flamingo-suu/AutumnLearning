package com.flamingosoft.three;

import java.util.Scanner;

public class Bai14 {
    private boolean[] chuaXet;
    private int[] truoc;
    private int[][] a;
    private int n,m;
    private Scanner scanner;

    private Bai14(Scanner scanner) {
        this.scanner = scanner;
        n = scanner.nextInt();
        m = scanner.nextInt();
        chuaXet = new boolean[n+1];
        truoc = new int [n+1];
        a = new int[n+1][n+1];
        for (int i = 0; i < m ; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            chuaXet[u] = true;
            chuaXet[v] = true;
            a[u][v] = 1;
        }
    }

    private void dfs(int x){
        chuaXet[x] = false;
        for (int i = 1; i <= n ; i++) {
            if (a[x][i] == 1 && chuaXet[i]){
                chuaXet[i] = false;
                truoc[i] = x;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai14(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        int q = scanner.nextInt();
        for (int i = 0; i <q ; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            dfs(x);
            boolean ck = false;
            while (truoc[y] != 0){
                if (truoc[y] == x){
                    System.out.println("YES");
                    ck= true;
                    break;
                }
                y = truoc[y];
            }
            if (!ck){
                System.out.println("NO");
            }
        }
    }
}
