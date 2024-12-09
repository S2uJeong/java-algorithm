package boj.dp.num_4097;

import java.util.Scanner;

/**
 * 최대 부분 배열 합
 */
public class Main {
    public static int maxSubarraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            result = Math.max(maxEndingHere, result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            int[] benefits = new int[N];
            for(int i = 0; i < N; i ++) {
                benefits[i] = sc.nextInt();
            }
            int result = maxSubarraySum(benefits);
            System.out.println(result);
        }
        sc.close();
    }
}
