import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int mid = N / 2;



        HashMap<Integer, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            array[i] = value;
            dictionary.put(value, dictionary.getOrDefault(value, 0) + 1);
        }

        Arrays.sort(array);

        float average = (float) Arrays.stream(array).sum() / N;

        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(dictionary.entrySet());


        entries.sort((a,b) -> {
            if(a.getValue() !=b.getValue()){
                return b.getValue() - a.getValue();
            }else{
                return a.getKey() - b.getKey();
            }
        });

        int value = entries.get(0).getValue();
        int mode;

        if(array.length == 1){
            mode = array[0];
        } else if(entries.get(1).getValue() == value){
            mode = entries.get(1).getKey();
        }else{
            mode = entries.get(0).getKey();
        }


        System.out.println(Math.round(average));
        System.out.println(array[mid]);
        System.out.println(mode);
        System.out.println(array[array.length-1] - array[0]);


    }
}

