import java.util.*;
public class Solution{
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    List<TreeNode> s = new LinkedList<>();
    s.add(root);
    while(!s.isEmpty()) {
      TreeNode temp = s.remove(s.size()-1);
      res.add(temp.val);

      if(temp.right!=null) s.add(temp.right);
      if(temp.left!=null) s.add(temp.left);

    }
    return res;
  } 
} 
