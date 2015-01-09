import java.util.HashMap;
public class Solution {
  public int majorityElement( int[] num ){
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n: num){
      if (!map.containsKey(n)){
        map.put(n,1);
      }
      else {
        int cur = map.get(n);
        map.remove(n);
        map.put(n, cur+1);
      }
    }
    for (int n:map.keySet()){
      if (map.get(n)>(num.length>>1)) return n;
    }
    return 0;
  }  
}
