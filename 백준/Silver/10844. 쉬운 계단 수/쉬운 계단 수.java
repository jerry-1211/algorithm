import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[12];
        long[] arr;

        // 초기화: 숫자 1~9만 1개씩 (0으로 시작 불가)
        for (int i = 2; i <= 10; i++) {  // dp[2]~dp[10] = 숫자 1~9
            dp[i] = 1;
        }
        dp[1] = 0;  // 숫자 0으로 시작 불가

        for (int i = 0; i < N-1; i++) {
            arr = dp.clone();
            for (int j = 1; j <= 10; j++) {  // 숫자 0~9 처리
                dp[j] = (arr[j-1] + arr[j+1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i = 1; i <= 10; i++) {  // 숫자 0~9 합계
            sum = (sum + dp[i]) % 1000000000;
        }
        System.out.println(sum);
    }
}
