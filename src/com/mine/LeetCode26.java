package com.mine;

public class LeetCode26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 2 &&nums[0] == nums[1]) {
            return 1;
        }
        int k = 1; // 下一个待放置元素的位置
        int i = 2;
        int element = nums[0];
        if (nums[0] != nums[1]) {
            k = 2;
            i = 2;
            element = nums[1];
        }
        for (; i < nums.length; i++) {
            if (nums[i] > element) {
                nums[k++] = nums[i];
                element = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2};
        int k = new LeetCode26().removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
