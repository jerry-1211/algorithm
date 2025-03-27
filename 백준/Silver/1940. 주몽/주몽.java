import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;


public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;
        result = bruteForce(N, arr, M, result);
        System.out.println(result);


    }

    private static int bruteForce(int N, int[] arr, int M, int result) {
        for(int i = 0; i< N -1; i++){
            for(int j = i+1; j < N; j++){
                if(arr[i]+ arr[j]== M){
                    result += 1 ;
                }
            }
        }
        return result;
    }

}