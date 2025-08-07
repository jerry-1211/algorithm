import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int LIMIT = 510;
    static int N;
    static int[] array;
    static int[] dp;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        array = new int[LIMIT];
        dp = new int[LIMIT];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            array[index] = value;
        }

        for(int i = 1; i < LIMIT; i++){
            for(int j = 0; j < i; j++){
                if(array[i] > array[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }   
            }
        }

        int result = Arrays.stream(dp).max().orElse(0);
        System.out.println(N-result);
    
    }
}