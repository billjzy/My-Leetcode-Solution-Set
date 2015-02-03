import java.util.*;
public class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if (root == null) return res;
    Stack<TreeNode> s = new Stack<>();
    TreeNode current = root ;
    while (!s.isEmpty()||current!=null) {
      if (current!=null) {
        s.push(current);
        current = current.left;
      }
      else{
        current = s.pop();
        res.add(current.val);
        current = current.right;
      }
    }
    return res;
  }
}
