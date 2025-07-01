import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringBuilder st;
        String s = br.readLine();

        int[] arr = new int[5];
        int idx = 0;

        while(true){
            if(s == null){
                break;
            }

            arr[idx++] = Integer.parseInt(s);
            st = new StringBuilder(s);
            s = br.readLine();

        }

        Arrays.sort(arr);

        int mean = (int) (Arrays.stream(arr).sum() / Arrays.stream(arr).count());
        int i = (int) (Arrays.stream(arr).count() / 2);


        System.out.println(mean);
        System.out.println(arr[i]);


    }
}


