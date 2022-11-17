package 프로그래머스.사칙연산;
// https://school.programmers.co.kr/learn/courses/30/lessons/120802

import java.util.Scanner;

public class Q001 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2 ;
        return answer;
    }

    public static void main(String[] args) {
        Q001 m = new Q001();
        System.out.println(m.solution(4,5));
    }
}
