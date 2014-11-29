/*Determine if a Sudoku is valid
 only check the initial board, 
 use hash set approach, three iterations*/
import java.util.*;
public class Solution {
   public boolean isValidSudoku(char[][] board){
     //rule1 ,column exclude dup
     for (int i=0;i<board[0].length;i++){
       HashSet<Character> temp = new HashSet<Character>();
       for (int j=0;j<board.length;j++){
          if (!temp.add(board[j][i])&&board[i][j]!='.')//the number is not unique in col
            return false ;                             //the number is added to temp in
          }                // if condition
          }

       
     
      //rule2, row ecxlude dup
     for  (int i=0;i<board.length; i++){
       HashSet<Character> temp = new HashSet<Character>();
       for (int j=0;j<board[0].length;j++){
          if (!temp.add(board[i][j])&& board[i][j]!='.'){
            return false ;
          }
       }
     }

     for (int i=0;i<3;i++){
      for (int j=0;j<3;j++){//for each sub-box
         HashSet<Character> temp = new HashSet<Character>();
         for (int m=3*i; m<3*i+3; m++){//row 
           for (int n=3*j; n<3*j+3 ; n++){
            if (board[m][n]!='.' && !temp.add(board[m][n])) return false ;
           }
         }
      }
     }
     return true;
   }
}
 

