package org.lumijiez.easy;

import java.util.HashSet;

public class E217 {
    public static void main(String[] args) {
        int[] nums = {3, 3};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }

}