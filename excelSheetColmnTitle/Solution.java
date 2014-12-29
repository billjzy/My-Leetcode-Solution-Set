public class Solution{
  public String convertToTitle(int n){
    StringBuffer sb = new StringBuffer ();
    while(n>0){
      int reminder = n%26;
      n/=26;
      if(reminder==0) {
        sb.insert(0,'Z');
        n--;
      }
      else{
        sb.insert(0,(char)('A'+reminder -1));
      }
    }
      return sb.toString();
    }
  
}
