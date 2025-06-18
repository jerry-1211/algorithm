import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int T = Integer.parseInt(br.readLine());

        long[][] dp = new long[4][3];
        long[] result = new long[100_100];
        result[1] = 1;
        result[2] = 1;
        result[3] = 3;

        dp[0][0] = 1;
        dp[1][1] = 1;
        dp[2][0] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;



        for (int j = 4; j < 100_100; j++) {
            dp[3][0] = (dp[2][1] + dp[2][2]) % 1_000_000_009;
            dp[3][1] = (dp[1][0] + dp[1][2]) % 1_000_000_009;
            dp[3][2] = (dp[0][0] + dp[0][1] )% 1_000_000_009;

            dp[0] = dp[1].clone();
            dp[1] = dp[2].clone();
            dp[2] = dp[3].clone();

            long sum = Arrays.stream(dp[3]).sum();
            result[j] = sum;
        }

        for (int i = 0; i < T; i++) {
            int v = Integer.parseInt(br.readLine());
            System.out.println((result[v]) % 1_000_000_009);
        }

    }
}


