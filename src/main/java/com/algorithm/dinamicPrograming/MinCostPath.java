package com.algorithm.dinamicPrograming;

import java.util.Arrays;

public class MinCostPath {

    public int getMinCost(int [][] matrix) {
        // 입력 받는 matrix 크기 만큼의 dp 만들기
        int [][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) { // 첫번째 칸만 있는 경우
                    dp[i][j] = matrix[i][j];
                } else if ( i == 0 && j > 0) { // 첫째 행만 있는 경우 / i는 0으로 고정
                    dp[i][j] = dp[i][j-1] + matrix[i][j];
                } else if ( i > 0 && j == 0) { // 첫째 열만 있는 경우 / j는 0으로 고정
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1]) + matrix[i][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[matrix.length-1][matrix[0].length-1];

    }

    public static void main(String[] args) {
        MinCostPath m = new MinCostPath();

        int [][] matrix = {
                { 1,3,2 },
                { 4,6,2 },
                { 1,2,4 }
        };
        System.out.println(m.getMinCost(matrix));



    }
}
