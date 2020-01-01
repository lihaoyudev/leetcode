package com.mine;

import java.util.Arrays;

/**
 * 动态规划，自底向上逐步求解
 * 279、91、62、63
 */
public class LeetCode343 {
    public int integerBreak(int n) {
        assert n >= 2;
        // memo[i]表示将i分割后的最大乘积
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i - j]));
            }
        }
        return memo[n];
    }
}
