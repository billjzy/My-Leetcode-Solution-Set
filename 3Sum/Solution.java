/*Sort the array, then apply the two pointers 
 * approach. Using a HashSet to filter the 
 * unique result.
 * */

import java.util.*;
public class Solution{
  public List<List<Integer>> threeSum(int[] num){
    List<List<Integer>> result = new ArrayList<>();
    if (num.length<3) return result;
    HashSet<ArrayList<Integer>> set = new HashSet<>();
    Arrays.sort(num);
    for (int i=0;i<num.length-2;i++){
      int   j=i+1;
      int target = -num[i];
      int k=num.length-1;
      while (j<k){
        if (num[j]+num[k] == target) {
           ArrayList<Integer> temp = new ArrayList<Integer>();
           temp.add(num[i]);
           temp.add(num[j]);
           temp.add(num[k]);
           if (set.add(temp)) result.add(temp);
           j++;
           k--;
        }
        else if (num[j]+num[k]>target) k--;
        else j++;
      }
    }
      return result;
    }

  }

