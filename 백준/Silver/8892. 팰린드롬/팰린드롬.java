import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<String> result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            result = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            String[] array = new String[N];

            for (int j = 0; j < N; j++) {
                array[j] = br.readLine();
            }

            permutaion(array, 0,0);
            if(result.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(result.get(0));
            }
        }
    }

    public static void permutaion(String[] array, int number, int start) {
        if (number == 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <number; i++) {
                sb.append(array[list.get(i)]);
            }
            if(checkPalindrome(sb)){
                result.add(sb.toString());
            }
            return;
        }

        for (int i = start; i < array.length; i++) {
            if(!list.contains(i)){
                list.add(i);
                permutaion(array, number + 1, start);
                list.remove(list.size()-1);
            }
        }
    }

    public static boolean checkPalindrome(StringBuilder sb){
        StringBuilder copy = new StringBuilder(sb);
        return sb.compareTo(copy.reverse()) == 0;
    }

}
