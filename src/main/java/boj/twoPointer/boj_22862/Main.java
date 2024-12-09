package boj.twoPointer.boj_22862;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n, k;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        n = Integer.parseInt(inputs[0]);
        nums = new int[n];
        k = Integer.parseInt(inputs[1]);
        String[] inputs2 = br.readLine().split(" ");
        int idx = 0;
        for (String input : inputs2) {
            nums[idx++] = Integer.parseInt(input);
        }
        int result = solve();
        System.out.println(result);
    }

    public static int solve() {
        int longestCnt = 0;
        int odd_cnt = 0;
        int even_cnt = 0;
        int left = 0, right = 0;

        while (right < n) {
            if (odd_cnt <= k) {
                if (nums[right] % 2 == 1) odd_cnt += 1;
                else even_cnt += 1;
                right += 1;
            } else {
                if (nums[left] % 2 == 1) odd_cnt -= 1;
                else even_cnt -= 1;
                left += 1;
            }
            if (even_cnt > longestCnt) {
                longestCnt = even_cnt;
            }
        }
        return longestCnt;
    }
}