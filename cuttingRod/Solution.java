/* The classic DP problem cutting rod i
 * collected int "Introduction to Algorithm"
 * */
public class Solution{
   public int maxRevenue(int [] p, int n){
      int [] r = new int [n+1];
      r[0] = 0;
      for (int i = 1; i<=n;i++) {
         int q =0;
         for (int j=1; j<=i;j++) {
           q = Math.max(q, p[j]+r[i-j]);
         }
         r[i] = q;
      }
      return r[n];
   }

   public static void main(String[] args){
     int [] p ={0,1,3,2,4,5};
     Solution s = new Solution();
     System.out.print(s.maxRevenue(p, 3));
   
   }
}
