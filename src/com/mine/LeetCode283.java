package com.mine;

public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len <= 0) {
            return;
        }
        int[] nonZero = new int[len];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nonZero[j++] = nums[i];
            }
        }
        for (int k = j+1; k < len; k++) {
            nonZero[k] = 0;
        }
        for (int m = 0; m < len; m++) {
            nums[m] = nonZero[m];
        }
    }

}
