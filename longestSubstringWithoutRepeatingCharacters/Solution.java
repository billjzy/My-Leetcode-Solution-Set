public class Solution {
  public int lengthOfLongestSubstring(String s) {
    //use boolean array to track appreance of char
    boolean [] dups = new boolean[256];
    int j = 0;
    int result = 0;
    for (int i=0;i<s.length();i++) {
       char c = s.charAt(i);
       if (dups[c]) {
         result = Math.max(result, i-j);
         for (int k=j;k<i;k++){
            if (s.charAt(k) ==c) {
              j = k+1;
              break;
            }
            dups[s.charAt(k)] = false;
         }
       }
       else {
         dups[c] = true;
       }
      }
    result = Math.max(s.length()-j, result);
    return result;
    }
}
