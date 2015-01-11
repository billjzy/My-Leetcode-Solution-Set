import java.util.*;
public class Solution_2{
  public boolean isValidSudoku(char [][] board){
      for (int i=0;i<9;i++){
    Set<Character> cols = new HashSet<>();
    Set<Character> rows = new HashSet<>();
      for (int j=0;j<9;j++){
        if (board[i][j]!='.'&&!rows.add(board[i][j])) return false;
        if (board[j][i]!='.'&&!cols.add(board[j][i])) return false;
        
      }
    }
        
    for (int i=0;i<3;i++){
      for (int j=0;j<3;j++){
       Set<Character> box = new HashSet<>();
       for (int m=i*3;m<i*3+3;m++){
         for (int n=j*3;n<j*3+3;n++){
           if (board[m][n]!='.'&&!box.add(board[m][n])) return false;
         }
       }
      }
    }
    return true;
    
  }

}
