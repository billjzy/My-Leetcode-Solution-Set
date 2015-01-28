public class Solution {
  public String reverseWords(String s) {
    String[] temp = s.split("\\s+");  
    StringBuilder sb = new StringBuilder();
    for (int i= temp.length-1;i>=0;i--) {
      sb.append(temp[i]);
      sb.append(' ');
    }
    sb.deleteCharAt(sb.length()-1);
    return sb.toString();
  }
}
