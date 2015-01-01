import java.util.Stack;
public class Solution{
  public int reverse(int x){
    if (x == Integer.MAX_VALUE|| x==Integer.MIN_VALUE) return 0;
    int absolute = Math.abs(x);
    Stack<Integer> bits = new Stack<>();
    while (absolute>=10) {
      bits.push(absolute%10);
      absolute/=10;
    }
    bits.push(absolute);
    int ans = 0;
    int i=0;
    while(!bits.isEmpty())
      ans+=(bits.pop()*Math.pow(10,i++));
    if (ans==Integer.MAX_VALUE) return 0;
    return x<0? -ans:ans;
  }
}
