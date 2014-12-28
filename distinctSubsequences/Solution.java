public class Solution{
  public int numDistinct(String S, String T){
    if (S==null || T == null) return 0;
    if (S.length()<T.length()) return 0;

    int [][] res = new int[S.length()+1][T.length()+1];
     res [0][0] = 1;
    for (int i=1;i<=S.length();i++){
      res [i][0] =1;
    }

    for (int i=1;i<=S.length();i++){
      for(int j=1;j<=T.length();j++){
        res[i][j]= (S.charAt(i-1)==T.charAt(j-1)?res[i-1][j-1]:0)+res[i-1][j]; 
      }
    }
    return res[S.length()][T.length()];
  }
}
