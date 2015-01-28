import java.util.*;
public class Solution {
  public List<String> restoreIpAddresses(String s) {
    List<String> res = new LinkedList<>();

    dfs(res, s, "", 0);
    return res;
  }
  private void dfs(List<String> res, String s, String temp, int count) {
    if (isValid(s) && count == 3) {
      res.add(temp+s) ;
      return ;
    }
     for (int j = 1;j<4&&j<s.length();j++) {
      String subStr = s.substring(0, j);
      if (isValid(subStr)) {
        dfs(res, s.substring(j),temp+subStr+"."  , count+1);
      }
    }
  }
  

  private boolean isValid(String s) {
    if (s.charAt(0) == '0') 
      return s.equals("0");
    int num =  Integer.parseInt(s);
    return ( num>0 && num<256); 
  }
}
