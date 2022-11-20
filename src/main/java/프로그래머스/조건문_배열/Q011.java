package 프로그래머스.조건문_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q011 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 0) continue;
            list.add(i);
        }
        int [] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 0) continue;
            list.add(i);
        }

        int [] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
