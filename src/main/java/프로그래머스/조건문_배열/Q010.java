package 프로그래머스.조건문_배열;

public class Q010 {
    public int solution(int[] array) {
        int answer = 0;

        //  index 배열의 크기를 정하도록 array의 max값을 구한다.
        int maxOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) maxOfArray = array[i];
        }
        int[] index = new int[maxOfArray + 1];

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        int max = 0;

        for (int i = 0; i < index.length; i++) {
            if (index[i] > max) {
                max = index[i];
                answer = i;
            }
        }
        int duplicatedCnt = 0;

        for (int i = 0; i < index.length; i++) {
            if (index[answer] == index[i]) {
                duplicatedCnt++;
            }
        }
        if (duplicatedCnt > 1) answer = -1;

        return answer;
    }


    public int findMaxOfArray(int[] array) {
        return 0;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,3,3,4};
        int answer = 0; // 최빈값
        int [] index = new int [101]; // 값 별로 갯수 저장할 배열,
                                    // input되는 array의 값 범위는 0~100이다.
        int max = 0;
        // 1. 값 별로 인덱스 달아서 count 하기
        for (int i = 0; i < array.length; i++) {
            index[array[i]] ++;
        }
        // 2. index 배열 내에서 최대값 구하기 ==> 최빈값
        for (int i = 0; i < index.length; i++) {
            if (index[i] > max) {
                max = index[i];
                answer = i;
            }
        }


    }
}
