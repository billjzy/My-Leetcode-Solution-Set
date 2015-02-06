import java.util.*;
public class Solution {
   public void setZereos(int [][] matrix) {
    Set<Integer> rows = new HashSet<>();
    Set<Integer> cols = new HashSet<>();
    for (int i=0;i<matrix.length;i++) {
      for (int j=0;j<matrix[0].length;j++) {
        if (matrix[i][j] == 0) {
          rows.add(i);
          cols.add(j);
        }
      }
    }
    for (int n:rows) {
      for (int i=0;i<matrix[0].length;i++) {
        matrix[n][i] = 0;
      }
    }
    for (int n:cols) {
      for (int i=0;i<matrix.length;i++) {
        matrix[i][n] =0;
      }
    }
   }
}
