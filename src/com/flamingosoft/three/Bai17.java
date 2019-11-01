package com.flamingosoft.three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai17 {
    private int n,m,u;
    private int[][] s;
    private boolean[] chuaXet;
    private Bai17(Scanner scanner) {
        n = scanner.nextInt();
        m = scanner.nextInt();
        u = scanner.nextInt();
        chuaXet = new boolean[n+1];
        s  = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            chuaXet[a] = true;
            chuaXet[b] = true;
            s[a][b] = 1;
            s[b][a] = 1;
        }
    }
    private void BFS(int x){
        chuaXet[x] = false;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        System.out.println(x);
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            for (int i = 1; i <= n ; i++) {
                if (chuaXet[i] && s[tmp][i]==1){
                    chuaXet[i] = false;
                    queue.add(i);
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai17(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        BFS(u);
    }
}
