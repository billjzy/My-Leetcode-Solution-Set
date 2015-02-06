/*Scan the array once ,
* dp approach, use max to keep the previous value 
*/ 

public class Solution{
   public boolean canJump(int []A){
  
   int max=0;
     for (int i=0; i<=max&&i<A.length;i++){
        max = Math.max(A[i]+i, max);
        }
     if (max<A.length-1) return false;
     else return true;
   }
}
