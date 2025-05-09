import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));


        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashMap<String, String> stringMap = new HashMap<>();

        for (int i = 1; i < N+1; i++) {
            String str = br.readLine();
            stringMap.put(String.valueOf(i), str);
            stringMap.put(str, String.valueOf(i));
        }

        for (int i = 0; i < M; i++) {
            String s = stringMap.get(br.readLine());
            System.out.println(s);
        }





    }
}
