import java.util.*;
public class Solution{
  public void flatten(TreeNode root){
    if (root == null) return ;
    LinkedList<TreeNode> temp = new LinkedList<>();
    temp.add(root);
    while (!temp.isEmpty()){
      TreeNode node = temp.pollLast();
      if (node.right!=null) temp.add(node.right);
      if (node.left!=null) temp.add(node.left);
      node.right=temp.peekLast();
      node.left=null;
    }
  }
}
