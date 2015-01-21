import java.util.Arrays;
public class Solution{
  public int threeSumClosest(int [] num, int target){
    Arrays.sort(num);
    int min_val = Integer.MAX_VALUE;
    int result = 0;
    for (int i=0;i<num.length-2;i++){
      int start = i+1 ;
      int end = num.length-1;
      while(start<end){
        int sum = num[i] + num[start] + num[end];
        int dif = Math.abs(sum-target);
        //if smaller dif is found, update the result as current 3 sum 
        if (dif<min_val){
          result = sum;
          min_val = dif;
        }
        if (sum<target) start++;
        else if (sum>target) end--;
        else return sum;
      }
    }
    return result;
  }
}
