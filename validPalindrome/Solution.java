public class Solution{
  public boolean isPalindrome(String s){
    int i=0,j=s.length()-1;
    s = s.toLowerCase();
    while (i<j){
      if (!Character.isAlphabetic(s.charAt(i))&&!Character.isDigit(s.charAt(i))){
        i++;
        continue;
      }
      if(!Character.isAlphabetic(s.charAt(j))&&!Character.isDigit(s.charAt(j))){
        i--;
        continue;
      }
      if (s.charAt(i)==s.charAt(j)) {
      i++;
      j--;
      }
      else return false ;
    }

  return true;
}
}
