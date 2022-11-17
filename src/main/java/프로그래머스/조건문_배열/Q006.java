package 프로그래머스.조건문_배열;
// https://school.programmers.co.kr/learn/courses/30/lessons/120807

public class Q006 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        } else answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        Q006 m = new Q006();
        System.out.println(m.solution(2,3));
        System.out.println(m.solution(3,3));
    }
}
