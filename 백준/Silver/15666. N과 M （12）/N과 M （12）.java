import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Set<ArrayList<Integer>> sequenceSet = new HashSet<>();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        makeSequenceList(array, M,  list);

        List<ArrayList<Integer>> list1 = sequenceSet.stream().sorted((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) - b.get(i) != 0) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        }).collect(Collectors.toList());


        for (ArrayList<Integer> set : list1) {
            for(int value : set){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void makeSequenceList(int[] array, int M, List<Integer> list) {

        if (list.size() >= M) {
            ArrayList<Integer> temp = new ArrayList<>(list);
            temp.sort((a,b)->{
                return a - b;
            });
            sequenceSet.add(temp);
            return;
        }

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            makeSequenceList(array, M, list);
            list.remove(list.size()-1);
        }

    }
}

