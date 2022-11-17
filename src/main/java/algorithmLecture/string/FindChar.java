package algorithmLecture.string;

import java.util.Scanner;

// 대소문자 구분하지 않는다.
public class FindChar {
    public int solution(String srt, char t) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        FindChar m = new FindChar();
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();
        char target = strInput.charAt(0);
        int answer = 1;  // target 값은 어차피 같을 테니 1개 미리 올려두고, for문 index는 0이 아닌 1부터 시작

        for (int i = 1; i < strInput.length(); i++) {
            if (strInput.charAt(i) == target ) {
                answer++;
            }
        }
        System.out.println("입력된 문자: " + strInput + "정답은 ?:" + answer);
    }
}
