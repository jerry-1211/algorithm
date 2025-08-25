import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N ;
    static int[] array;
    static int[] visit;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        visit = new int[N+1];
        permutation(0);
    }

    public static void permutation(int n){
        if(n >= N){
            for(int v : array){
                System.out.print(v + " ");    
            }
            System.out.println();    
            return;
        } 

        for(int i = 1; i < N + 1; i++){
            array[n] = i;
            if(visit[i] == 0){
                visit[i] = 1;
                permutation(n+1);    
                visit[i] = 0;
            }
        }
    }
    
}