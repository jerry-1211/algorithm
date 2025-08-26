import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = br.readLine();
            
            if(".".equals(input)){
                break;
            }
            
            System.out.println(solve(input));
            
        }
    }


    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return  "no";
                }else{
                    stack.pop();
                }
            }else if(c == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return  "no";
                }else{
                    stack.pop();
                }
            }   
        }

        return stack.isEmpty() ? "yes" : "no";
            
            
    }
}