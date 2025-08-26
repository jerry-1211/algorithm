import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[N];
        
        Stack<int[]> stack = new Stack<>();

        for(int i = N-1; i >= 0; i--){
            while(true){
                if(stack.isEmpty()){
                    stack.push(new int[]{array[i], i});
                    break;
                }
                
                int[] top = stack.peek();
                
                if(top[0] <= array[i]){
                    top = stack.pop();
                    result[top[1]] = i + 1;
                }else{
                    stack.push(new int[]{array[i], i});
                    break;    
                }
            }    
        }

        for(int value : result){
            System.out.print(value + " ");
        }
        
    }
}