package 프로그래머스.문자열_반복문_출력_배열_조건문;

import java.util.Arrays;

public class Q020 {
    public String solution(String my_string) {
        char [] answerArr = new char[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answerArr[i] = my_string.charAt(my_string.length() - 1 - i);
        }
        String answer = new String(answerArr);
        return answer;
    }

    public String solution2(String my_string) {
        String answer = "";

        for (int i = my_string.length()-1; i >= 0 ; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }


}
