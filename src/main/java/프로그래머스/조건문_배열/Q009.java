package 프로그래머스.조건문_배열;

import java.util.Arrays;

// 중앙값 구하기

public class Q009 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }

    public static void main(String[] args) {
        int [] array = {9,-1,0};
        // 1. 정렬한다. (오름차순)
        Arrays.sort(array);
        // 2. 중앙값을 꺼낸다.
        int answer = array[array.length/2];
        System.out.println(answer);
    }
}
