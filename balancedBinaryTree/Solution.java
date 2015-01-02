public class Solution{
  public boolean isBalanced(TreeNode root){
    return (getHeight(root)!=-1);
  }
  //find the height of each Node, return -1 if unbalance is detected
  public int getHeight(TreeNode root){
    if (root == null) return 0;
    int left = getHeight(root.right);
    if (left == -1) return -1;
    int right = getHeight(root.left);
    if (right == -1) return -1;
    if (Math.abs(right-left)>1) return -1;
    else return 1+Math.max(right,left);
  }
}
