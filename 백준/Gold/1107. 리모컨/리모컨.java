import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static boolean[] remocon;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        remocon = new boolean[10];
        Arrays.fill(remocon, true);

        if(M != 0 ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++){
                remocon[Integer.parseInt(st.nextToken())] = false;   
            }
        }



        
        
        int result = Math.abs(N - 100);    

        
        for(int i = 0; i < 1_000_000; i++){            
            if(checkPossibleByRemocon(i)){
                result = Math.min(result, Math.abs(N - i) + String.valueOf(i).length());
            }
        }
        
        System.out.println(result);
    }

    public static boolean checkPossibleByRemocon(int channel){
        String S = String.valueOf(channel);
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            int number = (int) c - '0'; 
            if(!remocon[number]){
                return false;
            }
        }
        return true;
    }
}