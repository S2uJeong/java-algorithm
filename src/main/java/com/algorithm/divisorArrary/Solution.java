package com.algorithm.divisorArrary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스) 나누어 떨어지는 숫자 배열
public class Solution {
    public int[] solution (int [] arr , int divisor) {
        // 값 나누어 배열에 넣기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / divisor) == 0) {
                list.add(arr[i]);
            }
            if (list.size() == 0) return new int[]{-1};
        }
        // 리스트를 배열로 바꾼다.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // 정렬하기
        Arrays.sort(answer);
        return answer;
    }
}
