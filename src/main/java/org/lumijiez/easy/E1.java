package org.lumijiez.easy;

import java.util.Arrays;
import java.util.HashMap;

public class E1 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diff = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (diff.containsKey(nums[i])) {
                return new int[]{diff.get(nums[i]), i};
            }
            diff.put(target - nums[i], i);
        }

        return null;
    }
}
