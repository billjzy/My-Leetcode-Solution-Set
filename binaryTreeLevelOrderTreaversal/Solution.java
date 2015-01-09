import java.util.*;

public class Solution{
  public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Integer>> res = new LinkedList<>();
    if (root ==null) return res;
    List<TreeNode> cur = new LinkedList<>();
    cur.add(root);
    while (!cur.isEmpty()){
      List<TreeNode> temp = new LinkedList<>();
      List<Integer> line = new LinkedList<>();
      for (TreeNode n: cur){
        if (n.left!=null)
          temp.add(n.left);
        if (n.right!=null)
          temp.add(n.right);
        line.add(n.val);
      }
      res.add(line);
      cur = temp;
    }
   return res;

  }
}
