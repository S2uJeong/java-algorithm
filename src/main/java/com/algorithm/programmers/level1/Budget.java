package com.algorithm.programmers.level1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class Budget {
    public int solution(int[] d, int budget) {
        int sumMoney = 0;
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            sumMoney += d[i];
            if (sumMoney > budget) break;
            else answer++;
        }

        return answer;
    }

    // 굳이 sumMoney 변수를 선언하지 않고 budget에 직접 빼서 확인하는 방법
    public int solution2(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) break;

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] d = {1,3,2,5,4};
        int budget = 9;
        int sumMoney = 0;
        int cnt = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            sumMoney += d[i];
            if (sumMoney > budget) break;
            else cnt++;
        }

        System.out.println(cnt);
    }
}
