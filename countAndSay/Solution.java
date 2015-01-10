public class Solution{
  public String countAndSay(int n){
     if (n<=0) { return "" ;}
     String current = "1" ;
     if (n == 1) return "1";
     for (int i=1;i<n;i++){
       StringBuilder temp = new StringBuilder();
       int count = 1;
       for (int j=0;j<current.length()-1;j++){
         if (current.charAt(j)!=current.charAt(j+1)){
           temp.append(count);
           temp.append(current.charAt(j));
           count = 1;
         } 
         else {
           count++;
         }
       }
       temp.append(count);
       temp.append(current.charAt(current.length()-1));
       current = temp.toString();
     }
     return current;
  }
}
