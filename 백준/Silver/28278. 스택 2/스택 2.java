import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                int order = Integer.parseInt(st.nextToken());

                if (order == 1) {
                    stack.offerLast(Integer.parseInt(st.nextToken()));
                } else if (order == 2) {
                    if (stack.peekLast() == null) {
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.pollLast());
                    }
                } else if (order == 3) {
                    System.out.println(stack.size());
                } else if (order == 4) {
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                }else{
                    if (stack.peekLast() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peekLast());
                    }
                }

            }

        }

    }
}


