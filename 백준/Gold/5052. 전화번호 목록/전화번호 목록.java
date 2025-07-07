import javax.management.AttributeList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            String[] arr = new String[N];
            for (int j = 0; j < N; j++) {
                arr[j] = br.readLine();
            }

            Arrays.sort(arr,Comparator.naturalOrder());

            boolean FLAG = true;

            for (int j = 0; j < N-1; j++) {
                if(arr[j+1].startsWith(arr[j])){
                    FLAG = false;
                    break;
                }
            }

            if(FLAG){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}

