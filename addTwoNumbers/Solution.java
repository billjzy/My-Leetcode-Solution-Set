public class Solution{
  public ListNode addTwoNumbers(ListNode l1,ListNode l2){
    int carry = 0;
    ListNode iter1 = l1;
    ListNode iter2 = l2;
    ListNode res = new ListNode(0);
    ListNode iter =res ;
    while (iter1!=null||iter2!=null||carry!=0){
      int d1 = iter1==null? 0:iter1.val;
      int d2 = iter2==null? 0:iter2.val;
      int sum = d1 + d2 + carry;
      carry = sum/10;
      sum %= 10;
      iter.next = new ListNode(sum);
      iter = iter.next;
      iter1 = iter1==null? null:iter1.next;
      iter2 = iter2==null? null:iter2.next;
    }
    return res.next; 
  }
}

