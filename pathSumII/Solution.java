import java.util.*;
//dfs 
public class Solution{
  public List<List<Integer>> pathSum(TreeNode root, int sum){
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res ;
    dfs(res, new ArrayList<Integer>(), sum, root);
    return res ;
  
  } 
  public void dfs(List<List<Integer>> res, ArrayList<Integer> list, int sum, TreeNode cur ){
    if(cur == null ) return ;
    if (sum == cur.val&&cur.left==null&&cur.right==null) {
      list.add(cur.val);
      res.add(new ArrayList<Integer>(list));
      list.remove(list.size()-1);
    }
    else{
    list.add(cur.val);
    dfs(res, list,sum-cur.val, cur.left);
    dfs(res, list, sum-cur.val, cur.right);
    list.remove(list.size()-1);
  }
  } 
}
