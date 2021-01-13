package cs10_week2;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = head;
        if (head == null) {
            return head;
        }
        while (n.next != null) {
            if (n.val == n.next.val) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}