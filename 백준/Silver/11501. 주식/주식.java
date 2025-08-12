import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static Stack<Integer> stack;
    static Long result ;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            result = 0L;
            int N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] reversedArray = new int[N];

            for(int i = 0; i < N; i++){
                reversedArray[N-i-1] = array[i];
            }

            int max = 0 ;
            for(int i = 0; i < N; i++){
                
                if(max < reversedArray[i]){
                    max = reversedArray[i] ;
                    continue;
                }
                result += max - reversedArray[i];
            }   
            System.out.println(result);   
        }
         
    }
}