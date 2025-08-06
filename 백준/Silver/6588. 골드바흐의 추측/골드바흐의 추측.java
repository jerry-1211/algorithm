import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int LIMIT = 1_000_000;
    static int[] prime = new int[LIMIT];
    static int[] result = new int[2];
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        makePrime();
        
        while(true){
            int N = Integer.parseInt(br.readLine());

            resetResult();
            
            if(N == 0){
                break;
            }

            if(checkEvenPosible(N)){
                System.out.println(N + " = " + result[0] + " + " + result[1]);    
            }else{
                System.out.println("Goldbach's conjecture is wrong.");    
            };

        }

        checkEvenPosible(10);
    }

    public static void resetResult(){
        result[0] = 0;
        result[1] = 0;
    }

    public static void makePrime(){
        prime[0] = 1 ; 
        prime[1] = 1 ; 
        int index = 2;
        
        while(index < LIMIT){
            for(int i = (index*2); i < LIMIT; i += index){
                if(prime[i] == 0) prime[i] = 1; 
            }
            index += 1;
        }
    }

    public static boolean checkEvenPosible(int N){
        for(int i = 2; i <= N/2 + 1; i++ ){
            if(prime[N-i] == 0 && prime[i] == 0){
                result[0] = i;
                result[1] = N - i;
                return true;
            }
        }
        return false;
    }

}