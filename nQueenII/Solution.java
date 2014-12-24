/* Same as the NQueens Problem,
 * even simpler.
 * Also apply the dfs approach*/

public class Solution{
  public int result = 0;
   public int totalNQueens(int n){
     if (n<=0) return 0;
     dfs(new int[n], 0, n);
     return result;  
   }

   //dfs at row == row
   private void dfs(int [] atCol, int row, int n){
     if ( row == n ) {
       result ++;
       return ;
     }
     for (int i=0;i<n;i++){
       atCol[row] = i;
       if (isValid(row, atCol)) {
         dfs(atCol, row+1, n);
       }
     }
   }
   // check to see if "row"th row is valid
   private boolean isValid(int row, int [] atCol){
     for (int i=0;i< row ;i++){
       if (atCol[i] == atCol[row] || Math.abs(atCol[i]-atCol[row])==Math.abs(i-row))
         return false;
     }
     return true;
   }
}
