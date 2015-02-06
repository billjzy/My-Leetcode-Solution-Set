import java.util.*;
public class Solution {
  public List<List<Integer>> subsetsWithDup(int [] num) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(num);
    List<Integer> list = new ArrayList<>();
    dfs(res, list, num, 0);
    return res;
  }
  private void dfs(List<List<Integer>> res, List<Integer> list,  int [] num, int start) {
    //this prolem has no if statement in recursion, res.add as long as recursiv
    //exists
    res.add(new ArrayList<>(list));
    for (int i= start;i<num.length;i++) {
      list.add(num[i]);
      dfs( res, list, num, start+1);
      list.remove(list.size()-1);
      while(i<num.length && num[i]==num[i+1]) {
        i++;
      }
    }
  }
}
