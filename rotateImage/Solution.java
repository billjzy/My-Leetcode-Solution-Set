public class Solution {
  public void rotate( int [][] matrix) {
    int m = matrix.length;
    int layers = m/2;
    for (int i=0; i<layers;i++) {
      for (int j=i;j<m-i;j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[m-1-i][i];
        matrix[m-1-i][i] = matrix[m-1-i][m-1-i];
        matrix[i][m-1-i] = temp;
      }
    }
  }
}
