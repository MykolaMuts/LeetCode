package problems.java._helper;

public class ListNode {
    public int val;
    public ListNode next;

    // Constructors
    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ListNode a = this;
        ListNode b = (ListNode) obj;

        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }

        // both must be null (end at same time)
        return a == null && b == null;
    }

    @Override
    public int hashCode() {
        // Simple rolling hash based on list values
        int result = 1;
        ListNode curr = this;
        while (curr != null) {
            result = 31 * result + curr.val;
            curr = curr.next;
        }
        return result;
    }
}

