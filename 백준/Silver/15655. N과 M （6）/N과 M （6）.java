import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static int M;
    static int[] array;
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array); // 이 한 줄만 추가하세요

        combinations(new ArrayList<>(), 0);

        List<ArrayList<Integer>> answer = result.stream().sorted((list1, list2) -> {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != list2.get(i)) {
                    return list1.get(i) - list2.get(i);
                }
            }
            return list1.size() - list2.size();
        }).collect(Collectors.toList());


        for (ArrayList<Integer> list : answer) {
            for (Integer value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

    public static void combinations(ArrayList<Integer> list,  int index) {
        if (list.size() >= M) {
            ArrayList<Integer> temp = new ArrayList<>(list.stream().sorted((a, b) -> {
                return a - b;
            }).collect(Collectors.toList()));
            result.add(temp);
            return;
        }

        for (int i = index; i < array.length; i++) {
            list.add(array[i]);
            combinations(list, i + 1);
            list.remove(list.size() - 1);
        }

    }

}

