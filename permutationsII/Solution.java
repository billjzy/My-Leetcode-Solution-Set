/*same as permutations,
 * but with duplicate elements
 * sort first, then DFS
 */
import java.util.*;
public class Solution{
  public ArrayList<ArrayList<Integer>> permuteUnique(int [] num){
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); 
    if (num==null && num.length==0) return res;
    Arrays.sort(num);
    boolean [] visited = new boolean [num.length];

    dfs(num, res, new ArrayList<Integer> (),visited);
    return res;
  }
  private void dfs(int [] num ,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, boolean[] visited ){
   if (list.size()==num.length){
      res.add(new ArrayList<Integer>(list));
      return ;
   }
   for (int i=0; i<num.length; i++){
      if (!visited[i]){
        visited[i]=true;
        list.add(num[i]);
        dfs(num,res, list, visited);
        list.remove(list.size()-1);
        visited[i]=false;
        while (i<num.length-1 && num[i+1] == num[i]){
          i++;
        }
      }
    
   }
  }
}
