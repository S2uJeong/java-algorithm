package boj.greedy.boj_2109;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> pays = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int pay = sc.nextInt();
            int day = sc.nextInt();
            pays.add(new int[] {pay, day});
        }

        pays.sort((a,b) -> (a[1] == b[1]) ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));


        PriorityQueue<Integer> answerList = new PriorityQueue<>();

        for (int[] payDay : pays) {
            int pay = payDay[0];
            int day = payDay[1];
            if (day <= answerList.size()) {
                if (!answerList.isEmpty()) {
                    answerList.poll();
                    answerList.offer(pay);
                }
            } else {
                answerList.offer(pay);
            }
        }

        int total = 0;
        while(!answerList.isEmpty()) {
            total += answerList.poll();
        }

        System.out.println(total);
    }
}
