package com.mine;

import java.util.HashMap;
import java.util.Map;

/**
 * 15  18   16
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (record.containsKey(complement)) {
                int[] res = {i, record.get(complement)};
                return res;
            }
            record.put(nums[i], i);
        }
        throw new RuntimeException("the input has no solution");
    }
}
