package com.algorithm.dinamicPrograming;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC"; // 행

        int [][] table = new int[str2.length() + 1][str1.length() + 1];
        // 수 비교해서 2차원 배열 채우기
        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                if (str1.charAt(j-1) == str2.charAt(i-1)) table[i][j] = table[i-1][j-1] + 1;
                else table[i][j] = Math.max(table[i-1][j] , table[i][j-1]);
            }
        }
        // 출력해보기
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
        // 답 제출
        int answer = table[str2.length()][str1.length()];
        System.out.println(answer);
    }
}
