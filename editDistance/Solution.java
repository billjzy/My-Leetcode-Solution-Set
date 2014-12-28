/* very tough dp problem, 
 * space complexity On^2,which 
 * can be improved
*/
 
public class Solution{
  public int minDstance(String word1, String word2){
    if (word1.length()==0) return word2.length();
    if (word2.length()==0) return word1.length();
    String minWord = word1.length()<word2.length()? word1:word2;
    String maxWord = word1.length()>word2.length()? word1:word2;
    
    int m = minWord.length();
    int n = maxWord.length();

    int [][] res = new int [n+1][m+1];

    for (int i=0;i<=m;i++){
      res[0][i] = i;
    }
    for (int i=0;i<=n;i++){
      res[i][0] = i;
    }
    
    for (int i=0;i<n;i++){
      for (int j=0;j<m;j++){
        if (word1.charAt(i)==word2.charAt(j)) res[i+1][j+1] = res[i][j];
        else {
           res[i+1][j+1] = Math.min(res[i][j+1],Math.min(res[i+1][j],res[i][j]))+1;
        }
      }
    }
   return res[n][m];
      
    
  } 
 
}
