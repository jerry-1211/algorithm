import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int number = 1;
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> queue = new ArrayDeque<>();
        for(int value : array){
            queue.add(value);
        }

        Stack<Integer> stack = new Stack<>();
        
        
        while(!queue.isEmpty()){
            int value = queue.remove();
        
            if(value == number){
                number += 1 ;
            }else{
                stack.push(value);
            }

            while(!stack.isEmpty() && stack.peek() == number){
                stack.pop();
                number += 1;
            }            
        }


        if(stack.isEmpty()){
            System.out.println("Nice");    
        }else{
            System.out.println("Sad");   
        }
    
        
    }
}