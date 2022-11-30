package com.algorithm;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class CountPandY {

    boolean solution(String s) {

        s = s.toUpperCase();

        int cntP = 0;
        int cntY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') {
                cntP ++;
            }
            if (s.charAt(i) == 'Y') {
                cntY ++;
            }
        }
        if (cntP == cntY) {
           return true;
        } else return false;

    }
    // main() - TestCode
    public static void main(String[] args) {
        // input
        String input = "Pyy";
        // count
        int cntP = 0;
        int cntY = 0;

        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'P') {
                cntP ++;
            }
            if (input.charAt(i) == 'Y') {
                cntY ++;
            }
        }

        if (cntP == cntY) {
            System.out.println("True");
        } else System.out.println("False");



    }
}
