package com.mine;

public class LeetCode437 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = findPath(root, sum);
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        return res;
    }

    /**
     * 以node为根节点的所有路径之和为num的值
     * @param node 根节点
     * @param num 路径之和
     * @return 路径个数
     */
    private int findPath(TreeNode node, int num) {
        int res = 0;
        if (node == null) {
            return 0;
        }
        if (node.val == num) {
            res += 1;
        }
        res += findPath(node.left, num - node.val);
        res += findPath(node.right, num - node.val);
        return res;
    }
}
