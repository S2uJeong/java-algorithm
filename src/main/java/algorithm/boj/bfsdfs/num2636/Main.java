package algorithm.boj.bfsdfs.num2636;

import java.io.*;
import java.util.*;

/**
 * 치즈가 모두 녹아 없어지는 데 걸리는 시간과 녹기 바로 직전 치즈의 칸 갯수
 * 세로, 사로 = 100,100
 */
public class Main {

    static int N, M; // 맵의 가로,세로 길이
    static int[][] maps;// 맵 (치즈 상태를 나타냄)
    static int[][] visited;

    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};

    static int answerTime = 0;
    static int answerCount = 0;

    public static int bfs(int r, int c) {
        int deletedCheeseCount = 0;

        Deque<int[]> dQ = new ArrayDeque<>();
        dQ.offerLast(new int[]{r, c});
        visited = new int[N][M];
        visited[0][0] = 1;

        while (!dQ.isEmpty()) {
            int[] cur = dQ.pollFirst();
            for (int i = 0; i < dr.length; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];

                if (0 <= nr && nr < N && 0 <= nc && nc < M && visited[nr][nc] == 0) {
                    if (maps[nr][nc] == 0) dQ.offerLast(new int[]{nr, nc});
                    else {
                        maps[nr][nc] = 0;
                        deletedCheeseCount += 1;
                    }
                    visited[nr][nc] = 1;
                }
            }
        }

        return deletedCheeseCount;
    }


    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maps = new int[N][M];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            int deletedCount = bfs(0, 0);
            if (deletedCount == 0) break;
            answerCount = deletedCount;
            answerTime += 1;
        }

        System.out.println(answerTime);
        System.out.println(answerCount);


    }


}
