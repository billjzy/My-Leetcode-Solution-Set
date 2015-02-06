public class Solution {
  public int maxSubArray(int [] A) {
    int [] sum = new int [A.length];
    int max = A[0];
    sum[0] = A[0];
    for (int i=1;i<A.length;i++) {
      sum[i] = Math.max(sum[i-1]+A[i], A[i]);
      max = Math.max(sum[i], max);
    }
    return max ;
  } 
}
