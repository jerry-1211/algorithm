import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }else if(calculateNumber(o1) != calculateNumber(o2)){
                return calculateNumber(o1) - calculateNumber(o2);
            }else{
                return o1.compareTo(o2);
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static int calculateNumber(String o1){
        int total = 0;

        for (char c : o1.toCharArray()) {
            if (Character.isDigit(c)) {
                total += c - '0';
            }
        }
        return total;
    }

}


