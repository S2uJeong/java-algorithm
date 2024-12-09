package boj.bfsdfs.num1012;

import java.util.*;
import java.io.*;
public class Main {
    static int T,N,M,K;
    static int[][] maps;
    static int[] dr = {0,0,-1,1};
    static int[] dc = {-1,1,0,0};

    public static void main(String[] args) throws Exception {
        // 필요한 변수 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while (T > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            maps = new int[N][M];
            // 배추 있는 곳은 1로 표시하고, 배추 좌표만 있는 cabbages 초기화 (탐색 성능 개선용)
            ArrayList<Point> cabbages = new ArrayList<>();
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                maps[r][c] = 1;
                cabbages.add(new Point(r, c));
            }
            int answer = 0;

            for (Point now : cabbages) {
                if (maps[now.r][now.c] == 1) {
                    maps = bfs(now);
                    answer++;
                }
            }
            System.out.println(answer);
            T --;
        }
    }

    public static int[][] bfs(Point point) {

        Deque<Point> points = new ArrayDeque<>();
        points.offerLast(point);
        maps[point.r][point.c] = 1;


        while (!points.isEmpty()) {
            Point now = points.pollFirst();
            for (int i = 0; i < dr.length; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if( 0 <= nr && nr < N && 0 <= nc && nc < M && maps[nr][nc] == 1) {
                    maps[nr][nc] = 0;
                    points.offerLast(new Point(nr,nc));
                }
            }
        }
        return maps;
    }

}
class Point {
    int r;
    int c;

    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
