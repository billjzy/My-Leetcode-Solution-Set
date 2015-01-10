/* Given two integers n and k, return all possible combinations of k numbers out
 * of 1 - n 
 *
 *Depth First Search
 *
 *
 */
import java.util.*;
public class Solution{
  public List<List<Integer>> combine(int n, int k){
    List<List<Integer>> result= new ArrayList<>();
    if (k==0||n==0) return result;
    for (int i=1;i<=n-k+1;i++){
      dfs(result, new ArrayList<Integer>(), i, k, n);
    }
    return result;
  }

  private void dfs(List<List<Integer>> result, ArrayList<Integer> list, int start,int k, int n){
      list.add(start);
      if (list.size() == k) {
        result.add(new ArrayList<Integer>(list));
      } 
      for (int j=start+1;j<=n;j++){
        dfs(result,list, j, k,n);
      }
      list.remove(list.size()-1);
    }
}

