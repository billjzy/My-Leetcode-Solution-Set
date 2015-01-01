public class Solution{ 
  public int atoi(String str){
    if (str.length()==0||str==null) return 0;
    str = str.trim();

    boolean isNeg = false;
    int i=0;
    if (str.charAt(0)=='-') {
      isNeg=true;
      i++;
    }
    if (str.charAt(0)=='+'){
      i++;
    }
    double res = 0;
    while(i<str.length()&&str.charAt(i)<='9'&&str.charAt(i)>='0'){
        res =  res*10+(double)(str.charAt(i)-'0');
        i++;
    }
    res = isNeg? -res:res;
    if (res> (double) Integer.MAX_VALUE) return Integer.MAX_VALUE;
    if (res <(double) Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
    else return (int) res;
}
}
