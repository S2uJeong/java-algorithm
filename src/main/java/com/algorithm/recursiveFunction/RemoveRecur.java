package com.algorithm.recursiveFunction;

/**
 * 최대공약수 구하는 알고리즘 - 재귀 사용, 재귀 없애기
 */
public class RemoveRecur {
    public static int gcd(int a, int b) {
        if (a > b) return gcd(a - b, b); // 196, 42
        else if (a < b) return gcd(a, b - a); // 28, 42
        else if (a == b) return a;
        return 1;
    }

    public static int recur(int x, int y) {
        if (y == 0) return x;
        else return recur(y, x % y);

    }

    public static void main(String[] args) {

        // solution 함수의 재귀제거
        int a = 196;
        int b = 42;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else if (a < b) { // else if로 종료조건 걸어준다.
                b = b - a;
            }
        }
        System.out.printf("%d, %d\n", a, b);


        // test) recur 함수결과 == gcd 함수결과?
        System.out.println("test) recur 함수결과 == gcd 함수결과?");
        System.out.println("gcd(196,42) : " + gcd(196, 42));
        System.out.println("recur(196,42) : " + recur(196, 42));
        System.out.println("gcd(42,196) : " + gcd(42, 196));
        System.out.println("recur(42,196) : " + recur(42, 196));

    }
}
