/* Given two integers n and k, return all possible combinations of k numbers out
 * of 1 - n 
 *
 *Depth First Search
 *
 *
 */
import java.util.*;
public class Solution{
  public ArrayList<ArrayList<Integer>> combine(int n, int k){
    ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
    if (k>=n|| n<0||k<0) return null;
    for (int j=1;j<=n-k+1;j++){
    dfs(result, new ArrayList<Integer>(), j , k, n);
    }
    return result; 
  }
  public void dfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int start, int k, int n){
    list.add(start); 
    if (list.size()==k) {
        result.add(new ArrayList<Integer>(list));
        return ;
     } 
    for (int i=start+1; i<=n ; i++){
     dfs(result, list, i, k, n);
     list.remove(list.size()-1);
  }
}
}
