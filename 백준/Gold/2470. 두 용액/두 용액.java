import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N ;
    static int[] array;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);

        int left = 0 ; 
        int right = N-1 ;

        int value = Integer.MAX_VALUE;
        int[] result = new int[2];

        while(left < right){
            int sum = array[left] + array[right];

            if(Math.abs(sum) < value){
                value = Math.abs(sum);
                result[0] = array[left];
                result[1] = array[right];
            }
        
            if(sum < 0){
                left += 1;
            }else{
                right -= 1;
            }
            
        }

        System.out.println(result[0] + " " + result[1]);
        

        
    }
}