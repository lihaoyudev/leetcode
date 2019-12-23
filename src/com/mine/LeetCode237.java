package com.mine;

import com.mine.node.ListNode;

public class LeetCode237 {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("node should be valid and can not be the tail node.");
        }
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
