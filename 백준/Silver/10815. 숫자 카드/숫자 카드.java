import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();


        HashSet<Integer> integers = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            integers.add(arr1[i]);
        }

        for (int i = 0; i < M; i++) {
            if (integers.contains(arr2[i])){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }




    }
}
