import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        Integer[] dp = new Integer[N+1];

        dp[0] = 0;
        for (int i = 1; i < N+1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; Math.pow(j,2) <= i; j++) {
                dp[i] = Math.min(dp[i], dp[(int) (i - Math.pow(j, 2))] + 1);
            }
        }

        System.out.println(dp[N]);


    }
}


