import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        Deque<Integer> arr = new ArrayDeque<>();
        for (int i = 1; i < N+1; i++) {
            arr.add(i);
        }

        System.out.print("<");
        while(!(arr.isEmpty())){
            for (int i = 0; i < M-1; i++) {
                Integer v = arr.removeFirst();
                arr.add(v);
            }

            if(arr.size()==1){
                System.out.print(arr.removeFirst());
            }else{
                System.out.print(arr.removeFirst() + ", ");
            }

        }
        System.out.print(">");



    }
}
