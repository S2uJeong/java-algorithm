package com.algorithm.recursiveFunction;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static int sum(List<Integer> nums) {
        if (nums.isEmpty()) return 0;
        return nums.remove(nums.size()-1) + sum(nums) ;
        // return sum(nums) + nums.remove(nums.size()-1); => 올바른 결과 x
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        ListSum m = new ListSum();
        System.out.println(m.sum(nums));
    }
}
