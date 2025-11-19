package problems.java;

import problems.java._helper.ListNode;

public class RemoveNthNodeFromEndOfList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;

        if(head.next == null){
            head = null;
            return head;
        }
        if(n == 1){
            head.next = head.next.next;
        }

        ListNode current = head;
        while (current.next != null){
            if(count == n){
                current.next = current.next.next;
            }
            current = current.next;
            count++;
        }
        return head;
    }


    public static void test() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEndOfList19 solution = new RemoveNthNodeFromEndOfList19();

        System.out.println(solution.removeNthFromEnd(head, 1));

    }

}
