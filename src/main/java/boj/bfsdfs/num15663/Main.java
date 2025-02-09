package boj.bfsdfs.num15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static boolean[] visited;
    static int[] nums;
    static int[] combi;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        combi = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        int idx = 0;
        while (st.hasMoreTokens()) {
            nums[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        Arrays.sort(nums);
        dfs(0);
        System.out.println(sb.toString());
    }

    static void dfs(int depth) {
        if (depth == m) {
            for (int val : combi) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;  // input은 1부터 들어온다.

        for (int i = 0; i < n; i++) {
            if (nums[i] == before) continue; // 정렬이 되어 있기 때문에 이전에 나온 값이 같으면 어차피 같은 자리에 같은 값 넣어주는거라 중복 순열이 됨.
            if (visited[i]) continue;

            visited[i] = true;
            combi[depth] = nums[i];
            before = nums[i];
            dfs(depth + 1);
            visited[i] = false;
        }

    }
}
