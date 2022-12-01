package 프로그래머스.수학_배열;

import java.util.Arrays;

public class Q019 {
    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length];

        for (int i = 0; i < answer.length; i++) {
             answer[answer.length -1 -i ] = num_list[i];
        }
        return answer;
    }

}
