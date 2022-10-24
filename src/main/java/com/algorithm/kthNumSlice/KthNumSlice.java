package com.algorithm.kthNumSlice;

import java.util.Arrays;
/*
프로그래머스 K번째 수 알고리즘 문제
*/
public class KthNumSlice {

    public int[] solution(int[] array, int[][] commands) {

        int [] answer = new int [commands.length];
        int idx = 0;
        for ( int [] command :commands ) {  // 2차원 배열로 들어오는 commands를 행 단위로 자르기
            int[] slicedArr = Arrays.copyOfRange( command, command[0]-1, command[1]);
            Arrays.sort(slicedArr);
            answer[idx++] = slicedArr[command[2]-1];
        }
    return answer;
}

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNumSlice kthNumSlice = new KthNumSlice();
        int[] answer = kthNumSlice.solution(arr, commands);
        System.out.println(Arrays.toString(answer));
    }
}
