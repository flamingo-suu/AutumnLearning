package com.flamingosoft.two;

import java.util.Scanner;
import java.util.Stack;

public class Bai20 {
    private String line;
    private boolean res=false;
    private Bai20(Scanner scanner) {
        line = scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTest = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nTest; i++) {
            new Bai20(scanner).solve();
        }
        scanner.close();
    }

    private void solve() {
        int len = line.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = line.charAt(i);
            if (checkCharacter(c)==1){
                stack.push(c);
            }else if (checkCharacter(c) == 2){
                char head = stack.pop();
                if (checkCharacterBetween(head,c)){
                    res = true;
                }else {
                    res = false;
                    break;
                }
            }
        }
        if (res){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private boolean checkCharacterBetween(char head, char c) {
        if (head == '(' && c == ')') return true;
        else if (head == '[' && c == ']') return true;
        else return head == '{' && c == '}';
    }

    private int checkCharacter(char charAt) {
        if (charAt == '(' || charAt == '[' || charAt == '{'){
            return 1;
        }else if (charAt == ')' || charAt == ']' || charAt == '}'){
            return 2;
        }
        return 3;
    }
}
