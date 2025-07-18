import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            String[][] array = new String[M][2];

            for (int j = 0; j < M; j++) {
                String[] split = br.readLine().split(" ");
                array[j][0] = split[0];
                array[j][1] = split[1];
            }

            Arrays.sort(array, (a,b)->{
                return Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
            });

            System.out.println(array[0][0]);

        }

    }
}

