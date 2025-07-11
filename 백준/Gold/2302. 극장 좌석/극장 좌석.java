import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] array = new int[M+2];
        for (int i = 1; i < M+1; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        array[M + 1] = N + 1;

        int[] dp = new int[41];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;


        for (int i = 4; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            int value = array[i + 1] - array[i] - 1;
            if(value == 0 ){
                resultList.add(1);
            }else{
                resultList.add(value);
            }

        }


        int result = 1;
        for (Integer value : resultList) {
            result *= dp[value];
        }

        System.out.println(result);

    }

}

