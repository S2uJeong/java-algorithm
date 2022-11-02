package com.algorithm.removeMultipleOf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// N = 50 미만의 모든 소수 구하는 에라토스테네스 채 알고리즘
public class RemoveMultipleOf {
    public static void main(String[] args) {

        // 1. 2~50까지 49칸 리스트 만들기
        List<Integer> numbers = new ArrayList<>();
        int N = 50;

        for (int i = 2; i < N; i++) numbers.add(i);

        // 2. 만든 리스트에서 2를 제외한 모든 2의 배수 지우기 -> j의 배수 지우기
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 2; j <= 7; j++) {
                if (numbers.get(i) % j == 0 && numbers.get(i) > j) {
                    numbers.remove(i);
                }
            }
        }
        System.out.println(numbers);

    }


}
