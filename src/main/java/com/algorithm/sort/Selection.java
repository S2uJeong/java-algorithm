package com.algorithm.sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // 제일 작은값 찾기
        for (int i = 0; i < arr.length - 1; i++) {  // 스왑기준(인덱스값)
            int minIdx  = i;
            for (int j = i + 1 ; j < arr.length; j++) {  // 비교
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                System.out.println("idx(" + j+") - " + "minValue: " + arr[minIdx] + " minIdx : " + minIdx );
            }
            // 스왑
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println(i+"번째 결과) " + Arrays.toString(arr));
        }
    }
}
