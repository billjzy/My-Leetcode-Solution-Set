/*
 * Find all the increasing interval of prices, 
 * sum up all the increments
* */
public class solution{
   public int maxProfit(int [] prices){
     if(prices.length<=1) return 0;
     int res = 0, start = 0;
     for (int i=1;i<prices.length;i++){
       res += prices[i]<prices[i-1]? 0:prices[i]-prices[i-1];
     }
     return res;
   }
}
