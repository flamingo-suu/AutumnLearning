package com.flamingosoft.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai8 {
    private int n;
    private ArrayList<Integer> list;
    public Bai8(Scanner scanner) {
        n = scanner.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai8(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        Collections.sort(list);
        int min = list.get(n-1);
        int dem = 0;
        for (int i = 1; i < n; i++) {
            int tmp = list.get(i) - list.get(i-1);
            if (min > tmp){
                min = tmp;
                dem = 1;
            }else if (min == tmp){
                dem++;
            }
        }
        System.out.println(min + " " + dem);
    }
}
