import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        for (int i = N-1; i >= 0; i--) {
            System.out.println(" ".repeat(i) + "*".repeat(N-i));
        }

        for (int i = 1; i < N; i++) {
            System.out.println(" ".repeat(i) + "*".repeat(N-i));
        }

        

    }
}
