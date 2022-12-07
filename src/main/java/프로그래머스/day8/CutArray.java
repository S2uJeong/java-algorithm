package 프로그래머스.day8;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://velog.io/@sj9802/Java8-IntStream
 * solution별로 속도가 달랐던 이유에 대해 적어놓았다.
 */

public class CutArray {
    // 느리다. 평균 2초대.
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = IntStream.range(num1, num2 + 1)
                .map(i -> numbers[i])
                .toArray();
        return answer;
    }
    // 빠르다. 평균 0.02초대.
    public int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }

    // solution2와 동일
    public int[] solution3(int[] numbers, int num1, int num2) {
        int [] answer = new int[num2 - num1 +1];

        for (int i = num1; i <= num2; i++) {
            answer[ i - num1 ] = numbers[i];
        }
        return answer;
    }
}
