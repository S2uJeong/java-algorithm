package com.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSmallstNum {
    public int[] solution(int[] arr) {
        // 배열 안에서 제일 작은 값 찾기
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // 작은 값 제외한 수 list에 넣어주기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                list.add(-1);
                break;
            } else if (arr[i] == min) {
                continue;
            } else {
                list.add(arr[i]);
            }
        }
        // listToArray
        int [] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int[] solution2(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int minIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        // minIndex 제외하고 값 복붙
        for(int i=minIndex+1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        // answer 배열에 담기
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveSmallstNum m = new RemoveSmallstNum();
        // int [] arr = {4,3,2,1};
        int [] arr = {10};
        System.out.println(Arrays.toString(m.solution(arr)));


    }

}
