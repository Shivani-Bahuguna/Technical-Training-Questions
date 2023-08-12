class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
class Solution2 {
    public ListNode1 removeNthFromEnd(ListNode1 head, int n) {
        ListNode1 start = new ListNode1();
        start.next = head;
        ListNode1 fast = start;
        ListNode1 slow = start;

        for(int i = 1; i <= n; ++i)
            fast = fast.next;

        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}