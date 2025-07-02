import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Integer[] list = Arrays.stream(array).boxed().sorted(Comparator.naturalOrder()).toArray(Integer[]::new);
        int result = -1;

        for (int i = 0; i < N; i++) {
            result = Math.max(result, (list[i] * (N - i)));
        }

        System.out.println(result);


    }
}


