package com.algorithm.combinationOfAlphabet;

public class Main {
    // 1.1. A-Z까지 재귀로 출력
    public static void printAlphabet(char c) {
        if ( c > 'Z') return; // 탈출조건
        System.out.println(c);
        printAlphabet((char)(c+1));
    }

    // 2. AAA ~ ZZZ까지 재귀로 출력
    public static void printAlphabet2(String prefix) {
        if (prefix.length() > 3) return;
        System.out.println(prefix);
        for (char c = 'A'; c <= 'Z' ; c++) {
            printAlphabet2(prefix + c);
        }
    }

    // 3. 칸의 개수를 매개변수로 받아서 재귀 출력
    public static void printAlphabet3(String prefix, int depth) {
        if (prefix.length() >= depth) {
            System.out.println(prefix);
            return;
        }
        for (char c = 'A'; c <= 'Z' ; c++) {
            printAlphabet3(prefix + c, depth);
        }
    }

    public static void main(String[] args) {
        // 1. A-Z까지 모든 경우의 수 출력
        for (char c = 'A'; c <= 'Z'; c++) {
            for (char d = 'A'; d <= 'Z' ; d++) {
                System.out.printf("%s%s\n", d,c);
            }
        }
        // 1.1.
        printAlphabet('A');
        // 2.
        printAlphabet2("");
        // 3.
        printAlphabet3("",2);
    }


}
