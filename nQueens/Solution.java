/*Class NP question , 
 * combined with the classic
 * dfs & recursive approach
 */
import java.util.*;
public class Solution{
     public List<String[]> solveNQueens(int n){
        List<String[]> res = new ArrayList<>();
        dfs(res,new int[n], n, 0);
        return res;
     }
     //recursively choose a Q in next row, from column first to last
     private void dfs(List<String[]> res, int [] qColNum, int n, int i_row){
         if (i_row == n){
          String [] temp = new String[n] ;
           for (int i=0; i<n;i++){
             StringBuilder sb= new StringBuilder();
             for (int j=0;j<n;j++){
                if (j==qColNum[i]) 
                  sb.append('Q');
                else sb.append('.');
             }
          
           temp[i] = sb.toString();
           }
           res.add(temp);
           return ;
         }
         //store the Q of current row and move to next row
         for (int i=0;i<n;i++){
          qColNum[i_row] = i ;
          if (check(i_row,qColNum)){
             dfs(res, qColNum, n, i_row+1);
          }
         }
     }
     //check if  the current Q on the board is valid 
     private boolean check (int row, int [] qColNum){
        for (int i=0;i<row;i++){
          if (qColNum[i]==qColNum[row]|| Math.abs(qColNum[row]-qColNum[i])==Math.abs(row-i))
            return false;
        }
        return true;
     }
}
