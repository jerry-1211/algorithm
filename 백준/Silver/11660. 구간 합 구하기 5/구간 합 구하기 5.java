import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);


        int[][] arr = new int[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            int[] ints = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < N ; j++) {
                arr[i][j+1] = ints[j];
            }

        }

        int[][] arrSum = new int[N + 1][N + 1];

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                arrSum[i][j] = arrSum[i - 1][j] + arrSum[i][j - 1] - arrSum[i - 1][j - 1] + arr[i][j];
            }
        }


        for (int i = 0; i < M; i++) {
            int[] ints = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = ints[0], y1 = ints[1], x2 = ints[2], y2 = ints[3];
            int result = arrSum[x2][y2] - arrSum[x2][y1 - 1] - arrSum[x1 - 1][y2] + arrSum[x1 - 1][y1 - 1];
            System.out.println(result);
        }

    }
}
