package com.mine;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal(root,  res);
        return res;
    }

    private void inorderTraversal(TreeNode node, List<Integer> res) {
        if (node != null) {
            inorderTraversal(node.left, res);
            res.add(node.val);
            inorderTraversal(node.right, res);
        }
    }
}
