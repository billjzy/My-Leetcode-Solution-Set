public class Solution{
  public int lengthOfLastWord(String s){
    String[] chunk = s.split(" ");
    if (chunk.length ==0) return 0;
    return chunk[chunk.length-1].length();
  }
}
