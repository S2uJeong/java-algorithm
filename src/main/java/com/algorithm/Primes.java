package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 소인수분해 값 찾기
 * https://codeup.kr/problem.php?id=4037
 */
public class Primes {
    // 에라토스테네스의 체
    static int[] primeNumberSieve(int n) {
        int [] arr = new int [n+1]; // 숫자를 지울 배열
        // 1. 배열 초기화
        for (int i = 2; i <= n ; i++) {
            arr[i] = i;
        }
        // 2. 지우기
        for (int i = 2; i <= n; i++) {
            if(arr[i] == 0) continue; // 이미 지워진 수라면 건너뛰기

            for (int j = 2 * i; j <= n; j+=i) {
                arr[j] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // int n = 72;  // testcase
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int [] arr = primeNumberSieve(n);
        List<Integer> answer = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (arr[i] != 0) {
                while ( ( n % i ) == 0) {
                    n = n/i;
                    answer.add(i);
                }
            }
        }
        // System.out.println(answer);
        for (int i = 0; i < answer.size(); i++) {
            System.out.printf("%d ", answer.get(i));
        }
    }
}
