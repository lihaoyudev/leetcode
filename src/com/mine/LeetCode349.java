package com.mine;

import java.util.Set;
import java.util.TreeSet;

public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> record = new TreeSet<>();
        Set<Integer> resultSet = new TreeSet<>();
        for (int num : nums1) {
            record.add(num);
        }
        for (int num : nums2) {
            if (record.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] res = new int[resultSet.size()];
        int index = 0;
        for (Integer num : resultSet) {
            res[index++] = num;
        }
        return res;
    }
}
