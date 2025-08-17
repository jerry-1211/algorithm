import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N ; 

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int N = array.length;

        Long[] dp = new Long[N];
        for(int i = 0; i < N; i++){
            dp[i] = 0L;
        }
        dp[0] = 1L;

        if(array[0] == 0 ){
            System.out.println(0);   
            return ;
        }
        
        if(dp.length >= 2){
            if(array[1] != 0){
                dp[1] = 1L;
            }

            int value = makeNumber(array[0], array[1]);
            if(value <= 26 && value >= 10){
                dp[1] += 1L;    
            }
        }
        
        for(int i = 2; i < N; i++){
            int value = makeNumber(array[i-1], array[i]);

            if(array[i] != 0){
                dp[i] = dp[i-1];
            }

            if(value <= 26 && value >= 10){
                dp[i] +=  dp[i-2];
                dp[i] %=  1_000_000;
            }
        }

        System.out.println(dp[N-1]);   
    }

    public static int makeNumber(int a, int b){
        return a * 10 + b;
    }

}