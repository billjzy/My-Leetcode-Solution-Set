public class Solution{
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int L1=0,L2=0;
    ListNode iter1=headA,iter2=headB;
                       
     while (iter1!=null){
       L1++;
       iter1=iter1.next; 
      }
     while (iter2!=null){
        L2++;
       iter2=iter2.next;
     }    
     int differ = L1 -L2;
     iter1=headA;
     iter2=headB;

     if (L1<L2){
       differ=L2-L1;
       iter1=headB;
       iter2=headA;
     }
     for (int i=0;i<differ;i++){
       iter1=iter1.next;
     }
     while (iter1!=null&&iter2!=null) {
       if (iter1==iter2) {
         return iter1;
       }
       iter1=iter1.next;
       iter2=iter2.next;
     }
     return null;
}
    
}
