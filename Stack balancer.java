import java.util.*;
public class Main{
   public static void main(String[] args) {
      Stack<Character> stack = new Stack<>();
      String str = "{[(]}";
      for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
            stack.push(str.charAt(i));
         }
         else if(stack.empty()){
            System.out.println("Stack overflow");
         }
         else if(!stack.empty() && str.charAt(i)==']' && stack.peek()=='['){
            stack.pop();
         }
         else if(!stack.empty() && str.charAt(i)=='}' && stack.peek()=='{'){
            stack.pop();
         }
         else if(!stack.empty() && str.charAt(i)==')' && stack.peek()=='('){
            stack.pop();
         }
      }
      if(!stack.empty()){
         System.out.println("true");
      }
      else{
         System.out.println("false");
      }
   }
}
