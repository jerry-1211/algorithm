import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String[] input = br.readLine().split("");
            
            if(input.length == 1 && ".".equals(input[0])){
                break;
            }

            Stack<String> stack = new Stack<>();

            for(int i = 0; i < input.length; i++){
                
                if("(".equals(input[i])){
                    stack.push("(");
                }else if("[".equals(input[i])){
                    stack.push("[");
                }
                
                if("]".equals(input[i]) && !stack.isEmpty()){
                    if(stack.peek() == "["){
                        stack.pop();
                    }else{
                        stack.push("-");
                    }
                }else if("]".equals(input[i]) && stack.isEmpty()){
                    stack.push("-");
                }
                
                if(")".equals(input[i]) && !stack.isEmpty()){
                    if(stack.peek() == "("){
                        stack.pop();
                    }else{
                        stack.push("-");
                    }
                }else if(")".equals(input[i]) && stack.isEmpty()){
                    stack.push("-");
                }
            }
            
            if(!stack.isEmpty()){
                System.out.println("no");    
            }else{
                System.out.println("yes");    
            }
        }
    }
}