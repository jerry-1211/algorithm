import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] array;
    static int N, M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }

        int left = 1;
        int right = sum;
        int result = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            if(checkAmount(mid) <= M){
                result = mid;    
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(result);
    }

    public static int checkAmount(int result){
        int sumValue = 0; 
        int count = 0;
        
        for(int value : array){
            if(value > result) return Integer.MAX_VALUE;
            sumValue += value; 
            
            if(sumValue > result){
                sumValue = value; 
                count += 1;
            }
        }
        return count + 1;
    }
    
}