/*DFS approach,
 * */
import java.util.*;
public class Solution{
  public ArrayList<ArrayList<String>> partition(String s){
   ArrayList<ArrayList<String>> result  = new ArrayList<ArrayList<String>>();
    if (s==null ||s.length()==0) return result;
    dfs(s,0, result , new ArrayList<String>());
    return result;
  }
  //start is the break point for dfs, probe until palindrome is found
  private void dfs(String s,  int start, ArrayList<ArrayList<String>> res, ArrayList<String> list){
    if (start == s.length()){
      res.add(new ArrayList<String>(list));
      return ;
    }
    for (int i=start+1;i<=s.length();i++){
      String sub = s.substring(start, i);
      if(isPalindrome(sub)){
        list.add(sub);
        dfs(s, i, res, list);
        list.remove(list.size()-1);
      }
    }
  }
  private boolean isPalindrome(String s){
    int i=0,j=s.length()-1;
    while (i<j){
      if (s.charAt(i)!=s.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }

}
