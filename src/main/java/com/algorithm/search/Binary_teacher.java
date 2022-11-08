package com.algorithm.search;

public class Binary_teacher {
    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,4,5,6,7,8,9,10,11};
        int targetValue = 7;
        int headIdx = 0;
        int endIdx = nums.length - 1;
        // 중간값찾기
        int midIdx = nums.length / 2;
        int midValue = nums[midIdx];
        // 인덱스 옮기기
        if (midValue > targetValue) {
            headIdx = midIdx + 1;
        } else if (midValue < targetValue) {
            endIdx = midIdx - 1;
        } else {  // 같은경우
            System.out.print(midIdx);
        }

    }
}
