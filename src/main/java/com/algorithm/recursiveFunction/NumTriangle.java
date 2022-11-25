package com.algorithm.recursiveFunction;
// https://codeup.kr/problem.php?id=1860

/**
 * 입력 : 5
 * 출력 :
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
public class NumTriangle {

    public static void printNums(int n) {
        if (n == 0) return;
        printNums(n - 1); // 먼저 작은 숫자를 호출해서 스택에 넣는다.
        System.out.println(getNums(n));
    }

    public static String getNums(int n) {
        if (n == 1) return "1"; // 0이 왜 안되는지 고민 => 문제에 나온 공백관련 1 앞에 공백이 들어가지 않도록 하귀 위해 1에서 끝낸다.
        return getNums(n - 1) +" " + n;
    }

    public static void main(String[] args) {
        printNums(5);
    }

}
