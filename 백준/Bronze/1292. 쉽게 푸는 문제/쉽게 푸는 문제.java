import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] inputString = br.readLine().split(" ");
        int x = Integer.parseInt(inputString[0]);
        int y = Integer.parseInt(inputString[1]);
        int [] arr = new int[1001];

        int cnt = 1 ;
        int idx = 0 ;

        while(true) {
            if (idx > 1000) break;
            for (int i = 0; i < cnt; i++) {
                if (idx > 1000) break;
                arr[idx++] = cnt;
            }
            cnt += 1;
        }

        int sum = 0 ;
        for (int i = x; i <= y; i++) {
            sum += arr[i-1];
        }
        System.out.println(sum);


    }
}
