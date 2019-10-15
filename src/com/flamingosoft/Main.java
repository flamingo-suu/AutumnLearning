package com.flamingosoft;

import java.util.*;

public class Main {
    static boolean checkResult = false;

    public static void main(String[] args) {
        bai13();
    }

    private static void bai() {

    }

    private static void bai1() {
        Scanner scanner = new Scanner(System.in);
        long[] F = new long[93];
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i < 93; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            System.out.println(F[n - 1]);
        }
        scanner.close();
    }

    private static void bai2() {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) checkResult = (a[j] == a[n - j - 1]);
            if (checkResult) System.out.println("YES");
            else System.out.println("NO");
        }
        scanner.close();
    }

    private static void bai3() {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {

        }
        scanner.close();
    }

    private static void bai4() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> hashMap = new TreeMap<>();
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                if (hashMap.containsKey(a[j])) {
                    hashMap.put(a[j], hashMap.get(a[j]) + 1);
                } else {
                    hashMap.put(a[j], 1);
                }
            }
            System.out.println("Test " + (i + 1) + ":");
            for (Integer key : hashMap.keySet()) {
                System.out.println(key + " xuat hien " + hashMap.get(key) + " lan");
            }
        }
        scanner.close();
    }

    private static void bai5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[10][10];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                a[j][k] = scanner.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[k][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void bai6() {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                a[j][k] = scanner.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                b[j][k] = a[k][j];
            }
        }
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                b[j][k] = a[k][j];
            }
        }
        scanner.close();
    }

    private static void bai7() {
        Scanner scanner = new Scanner(System.in);
        int nTest = scanner.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = scanner.nextInt();
            int r = n * n;
            int h = 0;
            int c = n - 1;
            int[][] a = new int[21][21];
            while (r > 0) {
                for (int j = h; j <= c; j++) {
                    a[h][j] = r;
                    r--;
                }
                for (int j = h + 1; j <= c; j++) {
                    a[j][c] = r;
                    r--;
                }
                for (int j = c - 1; j >= h; j--) {
                    a[c][j] = r;
                    r--;
                }
                for (int j = c - 1; j > h; j--) {
                    a[j][h] = r;
                    r--;
                }
                h++;
                c--;
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(a[j][k] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    private static void bai8() {
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
        int sum = 0;
        if (len % 2 != 0) {
            int mid = Character.getNumericValue(line.charAt(len / 2));
            if (mid % 2 != 0) {
                return false;
            }
            sum = sum + mid;
        }
        for (int j = 0; j < len / 2; j++) {
            int l = Character.getNumericValue(line.charAt(j));
            int r = Character.getNumericValue(line.charAt(len - j - 1));
            if (l != r || l % 2 != 0) {
                return false;
            }
            sum = sum + l * 2;
        }
        return sum % 10 == 0;
    }

    private static void bai9() {
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

    private static void bai10() {
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkPrime(int x) {
        if (x == 2) {
            return true;
        }
        if (x < 2 || x % 2 == 0) {
            return false;
        }
        int mid = (int) Math.sqrt(x);
        for (int i = 2; i <= mid; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void bai12(){
        Scanner scanner = new Scanner(System.in);
        int nTest = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nTest; i++) {
            String line = scanner.nextLine();
            if (!line.equals("")){
                StringBuilder builder = new StringBuilder();
                StringTokenizer tokenizer = new StringTokenizer(line.trim());
                while (tokenizer.hasMoreTokens()){
                    String nex = tokenizer.nextToken();
                    builder.append(String.valueOf(nex.charAt(0)).toUpperCase());
                    for (int j = 1; j < nex.length(); j++) {
                        builder.append(String.valueOf(nex.charAt(j)).toLowerCase());
                    }
                    builder.append(" ");
                }
                builder.deleteCharAt(builder.length()-1);
                System.out.println(builder.toString());
            }
        }
        scanner.close();
    }
    private static void bai13(){
//        Scanner scanner = new Scanner(System.in);
//        int nTest = scanner.nextInt();
        int nTest = 1;
        for (int i = 0; i < nTest; i++) {
//            int n = scanner.nextInt();
            int n = 3;
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = 0;
            }

            int j=n-1;
            while (j>=0){
                if (a[j]==0){
                    a[j] = 1;
                    for (int k = j+1; k < n; k++) {
                        a[k] = 0;
                    }
                    j=n;
                }
                j--;
            }
        }
//        scanner.close();
    }

}
