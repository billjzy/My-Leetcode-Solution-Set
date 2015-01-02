import java.util.*;
public class Solution{
  public List<Integer> getRow(int rowIndex){
    List<Integer> cur = new ArrayList<>();
    cur.add(1);
    for (int i=1;i<=rowIndex;i++){
      List<Integer> prev = cur ;
      cur= new ArrayList<>();
      cur.add(1);
      for (int j=1;j<i;j++){
        cur.add(prev.get(j-1)+prev.get(j));
      }
      cur.add(1);
    }
    return cur;

  }
}
