public class Solution {
  public ListNode swapPairs(ListNode head) {
    if (head==null||head.next ==null) return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode p1 = dummy;
    ListNode p2 = head;
    while (p2.next!=null && p2!=null) {
      ListNode nextStart = p2.next.next;
      p1.next = p2.next;
      p2.next.next = p2;
      p2.next = nextStart;
      p1 = p2;
      p2 = p2.next;
    }
    return dummy.next;  
  }
}
