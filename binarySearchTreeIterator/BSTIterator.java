import java.util.Stack;
public class BSTIterator{
  private Stack<TreeNode> stack ; 
  public BSTIterator(TreeNode root){
    stack = new Stack<>();
    if (root==null) return ;
    stack.push(root);
    TreeNode cur = root.left;
    while(cur!=null){
      stack.push(cur);
      cur = cur.left;
    }
  }
  /** @return whether we have a next smallest number */
  public boolean hasNext(){
    if (stack.isEmpty()) return false;
    else return true ;
  }
  
  /** @return the next smallest number*/
  public int next(){
    if (stack.isEmpty()) return 0;
    TreeNode next = stack.pop();
    if (next.right == null) return next.val;
    else{
      stack.push(next.right);
      TreeNode cur=next.right.left;
      while (cur!=null){
      stack.push(cur);
      cur = cur.left;
      }
      return next.val;
    }
  }
}
