import java.util.*;
public class Solution {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<LinkedList<TreeNode>> nodeRes = new LinkedList<>();
    LinkedList<TreeNode> level = new LinkedList<>();
    level.add(root);
    nodeRes.add(level);
    int ifRev = 0;
    while (!level.isEmpty()){
       LinkedList<TreeNode> parent = new LinkedList<>(level);
       level = new LinkedList<>();
       while (!parent.isEmpty()){
       TreeNode temp = parent.pollFirst();
       if (temp.left!=null) level.add(temp.left);
       if (temp.right!=null) level.add(temp.right);
       }
       if (!level.isEmpty()) {
         nodeRes.add(level);
       }
    }
    for (LinkedList<TreeNode> l: nodeRes){
      List<Integer> line = new LinkedList<>();
      if (ifRev ==0 ) {
        for (TreeNode t:l)
          line.add(t.val);
      }
      if (ifRev == 1) {
        for (int i=l.size()-1;i>=0;i--) 
          line.add(l.get(i).val);
      }
      res.add(line);
      ifRev = 1- ifRev;
    } 
  return res;
  }
}
