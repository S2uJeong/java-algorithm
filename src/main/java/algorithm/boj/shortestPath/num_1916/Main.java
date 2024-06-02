package algorithm.boj.shortestPath.num_1916;
import java.io.*;
import java.util.*;

public class Main {
    static final int INF = (int) 1e9;
    static int[] distance;
    static List<List<int[]>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int city = Integer.parseInt(br.readLine().trim());
        int bus = Integer.parseInt(br.readLine().trim());

        graph = new ArrayList<>();
        for (int i=0; i <= city; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0; i < bus; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            graph.get(s).add(new int[]{e, dist});
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        distance = new int[city+1];
        Arrays.fill(distance, INF);

        dijkstra(S);
        System.out.println(distance[E]);

    }
    static void dijkstra(int start) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0,start});
        distance[start] = 0;

        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int dist = node[0];
            int now = node[1];

            if (distance[now] < dist) {
                continue;
            }

            for (int[] neighbor : graph.get(now)) {
                int next = neighbor[0];
                int cost = dist + neighbor[1];

                if (cost < distance[next]) {
                    distance[next] = cost;
                    pq.add(new int[]{cost, next});
                }
            }
        }
    }
}
