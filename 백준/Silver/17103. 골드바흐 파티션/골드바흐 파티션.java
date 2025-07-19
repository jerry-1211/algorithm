import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final int MAX_N = 1_000_000 + 1;
    static int[] array = new int[MAX_N];
    static int[] result = new int[MAX_N];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        makeArray();

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            System.out.println(checkCount(K));
        }

    }

    private static void makeArray() {
        array[0] = 1;
        array[1] = 1;

        int index = 2;
        while (index < MAX_N) {
            for (int i = index * 2; i < MAX_N; i += index) {
                if (array[i] == 0) {
                    array[i] = 1;
                }
            }
            index++;
        }
    }


    private static int checkCount(int K){
        int count = 0;
        for (int i = 0; i <= K/2; i++) {
            if (array[i] == 0 && array[K - i] == 0) {
                count += 1;
            }
        }
        return count;
    }

}

