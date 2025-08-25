import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] array = new int[T];
        int[][] dp = new int[T][3];

        for (int i = 0; i < T; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        if (T == 1){
            System.out.println(array[0]);
        } else if (T == 2) {
            System.out.println(array[0] + array[1]);
        }else {
            dp[0][0] = 0;
            dp[0][1] = array[0];
            dp[0][2] = array[0];

            dp[1][0] = array[0] + array[1];
            dp[1][1] = array[1];
            dp[1][2] = Math.max(dp[1][0], dp[1][1]);

            for (int i = 2; i < T; i++) {
                dp[i][0] = dp[i - 1][1] + array[i];
                dp[i][1] = dp[i - 2][2] + array[i];
                dp[i][2] = Math.max(Math.max(dp[i][0], dp[i][1]), dp[i - 1][2]);
            }


            int result = 0;

            for (int i = 0; i < T; i++) {
                result = Math.max(result, dp[i][2]);
            }

            System.out.println(result);




        }
    }
}