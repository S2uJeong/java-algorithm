package com.algorithm.recursiveFunction;
/**
 * https://codeup.kr/problem.php?id=1859
 * 한 정수 n을 입력받아 n 층의 별 삼각형을 출력하시오.
 */
public class TriangleStar {
    public static String getStars(int n) {
        if (n == 0) return "";
        return "*" + getStars(n-1);
    }

    public static void printStar(int n) {
        if (n == 0) return;
        printStar(n-1);
        System.out.println(getStars(n));
    }
    public static void main(String[] args) {
        printStar(4);

    }

}
