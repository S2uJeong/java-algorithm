package com.algorithm.dinamicPrograming;

import java.util.Scanner;

public class CodeUpDialect {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        sc.close();

        // 테이블 생성, 두 문자열 비교
        int [][] table = new int[input2.length() + 1][input1.length() +1];

        for (int i = 1; i <= input2.length(); i++) {
            for (int j = 1; j<= input1.length(); j++) {
                if (input2.charAt(i-1) == input1.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                } else {
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }

        // 답 출력
        System.out.println(table[input2.length()][input1.length()]);
    }
}
