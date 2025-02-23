package boj.bfsdfs.num12919;

import java.util.Scanner;

public class Main {
    static String S,T;
    static int result = 0;

    public static void dfs(String curChars) {
        if (result == 1) {
            return;
        }

        if (curChars.length() == S.length()) {
            if (curChars.equals(S)) {
                result = 1;
            }
            return;
        }

        if (curChars.endsWith("A")) {
            dfs(curChars.substring(0, curChars.length() -1));
        }
        if (curChars.startsWith("B")) {
            dfs(new StringBuilder(curChars.substring(1)).reverse().toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        T = sc.next();
        sc.close();

        dfs(T);
        System.out.println(result);
    }
}
