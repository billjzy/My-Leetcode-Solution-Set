public class Solution{
   public boolean pathSum(TreeNode root,int sum){
     
     if (root==null) return false;
     if (root.left==null&&root.right==null&&sum==root.val) return true;
     return pathSum(root.left,sum-root.val)||pathSum(root.right,sum-root.val);   
   }
}
