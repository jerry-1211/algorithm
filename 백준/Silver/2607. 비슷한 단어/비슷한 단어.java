import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        int[] baseArray = new int[200];
        String base = br.readLine();
        for (int i = 0; i < base.length(); i++) {
            baseArray[base.charAt(i)]++;
        }

        for (int i = 0; i < N-1; i++) {
            int[] compareArray = new int[200];
            String compare = br.readLine();

            for (int j = 0; j < compare.length(); j++) {
                compareArray[compare.charAt(j)]++;
            }

            int count = 0;
            for (int j = 0; j < 200; j++) {
                count += Math.abs(compareArray[j] - baseArray[j]);
            }

            if(count <= 1){
                result++;
            }else if(count == 2 && base.length() == compare.length()){
                result++;
            }
        }
        System.out.println(result);
    }

}

