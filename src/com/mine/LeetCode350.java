package com.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LeetCode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> record = new TreeMap<>();
        for (int num : nums1) {
            if (!record.containsKey(num)) {
                record.put(num, 1);
            } else {
                record.put(num, record.get(num) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (record.containsKey(num) && record.get(num) > 0) {
                result.add(num);
                record.put(num, record.get(num) - 1);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for (Integer num : result) {
            res[index++] = num;
        }
        return res;
    }
}
