import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        Deque<int[]> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N+1; i++) {
            int T = Integer.parseInt(st.nextToken());
            int[] arr = {i, T};
            dq.add(arr);
        }

        StringBuilder sb = new StringBuilder();

        while(!dq.isEmpty()){

            int [] arr = dq.pollFirst();
            sb.append(arr[0]).append(" ");

            if(dq.isEmpty()){
                break;
            }

            if(arr[1] > 0){
                for (int i = 0; i < arr[1]-1; i++) {
                    dq.offerLast(dq.pollFirst());
                }
            }else{
                for (int i = 0; i < Math.abs(arr[1]); i++) {
                    dq.offerFirst(dq.pollLast());
                }
            }
        }

        System.out.println(sb);

    }

}
