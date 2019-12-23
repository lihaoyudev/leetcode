package com.mine;

import com.mine.node.ListNode;

/**
 * 61 143 234
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode p = dummyNode;
        ListNode q = dummyNode;
        for (int i = 0; i < n+1; i++) {
            assert q != null;
            q = q.next;
        }

        while (q != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummyNode.next;
    }
}
