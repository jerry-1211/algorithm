import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int limit = 2000;
        boolean[] isComposite = new boolean[limit];
        isComposite[1] = true;

        eratos(isComposite,limit);

        int primeCount = 0;
        for (int x : arr) {
            if(isComposite[x] == false){
                primeCount += 1;
            }
        }

        System.out.println(primeCount);
    }

    public static boolean[] eratos(boolean[] isComposite,int n){
        for (int i = 2; i*i < n; i++) {
            for (int j = i*i; j < n ; j+=i) {
                isComposite[j] = true;
            }
        }
        return isComposite ;
    }
}
