import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static Stack<Integer> stack ;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();     

        stack = new Stack<>();
        boolean flag =  true;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push(-2);
            }else if(s.charAt(i) == '['){
                stack.push(-3);
            }else if(s.charAt(i) == ')'){
                flag = calculate(2);
            }else if(s.charAt(i) == ']'){
                flag =calculate(3);
            }
     
            if(!flag) break;
                
        }   

        if(!flag  || stack.stream().anyMatch(x -> x < 0)){
            System.out.println(0);        
        }else{
            int result = stack.stream().mapToInt(Integer::intValue).sum();
            System.out.println(result);            
            
        }
        
        
    }

    public static boolean calculate(int init){
        int sum = 0;

        while(true){
            if(stack.isEmpty()){
                return false;
            }

            int value = stack.pop();
            if(value == -init){
                if(sum == 0){
                    stack.push(init);    
                }else{
                    stack.push(sum);    
                }
                return true;
            }else{
                sum += (value*init);
            }
        }
    }
}