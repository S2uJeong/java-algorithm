package com.algorithm.search;

public class Binary {

    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,4,5,6,7,8,9,10,11};
        int findNum = 2; // 찾아야 하는 값

        int idxHead = 0;
        int idxEnd = nums.length - 1;
        int findresult = 0;

        while (idxHead <= idxEnd) {
            // 중간값 찾기
            int midIdx = (idxHead + idxEnd) / 2;    // 실수 있었던 부분
            int midValue = nums[midIdx];
            // 인덱스(시작점, 끝점) 옮기기
            if (midValue > findNum) {
                idxEnd = midIdx - 1 ;
            } else if (midValue < findNum) {
                idxHead = midIdx + 1;
            } else {
                findresult = nums[midIdx];
                break;
            }
        }
        // 같은지 비교
        if (findresult == findNum) {
            System.out.println("탐색성공");
        } else System.out.println("탐색실패");
    }

}
