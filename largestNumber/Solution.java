import java.util.*;
/* implements a Comparator interface
 * use Collections.sort
 * s1+s2 <s2+s1?
 */
public class Solution{
  public String largestNumber(int[] num){
    List<Integer> list = new ArrayList<>();
    for (int i :num){
     list.add(i);
    }
   Collections.sort(list, new compareString());
   StringBuilder res = new StringBuilder();
    for (int i = num.length-1;i>=0;i--){
      res.append(list.get(i));
    }
    while (res.length()>1&&res.charAt(0) == '0'){
      res.deleteCharAt(0);
    }
    return res.toString();
  }

  class compareString implements Comparator<Integer>{
    public int compare(Integer n1, Integer n2){
      return (int)(Long.parseLong(n1+""+n2)-Long.parseLong(n2+""+n1));
  } 
}
}
