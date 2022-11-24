package com.algorithm.recursiveFunction;
// https://codeup.kr/problem.php?id=1851

public class Star {
    public void starPrint(int num) {
        if (num <= 0 ) return;
        starPrint(num-1);
        System.out.print("*");

    }
    public static void main(String[] args) {
        Star m = new Star();
        m.starPrint(3);

    }
}
