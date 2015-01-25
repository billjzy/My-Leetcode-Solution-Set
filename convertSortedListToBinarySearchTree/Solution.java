import java.util.*;
public class Solution {
  public TreeNode sortedListToBST(ListNode head) {
    ListNode cur = head; 
    List<Integer> list  = new ArrayList<>();
    while (cur != null) {
      list.add(cur.val);
      cur = cur.next;
    }
    if (list.isEmpty()) { return null;}
    int len = list.size() ;
    return add(list, 0, len-1);
  }
  private TreeNode add(List<Integer> list,int left, int right) {
    if (left>right) return null;
    int mid = (left+right)/2;
    TreeNode root = new TreeNode(list.get(mid));
    root.left = add(list, left, mid-1);
    root.right = add(list, mid+1, right);
    return root;
  }
}
