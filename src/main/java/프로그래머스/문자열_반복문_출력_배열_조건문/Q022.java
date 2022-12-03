package 프로그래머스.문자열_반복문_출력_배열_조건문;

import java.util.Arrays;

public class Q022 {
    public int[] solutoin(int [] num_list) {
       /* int cnt1 = 0;
        int cnt2 = 0;*/
        int [] answer = new int [2]; // arr[0] 에는 짝수 개수, [1]에는 홀수 개수

        for (int i = 0; i < num_list.length; i++) {
            if ( num_list[i] % 2 == 0) { //짝수일때
                answer[0]++;
            }  else {                    // 홀수일때
                answer[1]++;
            }
        }

        return answer;
    }
}
