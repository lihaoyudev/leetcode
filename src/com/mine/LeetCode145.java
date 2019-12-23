package com.mine;

import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(root, res);
        return res;
    }

    private void postorderTraversal(TreeNode node, List<Integer> res) {
        if (node != null) {
            postorderTraversal(node.left, res);
            postorderTraversal(node.right, res);
            res.add(node.val);
        }
    }
}
