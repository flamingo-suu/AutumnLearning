package com.flamingosoft;

import java.util.*;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        int nTest = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nTest; i++) {
            String line = scanner.nextLine();
            String res = standardized(line);
            if (!map.containsKey(res)){
                map.put(res,1);
                System.out.println(res+"@ptit.edu.vn");
            }else {
                int sz = map.get(res);
                map.put(res,sz+1);
                System.out.println(res+(sz+1)+"@ptit.edu.vn");
            }
        }
        scanner.close();
    }

    private static String standardized(String line) {
        StringBuilder builder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int num = tokenizer.countTokens();
        if (num>0){
            while (num-->1){
                String tk = tokenizer.nextToken();
                builder.append(String.valueOf(tk.charAt(0)).toLowerCase());
            }
            builder.insert(0,tokenizer.nextToken().toLowerCase());
        }
        return builder.toString();
    }
}
