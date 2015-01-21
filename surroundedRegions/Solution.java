import java.util.LinkedList;
/*This is BFS problem
 * I use two linkedlists to store (r,c)
 * probe four directions at a give position
 * find all the "O" on four sides of board
*/
public class Solution{
  int row , col;
  public void solve(char[][] board){
    if (board==null||board.length<=1||board[0].length<=1) return ;
    row = board.length; 
    col = board[0].length;
    for (int i=0;i<row;i++){
      if (board[i][0]=='O') probe(board,i, 0);
      if (board[i][col-1] == 'O') probe(board, i, col-1);
    }
    for (int i=0;i<col;i++){
      if (board[0][i]=='O') probe(board,0,i);
      if (board[row-1][i]=='O') probe(board,row-1,i);
    }
    for (int i=0;i<row;i++){
      for (int j=1;j<col;j++){
        if (board[i][j]=='O') board[i][j] = 'X';
        if (board[i][j]=='.') board[i][j] ='O';
      }
    }
  }
  private void probe(char[][] board, int i, int j){
   LinkedList<Integer> x_vals = new LinkedList<>();
   LinkedList<Integer> y_vals = new LinkedList<>();
    x_vals.add(i);
    y_vals.add(j);
    while(!x_vals.isEmpty()){
    int x= x_vals.pollFirst();
    int y = y_vals.pollFirst();
    if (x-1>=0&&board[x-1][y]=='O'){
      board[x-1][y] = '.';
      x_vals.add(x-1);
      y_vals.add(y);
    }
    if (x+1<row&&board[x+1][y]=='O'){
      board[x+1][y] = '.';
      x_vals.add(x+1);
      y_vals.add(y);
    }
    if (y-1>=0&&board[x][y-1]=='O'){
      board[x][y-1] = '.';
      x_vals.add(x);
      y_vals.add(y-1);
    }
    if (y+1<col&&board[x][y+1]=='O'){
      board[x][y+1] = '.';
      x_vals.add(x);
      y_vals.add(y+1);
    }
    
    }
    }
  }
  

