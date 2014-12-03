/*
 * Find all the increasing interval of prices, 
 * sum up all the increments
* */
public class solution{
   public int maxProfit(int [] prices){
     if (prices.length==1||prices.length==0) return 0;
     int maxP=0;
     int start=0;
     int cur=1;
     while (cur<prices.length){
        while (cur<prices.length&& prices[cur]>=prices[cur-1]){
              cur++;       
         }
        if (cur<=prices.length){
          maxP+=prices[cur]-prices[start];
          if (cur==prices.length) break;
          start=cur;
          cur=start+1;
        }
     }
     return maxP;
   }
}
