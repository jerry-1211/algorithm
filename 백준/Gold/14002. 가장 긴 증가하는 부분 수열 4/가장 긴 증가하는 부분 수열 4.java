import com.sun.source.tree.LiteralTree;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[N];
        Arrays.fill(dp,1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] > array[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = -1 ;

        for (int i = 0; i < N; i++) {
            if(max < dp[i]){
                max = dp[i];
            }
        }

        int result = max;

        int[] count = new int[max];

        StringBuilder sb = new StringBuilder();
        for (int i = N-1; i >= 0; i--) {
            if(max == dp[i]){
                count[max - 1] = array[i];
                max -= 1;
            }
        }

        System.out.println(result);
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}