import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            System.out.println(" ".repeat(N-(i+1))  + "*".repeat(i+1) +   "*".repeat(i));



        }

    }
}
