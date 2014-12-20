import java.util.*;
// dp solution 
public class Solution{
  public int minCut(String s){
     int n=s.length();
     if (s==null||n==0) return 0;
     boolean [][] isPalindrome = new boolean [n][n];
     for (int i=0;i<n;i++){
       isPalindrome[i][i] = true;//each char is palindrome itself
     }
     //cuts is the min cuts of Substring(i,n)
     int [] cuts = new int [n+1];
     for (int i=0;i<n;i++){
       cuts[i] = n-i;
     }
     
     for (int i=n-1;i>=0;i--){
       for (int j=i;j<n;j++){
         if (((j-i)<2||isPalindrome[i+1][j-1])&&s.charAt(i)==s.charAt(j)){
           isPalindrome[i][j] = true;
           cuts[i] = Math.min(cuts[i], cuts[j+1]+1);
         }
       }
     }
         return cuts[0]-1;
  }
 
}
