import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        extract100(list);
        Collections.sort(list);

        for (Integer l : list) {
            System.out.println(l);
        }
    }

    private static void extract100(List<Integer> list) {
        int sumList = list.stream().mapToInt(Integer::intValue).sum();

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if((sumList - list.get(i) - list.get(j)) == 100){
                    list.removeAll(List.of(list.get(i), list.get(j)));
                    return;
                };
            }
        }
    }

}
