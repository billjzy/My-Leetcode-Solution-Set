/*use stack rather than linkedlist
 * much better!*/

import java.util.*;
public class Solution{
  public void flatten(TreeNode root){
    if (root == null) return ;
    Stack<TreeNode> temp = new Stack<>();
    temp.push(root);
    while (!temp.isEmpty()){
      TreeNode node = temp.pop();
      if (node.right!=null) temp.push(node.right);
      if (node.left!=null) temp.push(node.left);
      node.right= temp.isEmpty()? null:temp.peek();
      node.left=null;
    }
  }
}
