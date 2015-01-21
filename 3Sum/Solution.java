/*Sort the array, then apply the two pointers 
 * approach. No hash set for dup check,much faster 
 * .
 * */

import java.util.*;
public class Solution{
  public List<List<Integer>> threeSum(int[] num){
    List<List<Integer>> result = new ArrayList<>();
    if (num.length<3) return result;
    Arrays.sort(num);
    for (int i=0;i<num.length-2;i++){
      if (i==0||num[i]>num[i-1]){
      int   start =i+1;
      int target = -num[i];
      int end=num.length-1;
      while (start<end){
        if (num[start]+num[end] == target) {
           List<Integer> temp = new ArrayList<>();
           temp.add(num[i]);
           temp.add(num[start]);
           temp.add(num[end]);
           start++;
           end--;
           while (start < end && num[start]==num[start-1]) start ++;
           while (start<end && num[end]==num[end+1]) end--;
        }
        else if (num[start]+num[end]>target) end--;
        else start++;
      }
    }
    }
      return result;
    }

  }

