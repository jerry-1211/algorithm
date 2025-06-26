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

        for (int i = 0; i < N; i++) {
            dict.putIfAbsent(array[i], 0);
            dict.put(array[i], dict.get(array[i]) + 1);
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if(dict.get(result[i]) == null){
                sb.append(0).append(" ");
            }else{
                sb.append(dict.get(result[i])).append(" ");
            }
        }
        
        System.out.println(sb);

    }
}


