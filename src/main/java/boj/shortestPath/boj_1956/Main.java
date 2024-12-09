package boj.shortestPath.boj_1956;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        // 특별 처리
        if (E <= 1) {
            System.out.println(-1);
            return;
        }
        int INF = (int) 1e9;
        int[][] dp = new int[V+1][V+1];

        // 최단 거리 배열 초기화
        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        for (int i=0; i<E; i++) {
            int f_node = sc.nextInt();
            int t_node = sc.nextInt();
            int dist = sc.nextInt();
            dp[f_node][t_node] = dist;
        }
        // 플로이드 와샹 적용
        for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    if (dp[i][j] > dp[i][k] + dp[k][j]) {
                        dp[i][j] = dp[i][k] + dp[k][j];
                    }
                }
            }
        }

        // 최단 사이클 찾기
        int result = INF;
        for(int node=1; node <= V; node++ ) {
            if (result > dp[node][node]) {
                result = dp[node][node];
            }
        }

        // 결과 출력
        if (result == INF) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}
