public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    if (head==null||head.next ==null) return head;
    Map<Integer, Integer> map= new HashMap<>();
    Set<Integer> set =new HashSet<>();
    ListNode iter = head;
    int i=1;
    while (iter!=null){
      if (set.add(iter.val)){
      map.put(i,iter.val);
      i++;
      }
      iter=iter.next;
    }
    ListNode dummy = new ListNode(-1); 
    ListNode cur = dummy;
    for (int j=1;j<=map.size();j++){
         cur.next = new ListNode(map.get(j));
         cur = cur.next;
    }
    return dummy.next;
  }
}