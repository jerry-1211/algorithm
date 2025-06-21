import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i < N+1; i++) {
            q.add(i);
        }

        StringBuilder st = new StringBuilder();
        while(true) {

            if(q.size() == 1){
                st.append(q.pollFirst());
                break;
            }

            st.append(q.pollFirst()).append(" ");;
            q.offer(q.pollFirst());


        }

        System.out.println(st);

    }
}


