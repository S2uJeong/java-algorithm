package algorithm.boj.dataStructure.num_17298;

import java.util.*;
import java.io.*;

public class TimeFail {
    static int N;
    static ArrayList<Integer> nums = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> answer = findAnswer(nums);
        for (int a : answer) {
            System.out.print(a + " ");
        }

    }

    public static ArrayList<Integer> findAnswer(ArrayList<Integer> nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i) < nums.get(j)) {
                    answer.add(nums.get(j));
                    break;
                }
            }
            if (answer.size() < i+1) {
                answer.add(-1);
            }
        }
        answer.add(-1);
        return answer;
    }
}
