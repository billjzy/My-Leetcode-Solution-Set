/*dp problem;
 * add top and left values
 */
import java.util.Arrays;

public class Solution{
  public int uniquePath(int m, int n){
    int [] temp = new int [n];
    Arrays.fill(temp,1);

    for (int i=1; i<m ; i++){
      for (int j=1 ; j<n ; j++){
        temp[i]+=temp[i-1];
      }
    }
   return temp[n-1];
  }
}
