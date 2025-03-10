import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int cnt = 0, qo = 0, rm = 0;


            while(num > 0){

                qo = num/2;
                rm = num%2;

                if (rm == 1) {
                    System.out.print(cnt + " ");
                }

                if (qo == 1){
                    System.out.print(++cnt);
                    break;
                }

                num = qo;
                cnt += 1 ; 
            }
            System.out.println();

        }
    }
}
