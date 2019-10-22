package com.flamingosoft.one;//package com.flamingosoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai20 {
    private int n;
    private int s;
    private ArrayList<Integer> list;

    private Bai20(Scanner scanner) {
        n = scanner.nextInt();
        s = scanner.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Bai20(scanner).solve();
        scanner.close();
    }

    private void solve() {
        Collections.sort(list);
        int dem = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (s >= list.get(i)){
                dem++;
                s = s - list.get(i);
            }
        }
        System.out.println(dem);
    }
}
