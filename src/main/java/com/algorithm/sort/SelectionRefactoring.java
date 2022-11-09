package com.algorithm.sort;

import java.util.Arrays;

// 리팩토링 방향: 오름차순/내림차순 둘다 가능하게 한다.
// 1. interface를 선언하고
// 2. Template Callback패턴 적용

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class SelectionRefactoring {
    public int[] sort(int arr[], StatementStrategy stmt){

        int minIdx = 0;
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (stmt.compare(arr[minIdx] , arr[j])) {
                    minIdx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionRefactoring ss = new SelectionRefactoring();
        System.out.println(Arrays.toString(ss.sort(arr, (a, b) -> a > b))); //오름차순
        System.out.println(Arrays.toString(ss.sort(arr, (a, b) -> a < b))); //내림차순
    }
}

