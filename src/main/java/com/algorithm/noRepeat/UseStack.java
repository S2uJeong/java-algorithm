package com.algorithm.noRepeat;

import java.util.Arrays;
import java.util.Stack;

public class UseStack {
    public int[] solution(int[] arr) {
        // 1. 스택 만들어서 중복 제거 하여 스택에 넣기
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        // 2. 스택 pop()이용해 배열로 옮겨주기 (꺼꾸로 꺼내야 함에 주의)
        int[] answer = new int[stack.size()];

        for (int i = stack.size()-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        UseStack us = new UseStack();
        System.out.println(Arrays.toString(us.solution(arr)));
    }
}
