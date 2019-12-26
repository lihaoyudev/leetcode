package com.mine;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
        }
        List<String> leftS = binaryTreePaths(root.left);
        for (int i = 0; i < leftS.size(); i++) {
            String s = root.val + "->" + leftS.get(i);
            res.add(s);
        }
        List<String> leftR = binaryTreePaths(root.right);
        for (int i = 0; i < leftR.size(); i++) {
            String s = root.val + "->" + leftR.get(i);
            res.add(s);
        }

        return res;
    }
}
