import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] split = br.readLine().split(" ");

            StringBuilder sb = new StringBuilder("");
            for (String s : split) {
                sb.append(new StringBuilder(s).reverse());
                sb.append(" ");
            }

            System.out.println(sb);
        }

    }
}


