/*
 * A dfs typical problem,
 * use StringBuilder void operating on Strings
*/
import java.util.*;
public class solution{
   public ArrayList<String> letterCombination(String digits){
      String [] dict={"","", "abc","def","ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
      ArrayList<String> ret = new ArrayList<String>();
      dfs(dict, ret, 0, new StringBuilder (), digits);
      return ret;
   }
   private void dfs(String [] dict, ArrayList<String> ret, int count,StringBuilder temp,String digits ){
      if (count == digits.length()){
        ret.add(temp.toString());
        return ;
      }
      else {
           for (int i=0; i<dict[digits.charAt(count)-'0'].length();i++){
              temp.append(dict[digits.charAt(count)-'0'].charAt(i));
              dfs(dict,ret,count+1,temp, digits);
              temp.deleteCharAt(temp.length()-1);
           }
      }
   }

}
