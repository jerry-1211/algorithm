import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] chemical = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            chemical[i] = input.charAt(i);
        }
        
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < chemical.length; i++){
            char c = chemical[i] ;

            if(c == '('){
                stack.push(-1);
            }else if(c == 'H'){
                stack.push(1);
            }else if(c == 'C'){
                stack.push(12);
            }else if(c == 'O'){
                stack.push(16);
            }else if(Character.isDigit(c)){
                stack.push(stack.pop() * (int)(c - '0'));
            }else if(c == ')'){
                int tmp = 0;
                while(stack.peek() != -1){
                    tmp += stack.pop();
                }
                stack.pop();
                stack.push(tmp);
            }

            result = stack.stream().mapToInt(Integer::intValue).sum();        
        }
        System.out.println(result);
    }


}