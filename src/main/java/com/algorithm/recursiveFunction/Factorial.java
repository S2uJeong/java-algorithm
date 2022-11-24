package com.algorithm.recursiveFunction;
// https://codeup.kr/problem.php?id=1912

public class Factorial {
    private static int factorial(int num) {
        if (num == 1) return num;
        return num * factorial(num - 1);
    }
}
