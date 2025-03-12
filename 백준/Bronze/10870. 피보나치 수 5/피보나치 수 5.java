import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        // 초기값 세팅
        int N = Integer.parseInt(br.readLine());
        int[] fibo = new int[N+10];

        fibo[0] = 0; fibo[1] = 1;

        for (int i = 2; i <=N ; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println(fibo[N]);
    }
}
