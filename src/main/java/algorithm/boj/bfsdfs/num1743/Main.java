package algorithm.boj.bfsdfs.num1743;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int N,M,K;
    static boolean[][] trashMap;
    static int[] dc = {-1,1,0,0};
    static int[] dr = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        trashMap = new boolean[N][M];
        // 쓰레기 위치 입력 받아 표시
        for (int i=0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            trashMap[r-1][c-1] = true;
        }

        int result = 0;
        for (int i=0; i < N; i++) {
            for (int j=0; j < M; j++) {
                if (trashMap[i][j]) {
                    int cnt = bfs(i,j);
                    result = Math.max(result, cnt);
                }
            }
        }
        System.out.println(result);
    }
    static int bfs(int i, int j) {
        int cnt = 0;
        Deque<int[]> dQ = new ArrayDeque<>();
        dQ.add(new int[]{i,j});
        trashMap[i][j] = false;

        while (!dQ.isEmpty()) {
            int[] point = dQ.poll();
            int r = point[0];
            int c = point[1];
            cnt++;

            for (int k=0; k <4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < N && 0 <= nc && nc < M && trashMap[nr][nc]) {
                    trashMap[nr][nc] = false;
                    dQ.add(new int[]{nr,nc});
                }
            }
        }
        return cnt;
    }
}
