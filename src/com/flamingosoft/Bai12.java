package com.flamingosoft;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai12 {
    public static void main(String[] args) {
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
}
