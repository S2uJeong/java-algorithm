package boj.greedy.num_1931;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] times = new int[N][2];

        for (int i =0; i < N; i++) {
            times[i][0] = sc.nextInt(); // 시작 시간
            times[i][1] = sc.nextInt(); // 끝나는 시간
        }

        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[1] == t2[1]) {
                    return t1[0] - t2[0];
                } else {
                    return t1[1] - t2[1];
                }
            }
        });
        int current = 0;
        int resultCnt = 0;
        for (int i=0; i<N; i++){
            if (current <= times[i][0]) {
                resultCnt++;
                current = times[i][1];
            }
        }
        System.out.println(resultCnt);
    }
}
