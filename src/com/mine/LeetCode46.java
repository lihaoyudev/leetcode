package com.mine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {
    private List<List<Integer>> res;
    private boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        used = new boolean[nums.length];
        LinkedList<Integer> p = new LinkedList<Integer>();
        generatePermutation(nums, 0, p);
        return res;
    }

    /**
     * p中保存index-1个元素的排列
     * @param nums 数组
     * @param index 下表
     * @param p index-1个元素的排列
     */
    private void generatePermutation(int[] nums, int index, LinkedList<Integer> p) {
        if (index == nums.length) {
            res.add((List<Integer>) p.clone());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                p.addLast(nums[i]);
                generatePermutation(nums, index + 1, p);
                p.removeLast();
                used[i] = false;
            }
        }
    }
}
