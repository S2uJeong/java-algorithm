package 프로그래머스.문자열_반복문_출력_배열_조건문;

import java.util.Scanner;

public class Q021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
