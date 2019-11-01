package com.flamingosoft.three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai21 {
    private int n,m,u,v;
    private int[][] s;
    private boolean[] marked;
    private int[] previous;
    private Bai21(Scanner scanner) {
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

    private void BFS(int x){
        marked[x] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            for (int i = 1; i <= n ; i++) {
                if (!marked[i] && s[tmp][i] == 1){
                    queue.add(i);
                    marked[i] = true;
                    previous[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai21(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        BFS(u);
        boolean ck = false;
        while (previous[v] != 0){
            if (previous[v] == u){
                ck = true;
                System.out.println(1);
            }
            v = previous[v];
        }
        if (!ck){
            System.out.println(-1);
        }
    }
}
