import java.util.*;
public class Solution{
  public int ladderLength(String start, String end, Set<String> dict){
     LinkedList<String> distString = new LinkedList<>();
     LinkedList<Integer> dist = new LinkedList<>();

     distString.add(start);
     dist.add(1);

     while(!distString.isEmpty()){
       String s = distString.remove();
       int k = dist.remove();
       if (s.equals(end)) return k;
       for (int i=0;i<s.length();i++){
         char [] temp =s.toCharArray();
        for(char c='a';c<='z';c++){
         temp[i] = c;
         String newWord = temp.toString();
         if (dict.contains(newWord)) {
           distString.add(temp.toString());
           dist.add(k+1);
           dict.remove(newWord);
         }
        }
       }
    }
    return 0;
  }
}
