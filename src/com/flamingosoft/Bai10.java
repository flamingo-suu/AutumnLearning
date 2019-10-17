package com.flamingosoft;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nTest; i++) {
            String line = scanner.nextLine();
            if (checkNumberRight(line)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    private static boolean checkNumberRight(String line) {
        StringBuilder builder = new StringBuilder(line);
        if (!line.contentEquals(builder.reverse())){
            return false;
        }
        int n = line.length();
        if (n%2 != 0){
            if (!checkPrime(Character.getNumericValue(line.charAt(n/2+1)))){
                return false;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            if (!checkPrime(Character.getNumericValue(line.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    private static boolean checkPrime(int num) {
        return num == 2 || num == 3 || num == 5 || num == 7;
    }
}
