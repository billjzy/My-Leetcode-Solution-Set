import java.util.*;
public class solution{
   public static int evalRPN(String [] tokens){
      if (tokens.length==0) return 0;
      Stack<Integer> token=new Stack<Integer>();// token store the int
      for (int i=0;i<tokens.length;i++){
         String temp=tokens[i];
         if (!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/")){
            token.push(Integer.parseInt(temp));
         }
         
         else if (!token.isEmpty()){//make sure Stack is not empty
            if (temp=="+") {// deal with each operand 
              int a=token.pop();
              int b=token.pop();
              token.push(a+b);
            }   
            if (temp=="-"){
              int b=token.pop();
              int a=token.pop();
              token.push(a-b);
            }
            if (temp=="*"){
              int a=token.pop();
              int b=token.pop();
              token.push(a*b);
            }
            if (temp=="/"){
              int b=token.pop();
              int a=token.pop();
              token.push(a/b);
            }//end with operands
         }
         
      }
     int result=token.pop();
     return result;
   }
} 
   



