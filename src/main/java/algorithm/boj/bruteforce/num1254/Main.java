package algorithm.boj.bruteforce.num1254;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        sc.close();

        for (int i =0; i < data.length(); i++) {
            if (isPallindrome(data.substring(i))) {
                System.out.println(data.length() + i);
                break;
                }
            }
        }

    private static boolean isPallindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) { // 길이가 홀수 일때를 대비해서 <= 를 넣어야 한다고 생각했는데, 고려하지 않아도 되는 부분이였음. 어차피 홀수면 가운데 수는 어느것과도 같지 않아도 되기 때문
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
