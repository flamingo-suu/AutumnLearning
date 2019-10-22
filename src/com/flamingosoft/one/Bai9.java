package com.flamingosoft.one;//package com.flamingosoft;

import java.util.Scanner;

public class Bai9 {
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
        int st = Character.getNumericValue(line.charAt(0));
        int en = Character.getNumericValue(line.charAt(len-1));
        if (st != 8 && en!=8){
            return false;
        }
        int sum =0;
        sum = sum + 16;
        if (len % 2 != 0) {
            int mid = Character.getNumericValue(line.charAt(len / 2));
            sum = sum+mid;
        }
        for (int j = 1; j < len / 2; j++) {
            int l = Character.getNumericValue(line.charAt(j));
            int r = Character.getNumericValue(line.charAt(len - j - 1));
            if (l != r) {
                return false;
            }
            sum = sum + l + r;
        }
        return sum%10 == 0;
    }
}
