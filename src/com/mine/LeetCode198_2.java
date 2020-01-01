package com.mine;

/**
 * 动态规划
 * 213、337、309
 */
public class LeetCode198_2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        // memo[i]表示从打劫[i,n)所得的钱
        int[] memo = new int[nums.length];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                memo[i] = Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));
            }
        }
        return memo[0];
    }
}
