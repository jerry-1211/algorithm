import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int ball = 1;

        for(int i=0; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if( a == ball){
                ball = b;
            }else if(b == ball){
                ball = a;
            }
        }

        System.out.println(ball);

    }
}

