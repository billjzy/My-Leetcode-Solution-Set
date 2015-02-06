public class Solution {
  public boolean exist(char[][] board, String word) {
    int m = board[0].length;
    int n = board.length;
    for (int i=0;i<n;i++) {
      for(int j =0;j<m;j++) {
        if (dfs(board, i, j, word, 0, new boolean[m][n]))
            return true;
      }
    }
      return false;
  }
  private boolean dfs (char[][] board, int x, int y, String word, int index, boolean[][] visited) {
    if (index == word.length()) return true;
    else if( y<0||x<0||y>=board.length||x>=board[0].length)  return false;
    else if(visited[x][y]) return false;
    else if (board[x][y]!=word.charAt(index)) return false;
    else {
      visited[x][y] = true;
      return dfs(board, x+1, y, word, index+1,visited)||dfs(board,x-1, y, word,index+1, visited)||
                  dfs(board, x, y+1,word, index+1, visited)||dfs(board, x,y-1, word,index+1, visited);
    }
  } 
}

