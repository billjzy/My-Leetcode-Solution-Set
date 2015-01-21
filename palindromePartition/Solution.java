/*DFS approach,
 * */
import java.util.*;
public class Solution{
  public List<List<String>> partition(String s){
 List<List<String>> result  = new ArrayList<>();
    if (s==null ||s.length()==0) return result;
    dfs(s,0, result , new ArrayList<String>());
    return result;
  }
  //start is the break point for dfs, probe until palindrome is found
  private void dfs(String s,  int start, List<List<String>> res, List<String> list){
    if (start == s.length()){
      res.add(new ArrayList<String>(list));
      return ;
    }
    for (int i=start;i<s.length();i++){
      if(isPalindrome(s,start,i)){
        list.add(s.substring(start,i+1));
        dfs(s, i, res, list);
        list.remove(list.size()-1);
      }
    }
  }
  private boolean isPalindrome(String s,int i,int j){
    while (i<j){
      if (s.charAt(i)!=s.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }

}
