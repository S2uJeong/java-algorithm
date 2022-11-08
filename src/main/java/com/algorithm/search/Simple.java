package com.algorithm.search;

import java.util.Scanner;

public class Simple {

    public int search(int[] dataArr, int findNum) {
        for (int i = 0; i < dataArr.length; i++) {
            if (dataArr[i] == findNum) {
                return i; // 해당 위치 반환
            }
        }
        return -1; // 찾는 값이 없으면 -1
    }

    public static void main(String[] args) {
        int[] dataArr = {6, 3, 7, 8, 2};
        Simple simple = new Simple();
        int index = simple.search(dataArr, 8);
        System.out.println(index);
    }
}
