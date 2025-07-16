import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        long[] requests = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            requests[i] = Long.parseLong(st.nextToken());
        }

        long maxBudget = Long.parseLong(br.readLine());

        long left = 0;
        long right = Arrays.stream(requests).max().getAsLong();
        long result = -1;

        while(left <= right){
            long mid = (right + left) / 2;
            if(calculateBudget(requests, mid) <= maxBudget){
                left = mid + 1;
                result = mid;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(result);

    }


    public static long calculateBudget(long[] requests, long budget){
        long limit = 0L;

        for(long request : requests){
            limit += Math.min(request, budget);
        }

        return limit;
    }
}

