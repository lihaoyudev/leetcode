package com.mine;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode node, List<Integer> res) {
        if (node != null) {
            res.add(node.val);
            preorderTraversal(node.left, res);
            preorderTraversal(node.right, res);
        }
    }
}
