import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int totalSum = 0;
        List<Integer> arrayLists = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int dwarf = Integer.parseInt(br.readLine());
            arrayLists.add(dwarf);
            totalSum += dwarf;
        }

        extract100(totalSum, arrayLists);
        Collections.sort(arrayLists);

        for (Integer lst : arrayLists) {
            System.out.println(lst);
        }

    }

    private static void extract100(int totalSum, List<Integer> arrayLists) {
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                int tmpSum = totalSum - arrayLists.get(i) - arrayLists.get(j);
                if(tmpSum == 100){
                    arrayLists.removeAll(List.of(arrayLists.get(i), arrayLists.get(j))) ;
                    return;
                }
            }
        }
    }
}
