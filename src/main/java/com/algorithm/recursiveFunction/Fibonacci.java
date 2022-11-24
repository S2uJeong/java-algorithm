package com.algorithm.recursiveFunction;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private static int fib(int num) {
        if ( num <= 0) return 0;
        return fib(num) + fib( num-1 );
    }
    public static void main(String[] args) {
        List<Integer> fibonacciNums = new ArrayList<>();
        // n = 7, 1 1 2 3 5 8 13
        // n = 8, 1 1 2 3 5 8 13 21
        int idx = 0;
        fibonacciNums.add(1);
        idx = 1;
        fibonacciNums.add(1);
        /*idx = 2;
        fibonacciNums.add(fibonacciNums.get(1) + fibonacciNums.get(0));
        idx = 3;
        fibonacciNums.add(fibonacciNums.get(2) + fibonacciNums.get(1));*/
        for (int j = 2; j < 7; j++) { // n = 7
            fibonacciNums.add(fibonacciNums.get(j-1) + fibonacciNums.get(j-2));
        }
        System.out.println(fibonacciNums);
        // Function Test
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(3));
    }
}
