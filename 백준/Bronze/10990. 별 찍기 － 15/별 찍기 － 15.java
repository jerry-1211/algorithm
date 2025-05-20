import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        System.out.println(" ".repeat(N-1) + "*");

        for (int i = 1; i < N; i++) {
            System.out.println(" ".repeat((N - i - 1)) + "*" + " ".repeat(i * 2 - 1) + "*" );
        }





    }
}
