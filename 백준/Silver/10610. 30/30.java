import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String input = br.readLine();
        int total = 0;
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
            total += charArray[i] - '0';
        }


        if (charArray[0] != '0' || total % 3 != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }

}
