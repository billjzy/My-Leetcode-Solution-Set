public class Solution {
  public String longestPalindrome(String s) {
     String longest = s.substring(0, 1);
     for (int i=0;i<s.length();i++) {
       if (helper(s, i, i).length()>longest.length()) {
         longest = helper(s,i ,i );
       }
       if (helper(s, i, i+1).length()>longest.length()) {
         longest = helper(s, i, i);
       }
     }
     return longest;
  }
  public String helper(String s, int start ,int end) {
    while (start >=0 &&end<s.length()){
      if (s.charAt(start)==s.charAt(end)) {
        start--;
        end++;
      }
      else break;
    }
    return s.substring(start+1, end);
  } 
}
