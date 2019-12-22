package com.mine;

import java.util.HashMap;
import java.util.Map;

/**
 * 49
 */
public class LeetCode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || B == null || C == null || D == null) {
            throw new IllegalArgumentException("数据不合法");
        }
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                if (record.containsKey(sum)) {
                    record.put(sum, record.get(sum) + 1);
                } else {
                    record.put(sum, 1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (record.containsKey(-A[i]-B[j])) {
                    res += record.get(-A[i]-B[j]);
                }
            }
        }
        return res;
    }
}
