public class Solution{
  public int [] plusOne(int [] digits){
    if (digits == null|| digits.length ==0) return digits ;

    int carry =1 ;
    int i = digits.length-1; 
    while (i>=0) {
      int sum = carry+digits[i];
      digits [i] = (sum)%10;
      carry = (sum) / 10;
      if (carry==0) return digits;
      i--;
    }
      int [] res = new int [digits.length+1];
      res [0] =1 ;
      return res ;
    }
}

