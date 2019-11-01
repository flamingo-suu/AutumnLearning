package com.flamingosoft.three;

import java.util.Scanner;

public class Bai22 {
    private int n,m,u,v;
    private int[][] s;
    private boolean[] marked;
    private int[] previous;
    private Bai22(Scanner scanner) {
        n = scanner.nextInt();
        m = scanner.nextInt();
        u = scanner.nextInt();
        v = scanner.nextInt();
        s = new int[n+1][n+1];
        marked = new boolean[n+1];
        previous = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            s[a][b] = 1;
            s[b][a] = 1;
            previous[a] = 0;
            previous[b] = 0;
            marked[a] = false;
            marked[b] = false;
        }
    }
    private void DFS(int x){
        marked[x] = true;
        for (int i = 1; i <= n; i++) {
            if (!marked[i] && s[x][i] == 1){
                previous[i] = x;
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai22(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        DFS(u);
        int dem = 0;
        boolean ck = false;
        while (previous[v] != 0){
            if (previous[v] == u){
                ck = true;
            }
            dem++;
            v = previous[v];
        }
        if (!ck){
            System.out.println(-1);
        }else {
            System.out.println(dem);
        }
    }
}
