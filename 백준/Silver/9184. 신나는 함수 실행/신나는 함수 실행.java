import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][][] memo = new int[21][21][21];
    static int[][][] visit = new int[21][21][21];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        while(true){
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (checkLastInput(array)) break;

            int result = W(array[0], array[1], array[2]);
            System.out.println("w(" + array[0] + ", " + array[1] + ", " + array[2] + ") = " + result);

        }
    }


    public static int W(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            return W(20, 20, 20);
        }

        if(visit[a][b][c] == 0){
            visit[a][b][c] = 1;
        }else{
            return memo[a][b][c];
        }


        if (a < b && b < c) {
            memo[a][b][c] = W(a, b, c - 1) + W(a, b - 1, c - 1) - W(a, b - 1, c);
            return memo[a][b][c];
        }

        memo[a][b][c] = W(a - 1, b, c) + W(a - 1, b - 1, c) + W(a - 1, b, c - 1) - W(a - 1, b - 1, c - 1);
        return memo[a][b][c];

    }


    private static boolean checkLastInput(int[] array) {
        return array[0] == -1 && array[1] == -1 && array[2] == -1;
    }
}

