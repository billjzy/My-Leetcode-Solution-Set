public class Solution{
  public int minPathSum(int [][] grid){
    int n=grid[0].length;
    int m = grid.length;
    int [] dp = new int [n];
    dp[0] = grid[0][0] ;
    for (int i=1;i<n;i++){
      dp[i] = grid[0][i]+dp[i-1];
    }

    for (int i=1;i<m;i++){
      dp [0]+= grid[i][0];
      for (int j=1;j<n;j++){
       dp [j] = Math.min(dp[j-1],dp[j])+grid[i][j];
    }
  }
  return dp[n-1];
}
}
