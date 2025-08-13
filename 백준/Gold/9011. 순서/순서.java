import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static boolean[] visit;
    static int N;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T ; t++){
            N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder(); 
            visit = new boolean[N];
            boolean flag = true;

            for(int i = N-1; i >= 0 ; i--){
                int count = checkOrder(array[i]);
                
                if(count == -1){
                    System.out.println("IMPOSSIBLE");
                    flag = false;
                    break ; 
                }else{
                    sb.append(count+1).append(" ");
                }
            }   

            if(flag){
                String[] S = sb.toString().split(" ");
                for(int i = N-1; i >= 0 ; i--){
                    System.out.print(S[i] + " ");    
                }
                System.out.println();        
            }
        }        
    }


    public static int checkOrder(int order){
        int count = 0;
        int result = 0;
        
        while(true){
            if(count >= N){
                break;
            }            
            
            if(result == order && !visit[count]){
                visit[count] = true;
                return count ;
            }
            
            if(!visit[count]){
                result += 1;
            }

            count += 1;

        }

        return -1;
        
        
    }
}