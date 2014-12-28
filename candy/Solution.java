/* Two pointer algorithm, 
 * keep track of max value
 * */

public class Solution{
  public int candy(int [] ratings){
    if (ratings.length==0||ratings==null) return 0;    
    int [] num = new int [ratings.length];
    int [] numR = new int [ratings.length];
    num[0] = 1;
    //scan the ratings from head to tail, starting from 1
    for (int i=1;i<ratings.length;i++){
      if (ratings[i]>ratings[i-1]) {
        num[i] = num[i-1] + 1 ;
      }
      else{
        num[i] = 1;
      }
    }
    numR[ratings.length-1] =1;
    int res = 0;
    //scan the ratings reversely , starting from 1
    for (int i =ratings.length-2;i>=0;i--){
      if (ratings[i]>ratings[i-1]){
        numR[i] = numR[i+1] +1 ;
      }
      else {
        numR [i] =1;
      }
    }
    for (int i=0;i<ratings.length;i++){
       res += Math.max(num[i], numR[i]);
    }
    return res;
  }
}
