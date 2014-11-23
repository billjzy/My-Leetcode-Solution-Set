public class Solution{
   public int divide(int dividend, int divisor){
       long m=Math.abs((long)dividend);// convert int to long ,prevent overflow
       long n=Math.abs((long)divisor);  
       
       int ans=0;
       while(m>=n){
         int shift_count=0;
         while ((n<<shift_count)<=m){//m becomes the remainder
           shift_count++;
         }//n*2^shift_count just exceed m
         ans+=1<<(shift_count-1);//cumulate current shift_count to ans
         m-=n<<(shift_count-1);
       }
       return  ((dividend<0)^(divisor<0))? -ans:ans; 
   }
}
