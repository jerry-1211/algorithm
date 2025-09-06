import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N ;
    static int[] memo1 ;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){

            N = Integer.parseInt(br.readLine());
            memo1 = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                memo1[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(memo1);

            int M = Integer.parseInt(br.readLine());
            int[] memo2 = new int[M];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++){
                memo2[i] = Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < memo2.length; i++){       
                sb.append(checkMemo(memo2[i])).append('\n');
            }
            
            System.out.print(sb.toString());
        }
    }


    public static int checkMemo(int number){
        int left = 0 ;
        int right = N-1; 
        int result = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            
            if(memo1[mid] > number){
                result = mid;
                right = mid - 1;
            }else if(memo1[mid] == number){
                return 1;
            }else{
                left = mid + 1;
            }
        }

        if(result == -1){
            return 0;
        }

        return memo1[result] == number ? 1 : 0;
    }
}