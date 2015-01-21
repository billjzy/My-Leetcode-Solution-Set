public class Solution{
  class ans {int val=0;} 
  public int sumNumbers(TreeNode root){
    if (root == null) return 0;
    ans res = new ans();
    dfs(root,0,res);
    return res.val;
  }
  private void dfs(TreeNode cur, int sum, ans res){
    if (cur==null) return ;
    sum =sum*10 +  cur.val;
    if (cur.left==null&&cur.right==null) {
      res.val += sum;
    }
    else {
       dfs(cur.left, sum ,res);
       dfs(cur.right, sum, res);
    }
  }
}
