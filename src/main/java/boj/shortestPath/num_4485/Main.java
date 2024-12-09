package boj.shortestPath.num_4485;

import java.util.*;
import java.io.*;


public class Main {
    static final int INF = (int) 1e9;
    static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int tc = 1; // testCase number
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = Integer.parseInt(br.readLine().trim());
            if (N == 0) {
                break;
            }
            int [][] maps = new int[N][N];
            int [][] distance = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j=0; j < N; j++) {
                    maps[i][j] = Integer.parseInt(st.nextToken());
                    distance[i][j] = INF;
                }
            }
            int result = dijkstra(distance, maps, N);
            sb.append("Problem ").append(tc++).append(": ").append(result).append("\n");
        }
        System.out.println(sb.toString());

    }

    public static int dijkstra(int[][] distance, int[][] maps, int N) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[0][0] = maps[0][0];
        pq.add(new Node(0,0,maps[0][0]));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int dist = now.dist;
            int r = now.r;
            int c = now.c;

            if(distance[r][c] < dist) {
                continue;
            }
            for (int[] direction : directions) {
                int nr = r + direction[0];
                int nc = c + direction[1];

                if (0<= nr & nr < N && 0 <= nc && nc < N && distance[nr][nc] > maps[nr][nc] + dist) {
                    distance[nr][nc] = maps[nr][nc] + dist;
                    pq.add(new Node(nr,nc,distance[nr][nc]));
                }
            }
        }
        return distance[N-1][N-1];
    }

    /**
     * 최소힙에서 배열을 통해 인자가 들어올 때, 비교할 수 있게 Comparable 구현 객체 생성
     */
    static class Node implements Comparable<Node> {
        int r,c,dist;

        Node(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.dist, other.dist);
        }
    }

}
