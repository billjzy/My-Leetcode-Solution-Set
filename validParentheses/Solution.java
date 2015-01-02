import java.util.Stack;
public class Solution{
  public boolean isValid(String s){
      Stack<Character> stack = new Stack<>();
      for (int i=0;i<s.length();i++){
          char temp = s.charAt(i);
          switch (temp){
              case '(' :
                  stack.push(temp);
                  break;
              case '[' :
                  stack.push(temp);
                  break;
              case '{' :
                  stack.push(temp);
                  break;
              case ')' :
                  if (!stack.isEmpty()&&stack.pop()=='(') break;
                  else return false ;
              case ']' :
                  if (!stack.isEmpty()&&stack.pop()=='[') break;
                  else return false;
              case '}' :
                  if (!stack.isEmpty()&&stack.pop()=='{') break;
                  else return false;
              default :
                  break;
          }
      }
      return stack.isEmpty();
  }  
}
