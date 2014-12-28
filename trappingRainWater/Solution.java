/* dp approach, 
 * for each bar, calculate 
 * left max and right max,
 * then get max(left_max, right_max)
 * */
public class Solution{
  public int trap(int [] A){
    if (A.length==0 || A==null){
       return 0;
    }
    int  max = 0;
    int res = 0;
    int [] dp = new int[A.length];
    for (int i=0;i<A.length;i++){
      dp[i] = Math.max(dp[i],max);
    }
    max = 0;
    for (int i=A.length-1;i>=0;i--){
      dp [i] = Math.min(dp[i], max); 
      max = Math.max(max, A[i]);
      res += dp[i] - A[i]>0? dp[i] - A[i]:0;
    }
    return res ;
  }
}
