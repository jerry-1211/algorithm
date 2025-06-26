import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int M = Integer.parseInt(br.readLine());
        int[] result = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> dict = new HashMap<>();

        for (int value : array) {
            dict.put(value, dict.getOrDefault(value, 0) + 1);
        }


        StringBuilder sb = new StringBuilder();

        for (int value : result) {
            sb.append(dict.getOrDefault(value, 0)).append(" ");
        }

        System.out.println(sb);

    }
}


