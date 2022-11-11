package com.algorithm.secretMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TenToTwo {

    public String getBinaryString(int decNum) {
        String answer = "";
        while (decNum > 0) {
            answer += decNum % 2;
            decNum /= 2;
        }
        return answer;
    }

    public int [] getBinaryStack(int num) {
        Stack<Integer> st = new Stack<>();
        while (num > 0) {
            st.push(num % 2);
            num = num / 2;
        }
        int [] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        TenToTwo t = new TenToTwo();
        System.out.println(Arrays.toString(t.getBinaryStack(8)));
    }
}


