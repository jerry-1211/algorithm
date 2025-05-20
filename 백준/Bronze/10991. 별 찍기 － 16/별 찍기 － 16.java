import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());

        System.out.println(" ".repeat(N-1) + "*");


        for (int i = 1; i < N; i++) {
            System.out.print(" ".repeat(N-i-1));
            int K = (i + 1) * 2 - 1;
            for (int j = 0; j < K; j++) {
                if (j%2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }





    }
}
