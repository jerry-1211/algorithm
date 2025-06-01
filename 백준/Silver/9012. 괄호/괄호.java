import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Deque<String> queue = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine());


            String[] split = st.nextToken().split("");

            for (String s : split) {
                if(queue.isEmpty()){
                    queue.push(s);
                }else{
                    if (queue.getLast().equals("(") && s.equals(")") ){
                        queue.pop();
                    }else{
                        queue.push(s);
                    }
                }

            }
            if(queue.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }






    }

}
