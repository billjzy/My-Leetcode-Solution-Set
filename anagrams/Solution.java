import java.util.*;
public class Solution{
   public List<String> anagrams(String[] strs){
      Map<String,List<String>> map = new HashMap<>();
      for (int i=0; i< strs.length;i++){
        String s = strs[i]; 
        char [] temp = s.toCharArray();
        Arrays.sort(temp);
        String sortedS= String.valueOf(temp);
        if (map.containsKey(sortedS)){
           map.get(sortedS).add(s);
        }else {
           List<String> list= new ArrayList<>();
           list.add(s);
           map.put(sortedS,list);
        }
      }
      List<String> result= new ArrayList<>();
      for (List<String> l: map.values()){
        if (l.size()>1){
          result.addAll(l);
        }
      }
      return result;
   }

}
