package com.mine;

import java.util.*;

/**
 * 23
 */
public class LeetCode347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        assert k > 0 && nums.length > 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        // Integer 默认小的优先级高
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else {
                pq.remove();
                pq.add(key);
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        while (!pq.isEmpty()) {
            list.add(pq.remove());
        }
        return list;
    }
}
