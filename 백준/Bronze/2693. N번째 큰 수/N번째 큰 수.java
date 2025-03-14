import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] strArr = br.readLine().split(" ");
            int[] intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(intArr);
            System.out.println(intArr[7]);
        }
        
    }
}