import java.util.*;

public class Solution{
  public ArrayList<ArrayList<Integer>> combinationSum(int [] num, int target){
     ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     if (num.length==0|| num==null) return result;
     Arrays.sort(num);
     dfs(result, new ArrayList<Integer>(), num, 0, target);
     return result;

  } 
  private void dfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int [] num, int index, int target){
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
