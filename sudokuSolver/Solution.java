public class Solution{
  public static char [][] ans=new char [9][9];
  public void solveSudoku(char [][] board){
      dfs(board);
      board=ans;
  }
  public void dfs(char [][] board){
    for (int i=1 ; i<=9;i++){
        
       for (int m=0;m<board.length;m++)
           for (int n=0;n<board[0].length;n++)
           { 
             if (board[m][n]=='.'){
               board[m][n]=(char) (i+'0');
               if (isValid(board))
               dfs(board);
               board[m][n]='.';
             } 
             
             if (board[m][n]!='.'&&m==board.length&&n==board[0].length){
               for (int a=1;a<=9;a++){
                 for (int b=1;b<=9;b++){
                   ans[a][b] = board[a][b];
                 }
               }
             }
             
           }
  }

  public boolean isValid(char [][] board){
     for (int i=0; i < board[0].length; i++){
        HashSet<Character> test = new HashSet<Character>();
        for (int j=0;j<board.length;j++){
        if (board[j][i]!='.'&&!test.add(board[j][i]) return false ;
        }
     }

     for (int i=0; i<board.length;i++){
        HashSet<Character> test = new HashSet<Character>();
        for (int j=0;j<board[0].length;j++){
         if (board[i][j] !='.' && !test.add(board[i][j])) return false;
        }
     }

     for (int i=0;i<3;i++){
       for (int j=0;j<3;j++){
       HashSet<Character> test = new HashSet<Character>();
       for (int m= 3*i ;m <3*i+3; m++){
         for (int n = 3*j;n<3*j+3;n++ ){
           if (board[m][n]!='.'&&!test.add(board[m][n])
             return false;
       }    
       }
     }
  }
  return true;
  }
}
