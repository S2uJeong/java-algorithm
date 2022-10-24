package com.algorithm.kthNumSlice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthTest {
    private int[] arr = {};  // solution의 매개변수. 입력배열


    public int getIdxNum(int[] command) { // command = 문제에서 정의. 2차원배열

        int fromIdx = command[0];
        int toIdx = command[1];
        int kIdx = command[2];
        int result = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // (1) 입력 배열에서 fromIdx ~ toIdx 까지만 잘라서 que에 넣는다. (que는 꺼낼때 정렬된 값 기준으로 나온다. )
        for (int i = fromIdx - 1; i < toIdx; i++) { // 주어지는 문제는 배열을 1부터 세기에 -1을 해줬다.
            pq.add(arr[i]);
        }

        // (2) k번째 값을 뽑아 result로 반환한다.
        for (int i = 0; i < kIdx; i++) {
            result = pq.poll(); // que 맨 앞에 있는 데이터를 뽑는다. (like pop)
        }

        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getIdxNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KthNum kthNum = new KthNum();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = kthNum.solution(arr, commands);
        System.out.println(Arrays.toString(answer));

    }


}
