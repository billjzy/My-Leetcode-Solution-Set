public class Solution {
  public ListNode reverseBetween(ListNode head, int m, int n) {
  ListNode dummy = new ListNode(-1);
  dummy.next = head;
  head = dummy;
  ListNode run = head;
  int k =m-1;
  while (k>0) {
    run = run.next;
    k--;
  }
  ListNode prev = run;
  run = run.next;
  k = n-m;
  while (run.next!=null && k>0) {
    ListNode temp = run.next;
    run.next = temp.next;
    temp.next = prev.next;
    prev.next = temp;
    k--;
  }
 return head.next;
}
}
