package problems.java;

import org.junit.jupiter.api.Test;
import problems.java._helper.ListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTwoSortedLists21Test {

    MergeTwoSortedLists21 solution = new MergeTwoSortedLists21();


    @Test
    void example1() {

        ListNode node0 = new ListNode(4);
        ListNode node1 = new ListNode(2, node0);
        ListNode node2 = new ListNode(1, node1);

        ListNode node00 = new ListNode(4);
        ListNode node01 = new ListNode(3, node00);
        ListNode node02 = new ListNode(1, node01);

        ListNode node000 = new ListNode(4);
        ListNode node001 = new ListNode(4, node000);
        ListNode node002 = new ListNode(3, node001);
        ListNode node003 = new ListNode(2, node002);
        ListNode node004 = new ListNode(1, node003);
        ListNode node005 = new ListNode(1, node004);

        ListNode node = solution.mergeTwoLists(node2, node02);

        assertTrue(areListsEqual(node, node005));

    }

    private boolean areListsEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

}