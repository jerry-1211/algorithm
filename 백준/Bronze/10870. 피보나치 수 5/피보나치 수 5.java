import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        // 초기값 세팅
        int N = Integer.parseInt(br.readLine());
        int cnt = 2;
        int[] answer = new int[N+100];
        answer[0] = 0 ; answer[1] = 1;

        fibo(cnt,N+10,answer);
        System.out.println(answer[N]);
    }

    private static void fibo(int cnt, int N,int[] answer){
        if(N+1 == cnt){
            return ;
        }
        answer[cnt] = answer[cnt-1] + answer[cnt-2];
        fibo(++cnt,N ,answer);
    }

}
