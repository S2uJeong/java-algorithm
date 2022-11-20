package 프로그래머스.조건문_배열;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q010 {
    public int solution(int[] array) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,3,3,4};
        // List<Integer> cnt = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] cnt = new int [array.length];
        // 1. ( 오름차순으로 정렬된 배열이 들어온다 가정 ) 같은 수 세기
        for (int i = 1; i <array.length ; i++) {
            if (array[i] == array[i-1]) {
               cnt[i-1] ++;
            }
        }

    }
}
