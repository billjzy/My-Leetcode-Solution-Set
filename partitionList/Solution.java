public class Solution {
  public ListNode partition(ListNode head, int x) {
    if (head==null|| head.next ==null) {
      return head;
    }
    ListNode preLeft = new ListNode(-1);
    ListNode leftEnd = preLeft;

    ListNode preRight = new ListNode(-1);
    ListNode rightEnd = preRight;

    ListNode run = head;
    while (run!=null) {
      ListNode temp = run.next;
      if(run.val<x) {
        leftEnd.next = run;
        leftEnd = leftEnd.next;
      }
      else {
         rightEnd.next = run;
         rightEnd = rightEnd.next;
      }
    run.next = null;
    run = temp;
  }
  leftEnd.next = preRight.next;
  return preLeft.next;
 }
}
