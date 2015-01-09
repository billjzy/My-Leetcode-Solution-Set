import java.util.*;

public class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root){
     List<List<Integer>> res = new LinkedList<>();
     if (root==null) return res;
     List<TreeNode> cur = new LinkedList<>();
     List<Integer> temp = new LinkedList<>();
     cur.add(root);

     while (!cur.isEmpty()){
     List<TreeNode> l = new LinkedList<>(); 
     for ( TreeNode n: cur){
       if (n.left!=null) l.add(n.left);
       if (n.right!=null) l.add(n.right);
       temp.add(n.val);
     } 
  
     res.add(0,new LinkedList<Integer>(temp));
     temp.clear();
     cur = l;
     }
     return res;
  }
}
