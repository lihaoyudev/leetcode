package com.mine;

import com.mine.node.ListNode;

/**
 * 25 147  148
 */
public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode p = dummyNode;
        while (p.next != null && p.next.next != null) {
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            node2.next = node1;
            node1.next = next;
            p.next = node2;
            p = node1;
        }
        ListNode node = dummyNode.next;
        dummyNode.next = null;
        return node;
    }
}
