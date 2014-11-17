public class solution{
  public String countAndSay(int n){
    if (n<=0){
      return "";
    }
    String current="1";
    int start=1;

    while (start<n){//from string 1 to string n
       StringBuilder temp=new StringBuilder();
       int count=1;
       for (int i=1;i<current.length();i++){//scan from the beginning of stringN
           if (current.charAt(i)==current.charAt(i-1)) {
             count++;
           }
           else {
             temp.append(count);//add count 
             temp.append(current.charAt(i-1));//add number
             count=1;//reset count to 1
           }
       }//if last serveral consective chars are same
       temp.append(count);
       temp.append(current.charAt(current.length()-1));
       current=new String(temp);
       start++;
    }
    return current;
  }
}
