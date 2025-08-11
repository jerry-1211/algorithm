import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int left = 1;
        int right = Arrays.stream(array).max().orElse(0);
        int answer = 0;

        while (left <= right) {
            int mid = (right + left) / 2;
            int result = 0;

            for (int i = 0; i < array.length; i++) {
                result += array[i] / mid;
            }

            if (result >= M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        System.out.println(answer);

    }


}






