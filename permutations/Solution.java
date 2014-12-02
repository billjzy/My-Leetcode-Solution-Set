import java.util.*;
public class Solution{
  public ArrayList<ArrayList<Integer>> permute(int [] num){
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      permute(num, 0, result);
      return result;
  }
  //recursively call permute(), swap index a is fixed value start, index b move
  //from start to last number in array
  private void permute(int [] num, int start, ArrayList<ArrayList<Integer>> result){
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
  private ArrayList<Integer> convert(int [] num){
    ArrayList<Integer> ans = new ArrayList<Integer>(); 
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
