import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Stack<Integer> array = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static int[] result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        int[] NGE = new int[N];
        result = new int[N];

        for (int i = 0; i < N; i++) {
            NGE[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N - 1; i > -1; i--) {
            popPop(NGE[i],i);
        }

        for (int v : result) {
            sb.append(v).append(" ");
        }
        
        System.out.println(sb);

    }


    static void popPop(int value, int index) {
        while (checkArray() && array.peek() <= value) {
            array.pop();
        }

        if (checkArray()) {
            result[index] = array.peek();
        } else {
            result[index] = -1;
        }

        array.push(value);
    }

    static boolean checkArray() {
        return !array.isEmpty();
    }


}

