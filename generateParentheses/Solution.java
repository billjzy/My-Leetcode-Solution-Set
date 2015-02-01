import java.util.*;
public class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> res = new LinkedList<>();
    if(n<=0) return res;

    dfs(res, "",n, 0, 0);
    return res ;
  }

  private void dfs(List<String> res, String s, int n , int left, int right) {
     if (left==n&&right==n) {
       res.add(s);
       return;
     }
     if (left<right) return;
     if ( left<n) { 
     dfs(res, s+"(",n,left+1, right);
     }
     if (right<n){
     dfs(res, s+")",n, left, right+1);
     } 
  }
}
