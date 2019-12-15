package com.mine;

// 438  76
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0, r = -1;
        int[] freq = new int[256]; // 存放滑动窗口内的字母的频次
        while (l < s.length()) {
            if ((r + 1) < s.length() && freq[s.charAt(r+1)] == 0) {
                freq[s.charAt(++r)]++;
            } else {
                freq[s.charAt(l++)]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
