package com.flamingosoft.one;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            new Bai19(scanner.nextInt());
        }
        scanner.close();
    }

    private int n;

    private Bai19(int n) {
        this.n = n;
    }
    private void solve(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(90);
        System.out.println(queue.peek());
        queue.remove();
    }

}
