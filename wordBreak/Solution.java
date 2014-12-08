/*dp problem
 * iterate the dict
 */

import java.util.*;
public class Solution{
  public boolean wordBreak(String s, Set<String> dict){
    boolean [] breakAt = new boolean [1+s.length()];
    breakAt[0]=true;

    // scan through the array, mark BreakPoint,
    // dynamically catch the new BreakPoint as scaner runs
    for (int i=0;i<s.length();i++){
       if (breakAt[i]){ 
        for (String temp:dict ){
          int end =i + temp.length();
          //check end first , avoid unneccessary substring
          if (end <= s.length() && temp.equals(s.substring(i, end))){
           breakAt[end]=true;
          } 

          }
        }
      }
    return breakAt[s.length()];
    }
  

} 
