package com.algorithm.hashad;

public class Solutuon {

    public boolean solution(int x) {
        // 자릿수의 합 구하기
        int sumOfDigit = 0;
        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        // 나누어 떨어지는 지 확인
        if ((x % sumOfDigit) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Solutuon s = new Solutuon();
        System.out.println(s.solution(18));

    }
}
