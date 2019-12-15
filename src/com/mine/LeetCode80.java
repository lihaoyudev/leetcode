package com.mine;

public class LeetCode80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        if (nums.length == 3 && nums[0] == nums[1] && nums[1] == nums[2]) {
            return 2;
        }

        int k = 2; // 下一个待放置元素的位置
        int t = 1; // k位置之前，element出现的频次
        int element = nums[2];
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            t = 2;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > element && t >= 2) {
                nums[k++] = nums[i];
                t = 1;
                element = nums[i];
            } else if (nums[i] == element && t < 2) {
                t++;
                k++;
            } else if (nums[i] == element && t == 2) {
                t++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,3,3,3};
        int k = new LeetCode80().removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
