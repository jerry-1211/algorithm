import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int LIMIT = 300_000;
    static int[] decimal = new int[LIMIT];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        decimal[0] = 1;
        decimal[1] = 1;
        makeDecimal();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0){
                break;
            }

            int count = 0;
            for (int i = N + 1; i < (N * 2) + 1; i++) {
                if(decimal[i] == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static void makeDecimal(){
        int index = 2;
        while (index <= LIMIT) {
            for (int i = (index * 2); i < LIMIT; i += index) {
                if (decimal[i] == 0) {
                    decimal[i] = 1;
                }
            }
            index++;
        }
    }

}



