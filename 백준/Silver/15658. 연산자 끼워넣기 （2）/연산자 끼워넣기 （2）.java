import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] array;
    static double mx = Double.NEGATIVE_INFINITY;
    static double mn = Double.POSITIVE_INFINITY;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] operator = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = array[0];

        recursion(result, 0, operator[0], operator[1], operator[2], operator[3]);
        
        System.out.println((int)mx);
        System.out.println((int)mn);
    }


    public static void recursion(int result,int n, int plus, int minus, int multiple, int divide) {

        if (n >= N - 1) {
            mn = Math.min(mn, result);
            mx = Math.max(mx, result);
            return;
        }

        if (plus > 0 ) {
            recursion(result + array[n+1], n + 1, plus - 1, minus, multiple, divide);
        }

        if (minus > 0) {
            recursion(result - array[n+1], n + 1, plus, minus - 1, multiple, divide);
        }

        if (multiple > 0) {
            recursion(result * array[n+1], n + 1, plus, minus, multiple-1, divide);
        }

        if (divide > 0) {
            recursion(result / array[n+1], n + 1, plus, minus, multiple, divide-1);
        }

    }

}

