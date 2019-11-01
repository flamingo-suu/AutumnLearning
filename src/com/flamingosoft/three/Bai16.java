package com.flamingosoft.three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai16 {
    private int n,m;
    private int[][] a;
    private boolean[][] marked;

    private Bai16(Scanner scanner) {
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n][m];
        marked = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
                marked[i][j] = false;
                marked[j][i] = false;
            }
        }
    }

    private void DFS(int x,int y){
        marked[x][y] = true;
        if(x-1 > -1 && y-1 > -1){
            if (!marked[x-1][y-1] && a[x-1][y-1] == 1){
                DFS(x-1,y-1);
            }
        }
        if(y-1 > -1){
            if (!marked[x][y-1] && a[x][y-1] == 1){
                DFS(x,y-1);
            }
        }
        if(x+1 < n && y-1 > -1){
            if (!marked[x+1][y-1] && a[x+1][y-1] == 1){
                DFS(x+1,y-1);
            }
        }
        if(x+1 < n){
            if (!marked[x+1][y] && a[x+1][y] == 1){
                DFS(x+1,y);
            }
        }
        if(x+1 <= 1 && y+1 < n){
            if (!marked[x+1][y+1] && a[x+1][y+1] == 1){
                DFS(x+1,y+1);
            }
        }
        if(y+1 < n){
            if (!marked[x][y+1] && a[x][y+1] == 1){
                DFS(x,y+1);
            }
        }
        if(x-1 > -1 && y+1 < n){
            if (!marked[x-1][y+1] && a[x-1][y+1] == 1){
                DFS(x-1,y+1);
            }
        }
        if(x-1 > -1){
            if (!marked[x-1][y] && a[x-1][y] == 1){
                DFS(x-1,y);
            }
        }
    }
    private void BFS(int x, int y){
        marked[x][y] = true;
        Queue<Integer> queue = new LinkedList<>();

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai16(scanner).solve();
        scanner.close();
    }

    private void solve() {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!marked[i][j] && a[i][j] ==1){
                    DFS(i,j);
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
}
