import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] line = new long[M];
        long input;
        for (int i = 0; i < M; i++) {
            input = Integer.parseInt(br.readLine());
            line[i] = input;
        }

        long result = 0L;

        long left = 1;
        long right = Arrays.stream(line).max().getAsLong();

        while(left <= right){
            long mid = (right + left) / 2;
            long count = countPieces(line, mid);

            if(count >= N){
                result = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(result);

    }

    public static long countPieces(long[] line, long length){
        long count = 0;
        for (long l : line) {
            count += (l / length);
        }
        return count;
    }

}

