package com.flamingosoft;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nTest; i++) {
            String line = scanner.nextLine();
            if (checkNumberRight(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        scanner.close();
    }
    private static boolean checkNumberRight(String line) {
        int len = line.length();
        if (len % 2 != 0) {
            int mid = Character.getNumericValue(line.charAt(len / 2));
            if (mid % 2 != 0) {
                return false;
            }
        }
        for (int j = 0; j < len / 2; j++) {
            int l = Character.getNumericValue(line.charAt(j));
            int r = Character.getNumericValue(line.charAt(len - j - 1));
            if (l != r || l % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
