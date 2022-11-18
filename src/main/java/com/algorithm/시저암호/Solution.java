package com.algorithm.시저암호;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        StringBuilder sbAnswer = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i);
            if ( t != 32 ) {
                t += n;
            } else if ( t == 90 | t == 122) {
                t -= 25;
            }
            sbAnswer.append((char) t) ;
        }
        System.out.println(sbAnswer);

    }
}
