import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] array = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }



        Arrays.sort(array,(a,b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }else{
                return a[0] - b[0];
            }
        });

        for (int[] arr : array) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }

}

