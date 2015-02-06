public class Solution {
  public boolean searcrhMatrix(int [][] matrix, int target) {
      int width = matrix[0].length;
      int row=-1 ;
      for  (int i=0;i<matrix.length;i++) {
        if (matrix[i][0]<=target&&matrix[i][width-1]>=target) {
          row = i;
          break;
        }
      } 
      for (int i=0;i<width;i++) {
        if (row>=0&&matrix[row][i] == target) return true;
      }
      return false;
  }
}
