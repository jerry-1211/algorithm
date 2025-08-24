import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, w, L;
    static int[] array;
    static ArrayDeque<Integer> queue;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        queue = new ArrayDeque<>();
        for(int i = 0; i < w; i++){
            queue.add(0);
        }

        int count = 0 ;
        int sum = 0 ;
        int p = 0;
        
        for(int i = 0; i < n; i++){
            int v = array[i];
            while(true){
                count += 1 ;
                p = queue.poll();
                sum -= p;
                
                if(sum + v <= L){
                    queue.add(v);
                    sum += v;
                    break;
                }else{
                    queue.add(0);    
                }
            }
        }

        
        while(sum > 0){
            count += 1 ;
            p = queue.poll();
            sum -= p;
        }

        
        System.out.println(count);
    }
}