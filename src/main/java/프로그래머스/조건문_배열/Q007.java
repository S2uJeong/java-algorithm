package 프로그래머스.조건문_배열;

// https://school.programmers.co.kr/learn/courses/30/lessons/120808

import java.util.Arrays;

public class Q007 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        return answer;
    }

    /**
     * 유클리드 호제법 - 최대공약수
     */
    public int gcd(int x, int y) {
        if (y==0) { // 나머지가 0 인거임. 8 % 8 = 0 , 최대공약수는 8
            return x;
        } else return gcd(y, x%y ); // 나머지를 또 나누어서 x == y, 즉 x%y == 0 일때까지.
    }

    public static void main(String[] args) {
        // 0. 변수 선언
        int son1 = 4; int mom1 = 5; int son2 = 8; int mom2 = 9;
        int sameMom;
        int sumSon;
        Q007 q = new Q007();

        // 1. 공통 분모(mom*mom) 만들기, 분자도 같이 곱해주기
        sameMom = mom1 * mom2;
        son1 = son1 * mom2;
        son2 = son2 * mom1;
        System.out.println("1의 분수 = " + son1 + "/" +  sameMom + " 2의 분수 = " +  son2 + "/" + sameMom);
        // 2. 분자 더하기
        sumSon = son1 + son2;
        System.out.println("sumSon = " + sumSon);
        // 3. 약분 -최대공약수(유클호제)
        sameMom = sameMom / q.gcd(sumSon, sameMom);
        sumSon = sumSon / q.gcd(sumSon, sameMom);
        //  4. 분자 분모 각각 변수로 만들고서, 배열에 넣어주기
        int[] answer = {sumSon, sameMom};
        System.out.println(Arrays.toString(answer));
    }
}
