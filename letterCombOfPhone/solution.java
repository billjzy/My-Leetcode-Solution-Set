/*
 * A dfs typical problem,
 * use StringBuilder void operating on Strings
 * Should use linkedList, add elements more efficiently!
*/
import java.util.*;
public class solution{
   public List<String> letterCombination(String digits){
      String [] dict={"","", "abc","def","ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
      List<String> res = new LinkedList<>();
      dfs(res, dict, digits, new StringBuilder(), 0);
      return res;
   }
   private void dfs(List<String> res,String[] dict, String digits , StringBuilder temp, int len){
     if (len==digits.length()) {
       res.add(temp.toString());
       return ;
     } 
     else{
     for (int i=0;i<dict[digits.charAt(len)-'0'].length();i++){
      temp.append(dict[digits.charAt(len)-'0'].charAt(i));
      dfs(res, dict, digits, temp, len+1);
      temp.deleteCharAt(temp.length()-1);
     }
   }
   }
}
