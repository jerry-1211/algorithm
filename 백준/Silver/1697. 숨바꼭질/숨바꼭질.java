import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int N, M ;
    static int LIMIT = 100_001;
    static int[] visit = new int[LIMIT];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(N);

        int count = 0 ;
        boolean flag = false;
        
        while(!queue.isEmpty() && N != M){
            int value = queue.remove();
            for(int k = 0; k < 3; k++){
                int nextValue ;
                if(k == 2){
                    nextValue = value * 2;    
                }else if(k == 1){
                    nextValue = value - 1;    
                }else{
                    nextValue = value + 1;    
                }

                if(0 <= nextValue && nextValue < LIMIT){
                    if(visit[nextValue] == 0){
                        visit[nextValue] = visit[value] + 1;
                        queue.offer(nextValue);
                    }
                }
                
                if(nextValue == M){
                    flag = true;
                    break;
                }
            }

            if(flag){
                break;
            }
        }

        System.out.println(visit[M]);

    }
}