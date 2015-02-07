import java.util.*;

public class Solution{
  public List<List<Integer>> combinationSum(int [] num, int target){
     List<List<Integer>> result = new ArrayList<>();
     if (num.length==0|| num==null) return result;
     Arrays.sort(num);
     dfs(result, new ArrayList<Integer>(), num, 0, target);
     return result;

  } 
  private void dfs(List<List<Integer>> result, List<Integer> list, int [] num, int index, int target){
     if (target==0){
       result.add(new ArrayList<Integer>(list));
       return ;
     }
     if (target<0|| index>=num.length){
       return ;
     }
     
     for (int i=index; i<num.length; i++){
       if (i>0 && num[i]==num[i-1]) continue ;   
       list.add(num[i]);
       dfs(result, list, num , i, target-num[i]);
       list.remove(list.size()-1);
     }

  }
} 
