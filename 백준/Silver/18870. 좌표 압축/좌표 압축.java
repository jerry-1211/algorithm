import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        Integer[] arr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        List<Integer> list = Arrays.stream(arr).sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        HashMap<Integer, Integer> dict = new HashMap<>();

        int count = 0;
        for (Integer ls : list) {
            if(dict.get(ls) == null){
                dict.put(ls, count++);
            }
        }

        for (Integer ar : arr) {
            sb.append(dict.get(ar)).append(" ");
        }

        System.out.println(sb);

    }
}


