import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int LIMIT = 50;
    static int[] dp = new int[LIMIT];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp[0] = 1;
        dp[2] = 3;
        dp[4] = 11;

        if(N%2!=0){
            System.out.println(0);    
        }else{
            for(int i = 6; i < LIMIT; i += 2){
                dp[i] += dp[i-2] * 3 ;

                for(int j = i -4; j >= 0 ; j -= 2){
                    dp[i] += dp[j]*2;
                }
            }
            System.out.println(dp[N]);
        }        
    }
}