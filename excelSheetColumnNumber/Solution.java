public class Solution{
  public int titleToNumber(String s){
    int i=s.length()-1;
    int res =0;
    int d =1;
    while(i>=0){
      res += (s.charAt(i)-'A'+1)*d;
      d*=26;
      i--;
    }
    return res;
  }
}
