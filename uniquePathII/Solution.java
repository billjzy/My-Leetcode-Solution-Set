/* dp
 maintain a 2D array
 initialize first line and 
 first row
 */

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int [][]res = new int [m][n];
        //initialize first row, when 1 occurs, rest set to 0
        for (int i=0;i<n;i++){
            if (obstacleGrid[0][i]==1){
                for( int j=i; j<n ;j++){
                    res[0][i]= 0 ;
                }
                break;
            }
            else {
                res[0][i]=1;
            }
        }
        //initialize first column, when 1 occurs, rest set to 0
        for (int i=0;i<m;i++){
            if (obstacleGrid[i][0]==1){
                for( int j=i; j<n ;j++){
                    res[i][0]= 0 ;
                }
                break;
            }
            else {
                res[i][0]=1;
            }
        }
        // DP, Add top value and left value in the grid
        for (int i=1; i<m ; i++){
            for (int j=1;j<n;j++){
                if (obstacleGrid[i][j] == 1){
                    res[i][j]=0;
                }
                else {
                    res[i][j]=res[i-1][j]+res[i][j-1];
                }
            }
        }
        return res[m-1][n-1];
        
    }
}