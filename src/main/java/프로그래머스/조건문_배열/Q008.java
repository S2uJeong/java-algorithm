package 프로그래머스.조건문_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q008 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i] * 2);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q008 m = new Q008();
        int [] input = {1,2,100,-99,1,2,3};
        System.out.println(Arrays.toString(m.solution(input)));
    }
}
