package com.mine;

import com.mine.node.ListNode;

/**
 * 82 21
 */
public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode cur = dummyNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            } else {
                cur = cur.next;
            }
        }
        ListNode node = dummyNode.next;
        dummyNode.next = null;
        return node;
    }
}
