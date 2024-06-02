package algorithm.boj.greedy.num_1715;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            minHeap.add(num);
        }
        if (N==1) {
            System.out.println(0);
            return;
        }

        int totalCost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.add(cost);
        }
        System.out.println(totalCost);
    }

}
