package com.algorithm.dinamicPrograming;

// 피보나치 수열에 동적계획법 적용해보자.
public class Fibonacci {
    // 1. 재귀로 피보나치 수열 구현
    public static int recur(int num) {
        if ( num <= 2) return 1;
        return recur(num - 1) + recur(num - 2);
    }

    // 2. 바텀업 동적계획법으로 구현
    public static long dinamicFibo(int n) {
        long [] table = new long [n + 1];

        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    // 3. 탑다운 동적계획법으로 구현
    public static long dp(int n, long [] memo) {
        if (n <= 1) {
            return  n;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = dp( n -1, memo) + dp(n -2, memo);
        }
    }


    public static void main(String[] args) {
        long start;
        long end;
       /* start = System.currentTimeMillis();
        end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");*/
        int n = 50;

        Fibonacci fibonacci = new Fibonacci();

        start = System.currentTimeMillis();
        System.out.println(recur(n));
        end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");

        start = System.currentTimeMillis();
        System.out.println(dinamicFibo(n));
        end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");

        start = System.currentTimeMillis();
        System.out.println(dp(50, new long [n+1]));
        end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");
    }
}
