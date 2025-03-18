import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[end+1];
        Arrays.fill(isPrime,true);

        for (int i = 2; i <= end; i++) {
            for (int j = i*i; j <= end; j+=i) {
                isPrime[j] = false ;
            }
        }

        isPrime[0] = isPrime[1] = false;

        int sum = 0;
        int mn = -1;

        for (int i = start ; i <= end; i++) {
            if(isPrime[i]){
                sum += i;
                if (mn == -1) {
                    mn = i;
                }
            }
        }

        if(sum == 0 ){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(mn);
        }

    }
}
