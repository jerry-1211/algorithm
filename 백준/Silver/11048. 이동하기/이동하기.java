import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int[][] dp = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        dp[0][0] = arr[0][0];
        for (int i = 1; i < N; i++) {
            dp[i][0] = arr[i][0] + dp[i-1][0];
        }

        for (int i = 1; i < M; i++) {
            dp[0][i] = arr[0][i] + dp[0][i-1];;
        }



        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i][j - 1], dp[i - 1][j - 1]))  + arr[i][j];
            }
        }

        int max = 0;
        for (int[] ints : dp) {
            int v = Arrays.stream(ints).max().getAsInt();
            if (max < v){
                max = v;
            }
        }

        System.out.println(max);
    }
}


