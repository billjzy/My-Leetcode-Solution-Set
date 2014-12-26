public class Solution{
  public boolean isInterleave(String s1, String s2, String s3){
    if (s1.length()+s2.length()!=s3.length()) return false;
    
    String minString = s1.length()<=s2.length()? s1:s2;
    String maxString = s1.length()>s2.length()? s1:s2;

    boolean [][] res = new boolean [maxString.length()+1][minString.length()+1];
    res[0][0] = true;
    for (int i=0;i<minString.length();i++){
      res[0][i+1] = res[0][i] && minString.charAt(i)==s3.charAt(i);
    }
    for (int i=0;i<maxString.length();i++){
      res[i+1][0] = res[i][0] && maxString.charAt(i)==s3.charAt(i);
    }
    for (int i=0;i<maxString.length();i++){
      for (int j=0;j<minString.length();j++){
        res[i+1][j+1]=res[i+1][j] && minString.charAt(j)==s3.charAt(i+j+1)||res[i][j+1]&&maxString.charAt(i)==s3.charAt(i+j+1);
      }
    }
    return res[maxString.length()][minString.length()];
  }
}
