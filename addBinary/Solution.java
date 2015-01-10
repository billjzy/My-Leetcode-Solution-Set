public class Solution{
  public String addBinary(String a, String b){
    int n = a.length()-1;
    int m = b.length()-1;
    int carry =0 ;
    StringBuilder res = new StringBuilder();
    int sum =0;
    while (Math.min(m,n)>=0){
      sum =carry+ (a.charAt(n)-'0')+(a.charAt(m)-'0');
      carry = sum/2;
      res.insert(0,sum%2);
      n--;
      m--;
    }
    if (m>n) {
      while (m>=0){
       sum = carry + (b.charAt(m)-'0') ;
       carry = sum/2;
       res.insert(0,sum%2);
       m--;
      }
    }
    if (m<n){
      while (n>=0){
       sum = carry + (a.charAt(n)-'0');
       carry = sum/2;
       res.insert(0,sum%2);
       n--;
      }
    }
    if (carry == 1) res.insert(0,1);
    
    return res.toString();
  }
}
