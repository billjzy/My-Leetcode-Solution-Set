public class Solution{
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      Set <ListNode> set = new HashSet<>();
      ListNode a = headA,b=headB;
      while (a!=null){
          set.add(a);
          a=a.next;
      }
      while(b!=null){
          if (set.add(b)) {
              b=b.next;
              continue;
          }
          else {
              return b;
          }
      }
      return null;
  }
    
}
