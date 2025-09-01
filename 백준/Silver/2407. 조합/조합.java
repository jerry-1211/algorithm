import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        M = Math.max(M, N-M);
        
        BigInteger A = makeCombinationCount(M, N);
        BigInteger B = makeCombinationCount(1, N-M);
        System.out.println(A.divide(B));        
    }

    public static BigInteger makeCombinationCount(int s, int e ){
        BigInteger result = BigInteger.ONE;
        while(e > s){
            result = result.multiply(BigInteger.valueOf(e));
            e -= 1;
        }
        return result;
    }
}