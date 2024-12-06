package org.lumijiez.medium;

public class M238 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5 };
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] calculated = new int[n];

        calculated[0] = 1;
        for (int i = 1; i < n; i++) {
            calculated[i] = calculated[i - 1] * nums[i - 1];
        }

        int rightProducts = 1;
        for (int i = n - 1; i >= 0; i--) {
            calculated[i] *= rightProducts;
            rightProducts *= nums[i];
        }

        return calculated;
    }
}
