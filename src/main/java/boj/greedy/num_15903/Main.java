package boj.greedy.num_15903;

import java.io.*;
import java.util.*;

/**
 * java는 자연수 범위에 따라 int or long을 적절하게 선언해 줘야 한다.
 * -> 자연수의 범위가 최대 1,000,000까지 나올 수 있고 카드의 수가 최대 1,000개가 나올 수 있기 때문에 Long형으로 우선 순위 큐 및 합 변수를 선언해야 한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // M,N 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // nums 입력
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i < N; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }
        // 카드 놀이 진행
        for (int i=0; i < M; i++) {
            long tmp = pq.poll();
            tmp += pq.poll();
            pq.add(tmp);
            pq.add(tmp);
        }
        // 결과 출력
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        System.out.println(sum);
        br.close();
    }
}
