package boj.dataStructure.num_17298;

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer = findNextGreaterElements();

        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            sb.append(a).append(' ');
        }
        System.out.println(sb);

    }
    public static int[] findNextGreaterElements() {
        int[] answer = new int[N];
        Arrays.fill(answer, -1);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                answer[deque.pollLast()] = nums[i];
            }
            deque.offerLast(i);
        }
        return answer;
    }

}
