package boj.dataStructure.boj_10799;

import java.io.*;
import java.util.*;

public class Main {
    static char[] charArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputs = br.readLine();
        charArr = inputs.toCharArray();
        int result = solution();
        wr.write(String.valueOf(result));

        br.close();
        wr.flush();
        wr.close();
    }

    public static int solution() {
        int cnt = 0;
        Deque<Character> stack = new ArrayDeque<>();

        for (int i=0; i<charArr.length; i++) {
            if (charArr[i] == '(') {
                stack.push('(');
            } else {
                if (charArr[i-1] == '(') { // 레이저 발견
                    stack.pop(); // 먼저, 레이저에 해당하는 '(' 스택에서 삭제
                    cnt += stack.size(); // 현재 인식된 막대기 갯수 만큼 조각 추가
                } else {  // 막대기 끝 도달
                     stack.pop(); // 조각 내기 끝난 막대기 제외시키기
                    cnt += 1; // 나머지 제일 오른쪽 조각 추가
                }
            }
        }
        return cnt;

    }
}
