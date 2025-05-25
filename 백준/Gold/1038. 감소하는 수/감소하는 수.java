import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static ArrayList<Long> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < 11; i++) {
            generateCombinations(new ArrayList<>(),0,i);
        }

        Collections.sort(result);

        if(N >= result.size()){
            System.out.println(-1);
        }else {
            System.out.println(result.get(N));
        }


    }

    public static void generateCombinations(List<Integer> current, int start, int targetLength){

        if (current.size() == targetLength) {
            ArrayList<Integer> tmpList = new ArrayList<>(current);
            tmpList.sort(Collections.reverseOrder());

            long number = 0;
            for (Integer tmp : tmpList) {
                number = number * 10 + tmp;
            }

            result.add(number);
            return;
        }

        for (int i = start; i <= 9; i++) {
            current.add(i);
            generateCombinations(current,i+1,targetLength);
            current.remove(current.size()-1);
        }
    }
}
