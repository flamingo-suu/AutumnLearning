package com.flamingosoft.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            Collections.sort(list);
            for (int j = 0; j < n - 1; j++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println(list.get(n-1));
        }
        scanner.close();
    }
}
