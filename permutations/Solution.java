import java.util.*;
public class Solution{
  public List<List<Integer>> permute(int [] num){
      List<List<Integer>> result = new ArrayList<>();
      permute(num, 0, result);
      return result;
  }
  //recursively call permute(), swap index a is fixed value start, index b move
  //from start to last number in array
  private void permute(int [] num, int start, List<List<Integer>> result){
      if(start>=num.length){
         result.add(convert(num));
         return ;
      }
      for (int i=start;i<num.length;i++){
         swap(num,start,i);
         permute(num, start+1, result);
         swap(num,start, i);
      }
  
  }
  //convert Array to ArrayList
  private List<Integer> convert(int [] num){
    List<Integer> ans = new ArrayList<>(); 
    for (int n:num){
       ans.add(n);
     }
    return ans;
  }

  private void swap(int [] num, int i,int j){
    int temp=num[i];
    num[i]=num[j];
    num[j]=temp;
  }
}
