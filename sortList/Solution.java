/**
 * Sort the Linked List in O(n*lgn)
 * this is a merge sort solution
*/

import java.util.*;
public class Solution{
  public ListNode sortList(ListNode head){
    if (head ==null ||head.next==null) return head;
    List<ListNode> nodes = new ArrayList<>();
    ListNode iter = head;
    while(iter!=null) {
      nodes.add(iter);
      iter = iter.next;
    }
    Collections.sort(nodes, new nodeComparator());
    for (int i =0;i<nodes.size()-1;i++) {
      nodes.get(i).next = nodes.get(i+1);
    }
    nodes.get(nodes.size()-1).next = null;
    return nodes.get(0);

  
  }
  class nodeComparator implements Comparator<ListNode> {
    public int compare(ListNode a, ListNode b) {
      return a.val-b.val;
    } 
  }
}
