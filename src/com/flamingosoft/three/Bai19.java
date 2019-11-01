package com.flamingosoft.three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai19 {
    private int n,m;
    private int[][] s;
    private boolean[] chuaXet;
    private Bai19(Scanner scanner){
        n = scanner.nextInt();
        m = scanner.nextInt();
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

    private void BFS(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        chuaXet[x] = false;
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            System.out.print(tmp+ " ");
            for (int i = 1; i <= n ; i++) {
                if (s[tmp][i] == 1 && chuaXet[i]){
                    queue.add(i);
                    chuaXet[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai19(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        for (int i = 1; i <=n ; i++) {
            if (chuaXet[i]){
                BFS(i);
                System.out.println();
            }
        }
    }
}
