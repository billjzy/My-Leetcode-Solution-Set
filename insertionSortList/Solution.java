public class Solution {
  public ListNode insertionSortList(ListNode head) {
    if (head == null) return null;

    ListNode helper = new ListNode(0);

    ListNode prev = helper;
    ListNode cur = head;
    while (cur!=null) {
      ListNode temp = cur.next;
      prev = helper;
      while(prev.next!=null&&prev.next.val<=cur.val) {
        prev = prev.next;
      }
      cur.next = prev.next;
      prev.next = cur;
      cur = temp;
    }
    return helper.next;
  }
}
