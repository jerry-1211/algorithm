import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = getInitialSum(array,M);

        int result = sum;
        for (int i = 1; i < N-M+1; i++) {
            sum -= array[i - 1];
            sum += array[i + M - 1];
            result = Math.max(sum, result);
        }
        System.out.println(result);
    }

    public static int getInitialSum(int[] array, int M){
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += array[i];
        }
        return sum;
    }

}



