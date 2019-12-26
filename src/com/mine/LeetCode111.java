package com.mine;

public class LeetCode111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int ret = Integer.MAX_VALUE;
        if (root.left != null) {
            ret = Math.min(minDepth(root.left) + 1, ret);
        }
        if (root.right != null) {
            ret = Math.min(minDepth(root.right) + 1, ret);
        }
        return ret;
    }
}
