import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] array;
    static int[] dp;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        N = Integer.parseInt(br.readLine());
        dp = new int[N];
        dp[0] = 1;
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] > array[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(dp[i] == 0 ){
                dp[i] = 1;
            }
        }
        

        int result = 0;
        for (int value : dp) {
            if(result < value){
                result = value;
            }
        }
        System.out.println(result);
    }
}






