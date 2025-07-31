import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int N2 = Integer.parseInt(st.nextToken());
        int M2 = Integer.parseInt(st.nextToken());

        int N = (N1*M2) + (N2*M1);
        int M = M1*M2;

        int gcd = GCD(N,M);
        N = N / gcd;
        M = M / gcd;

        System.out.println(N + " " + M);
    }

    public static int GCD(int N, int M){
        if(N == 0){
            return M;
        }
        return GCD(M%N,N);        
    }
}