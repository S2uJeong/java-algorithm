package com.algorithm.divisorArrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

// 프로그래머스) 나누어 떨어지는 숫자 배열
public class Solution2 {
    public int[] solution(int[] arr, int divisor) {
        // 값 나누어 배열에 넣기
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / divisor) == 0) list.add(arr[i]);
        }
        if (list.size() == 0) return new int[]{-1};

        // 큐를 배열로 바꾼다.
        int[] answer = new int[list.size()];
        int idx = 0;
        while (!list.isEmpty()) {
            answer[idx++] = list.poll();
        }
        // 정렬하기
        return answer;
    }
}
