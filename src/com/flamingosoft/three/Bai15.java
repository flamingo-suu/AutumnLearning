package com.flamingosoft.three;

import java.util.Scanner;
import java.util.Vector;

public class Bai15 {
    private int n;
    private int[][] s;
    private int[][] added;
    private Vector<Integer> vector;

    private Bai15(Scanner scanner) {
        n = scanner.nextInt();
        s= new int[n+1][n+1];
        added = new int[n+1][n+1];
        vector = new Vector<>();
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            s[a][b] = 1;
            s[b][a] = 1;
            added[a][b] = 0;
            added[b][a] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai15(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        int dem=0;
        for (int i = 1; i < n+1 ; i++) {
            for (int j = 1; j < n+1; j++) {
                if (added[i][j] == 0 && added[j][i] == 1 && s[i][j]==1){
                    added[i][j] = 1;
                    added[j][i] = 1;
                    if (!vector.contains(i) && !vector.contains(j)){
                        vector.add(i);
                        vector.add(j);
                        dem++;
                    }
                }
            }
        }
        if (dem == n-1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
