import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N+1; i++) {
            String s = "*".repeat(i) + " ".repeat(N - i) + " ".repeat(N - i) + "*".repeat(i);
            System.out.println(s);
        }
        for (int i = N-1; i >= 0; i--) {
            String s = "*".repeat(i) + " ".repeat(N - i) + " ".repeat(N - i) + "*".repeat(i);
            System.out.println(s);
        }

    }
}
