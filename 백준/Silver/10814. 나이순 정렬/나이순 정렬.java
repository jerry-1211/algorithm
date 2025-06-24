import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }


//        Arrays.sort(arr, (o1, o2) -> {
//            int nameCompare = o1[1].compareTo(o2[1]);
//            if (nameCompare != 0) {
//                return nameCompare;
//            }
//            return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
//        });


//        Arrays.sort(arr, (o1,o2)->{
//            int integerCompare = Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
//            if (integerCompare != 0) {
//                return integerCompare;
//            }
//            return o2[1].compareTo(o1[1]);
//        });

        Arrays.sort(arr,(o1,o2)->{
            return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
        });


        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }



    }
}


