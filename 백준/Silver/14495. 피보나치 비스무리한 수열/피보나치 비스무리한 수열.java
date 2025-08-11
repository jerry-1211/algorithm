import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        Long[] fibo = new Long[200];
        fibo[0] = 1L;
        fibo[1] = 1L;
        fibo[2] = 1L;

        for(int i = 3; i < fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-3];
        }
        
        System.out.println(fibo[N-1]);
    }
}






