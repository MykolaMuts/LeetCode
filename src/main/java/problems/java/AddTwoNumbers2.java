package problems.java;

import problems.java._helper.ListNode;

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode res = l3;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            l3.val = x + y;

            if (l3.val > 9) {
                l3.val %= 10;
                l3.next = new ListNode(1);
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            if (l3.next == null
                    && (l1 != null || l2 != null)) {
                l3.next = new ListNode();
            }
            l3 = l3.next;
        }
        return res;
    }

    public ListNode addTwoNumbersSum(ListNode l1, ListNode l2) {
        long sum = convertToNumber(l1) + convertToNumber(l2);
        System.out.println(sum);
        if (sum == 0) {
            return new ListNode(0);
        }
        return convertToListNode((sum));
    }

    private ListNode convertToListNode(long number) {
        if (number == 0) {
            return null;
        }

        long i = number % 10;
        number /= 10;

        return new ListNode((int) i, convertToListNode(number));
    }

    private long convertToNumber(ListNode listNode) {
        int power = 0;
        long res = 0;
        while (listNode != null) {
            res += (long) (listNode.val * Math.pow(10, power));
            power++;
            listNode = listNode.next;
        }
        return res;
    }
}
