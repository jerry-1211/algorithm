import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        Double[][] RGB = new Double[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                RGB[i][j] = Double.parseDouble(st.nextToken());
            }
        }

        Double[][] dp = dpReset();

        Double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < 3; i++) {
            dp[0] = dpInitialize(RGB[0].clone(), i);
            Double v = dpCalculate(dp, RGB, i);
            result = Math.min(result, v);

        }
        System.out.println(result.intValue());
    }


    static public Double[] dpInitialize(Double[] array, int index){
        for (int i = 0; i < 3; i++) {
            if(i != index){
                array[i] = Double.POSITIVE_INFINITY;
            }
        }
        return array;
    }

    static public Double[] dpFinalize(Double[] array, int index){
        for (int i = 0; i < 3; i++) {
            if(i == index){
                array[i] = Double.POSITIVE_INFINITY;
            }
        }
        return array;
    }


    static public Double dpCalculate(Double[][] dp,Double[][] RGB, int index){
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(RGB[i][0] + dp[i - 1][1], RGB[i][0] + dp[i - 1][2]);
            dp[i][1] = Math.min(RGB[i][1] + dp[i - 1][0], RGB[i][1] + dp[i - 1][2]);
            dp[i][2] = Math.min(RGB[i][2] + dp[i - 1][0], RGB[i][2] + dp[i - 1][1]);
        }

        dp[N - 1] = dpFinalize(dp[N - 1], index);
        return dpMin(dp);
    }

    static public Double dpMin(Double[][] dp){
        return Collections.min(Arrays.asList(dp[N - 1]));
    }

    private static Double[][] dpReset() {
        Double[][] dp = new Double[N][3];
        for (Double[] array : dp) {
            Arrays.fill(array,0D);
        }
        return dp;
    }

}

