import java.util.LinkedList;
/*This is BFS problem
 * I use two linkedlists to store (r,c)
 * probe four directions at a give position
 * find all the "O" on four sides of board
*/
public class Solution{
  static int row,col;
  public void solve(char[][] board){
    if (board ==null || board.length<=1 || board[0].length<=1)
      return ;
    row = board.length;
    col = board[0].length;

    for (int i=0; i<col ;i++){
      if (board[0][i]=='O')
         probe(board, 0 ,i);
      if (board[row-1][i] == 'O')
        probe(board, row-1 ,i);
    }

    for (int j=0 ;j< row; j++){
      if (board[j][0] == 'O')
         probe(board, j ,0);
      if (board[j][col-1] == 'O')
         probe(board, j , col-1);
    }

    for (int i=0;i<row;i++){
      for (int j =0; j<col ; j++){
        if (board[i][j] == 'O' )
          board[i][j] = 'X';
        if (board[i][j] == '#')
          board[i][j] ='O';
      }
    }
  }

  private void probe(char [][] board, int r, int c){
    board[r][c] = '#';
    LinkedList<Integer> rowNumber = new LinkedList<Integer>();
    LinkedList<Integer> colNumber = new LinkedList<Integer>();

    rowNumber.add(r);
    colNumber.add(c);
    while(!rowNumber.isEmpty()&&!colNumber.isEmpty()){
      int x=rowNumber.pollFirst();
      int y=colNumber.pollFirst();
      if (x-1>=0&&board[x-1][y]!='#'&&board[x-1][y] == 'O')
      {
        board[x-1][y]='#';
        rowNumber.add(x-1);
        colNumber.add(y);
      }
      if (x+1<row&&board[x+1][y]!='#'&&board[x+1][y] == 'O')
      {
        board[x+1][y]='#';
        rowNumber.add(x+1);
        colNumber.add(y);
      }
      if (y-1>=0&&board[x][y-1]!='#'&&board[x][y-1] == 'O')
      {
        board[x][y-1]='#';
        rowNumber.add(x);
        colNumber.add(y-1);
      }
      if (y+1<col&&board[x][y+1]!='#'&&board[x][y+1] == 'O')
      {
        board[x][y+1]='#';
        rowNumber.add(x);
        colNumber.add(y+1);
      }
    }
  
  }

}
