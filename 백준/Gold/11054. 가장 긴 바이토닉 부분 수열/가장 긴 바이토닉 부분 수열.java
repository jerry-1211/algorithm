import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] dp, reversedDp;
    static int[] array, reversedArray;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp = new int[N];
        Arrays.fill(dp,1);

        reversedArray = new int[N]; 
        for(int i = 0; i < N; i++){
            reversedArray[i] = array[N-i-1];
        }
        reversedDp = new int[N]; 
        Arrays.fill(reversedDp,1);

        
        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(array[i] > array[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(reversedArray[i] > reversedArray[j]){
                    reversedDp[i] = Math.max(reversedDp[i], reversedDp[j] + 1);
                }
            }
        }

        int result = 0 ;
        for(int i = 0; i < N; i++){
            result = Math.max(result, dp[i] + reversedDp[N-i-1]);
        }

        System.out.println(result-1);

    }
}