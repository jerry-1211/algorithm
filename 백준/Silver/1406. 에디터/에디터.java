import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static Stack<Character> stack1 ;  
    static Stack<Character> stack2 ;  
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        stack1 = new Stack<>();
        stack2 = new Stack<>();

        for(int i = 0; i < input.length(); i++){
            stack1.push(input.charAt(i));
        }
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String[] cmd = br.readLine().split(" ");
            
            if(cmd.length == 2){
                char c = cmd[1].charAt(0);
                stack1.push(c);
            }else{
                if(cmd[0].equals("L") && !stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }else if(cmd[0].equals("D") && !stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }else if(cmd[0].equals("B") && !stack1.isEmpty()){
                    stack1.pop();
                }
            }
        
            
        }
        
        StringBuilder sb = new StringBuilder();

        while(!stack1.isEmpty()){
            sb.append(String.valueOf(stack1.pop()));
        }
            
        sb = sb.reverse();

        while(!stack2.isEmpty()){
            sb.append(String.valueOf(stack2.pop()));
        }
        
        System.out.println(sb);
    }
}