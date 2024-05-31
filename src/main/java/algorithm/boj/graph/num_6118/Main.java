package algorithm.boj.graph.num_6118;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        // 그래프 입력
        for (int i=0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        int[] visited = new int[N+1];
        Arrays.fill(visited, -1);
        Deque<Integer> dQ = new ArrayDeque<>();

        dQ.add(1);
        visited[1] = 0;

        while (!dQ.isEmpty()) {
            int node = dQ.poll();
            for (int nextNode : graph.get(node)) {
                if (visited[nextNode] == -1) {
                    visited[nextNode] = visited[node] + 1;
                    dQ.add(nextNode);
                }
            }
        }

        int resultDist = Arrays.stream(visited).max().getAsInt();
        int index = -1;
        int count = 0;

        for (int i=0; i <= N; i++) {
            if (visited[i] == resultDist) {
                if (index == -1) {
                    index = i;
                }
                count ++;
            }
        }
        System.out.println(index + " " + resultDist + " " + count);
    }
}
