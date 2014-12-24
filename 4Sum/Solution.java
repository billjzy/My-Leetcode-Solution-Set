/* Apply depth-2 nested for loop
 * combine with two pointer approach
 * */

import java.util.*; 
public class Solution{
  public List<List<Integer>> fourSum(int [] num , int target){
    List<List<Integer>> result = new ArrayList<>();
    if (num.length<4) return result;
    Arrays.sort(num);
    HashSet<ArrayList<Integer>> set = new HashSet<>();
    for (int i= 0;i<num.length-3;i++){
      for (int j=i+1;j<num.length-2;j++){
        int n=j+1,m=num.length-1;
        int sum =num[i] + num[j] + num[n]+num[m];
        while (n<m){
          if (sum==target) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(num[i]);
            temp.add(num[j]);
            temp.add(num[n]);
            temp.add(num[m]);
            if (set.add(temp))
              result.add(temp);
            n++;
            m--;
          }
          else if (sum <target){
             n++;
          }
          else m++;
        }

      }
    }
    return result;
  }
}
