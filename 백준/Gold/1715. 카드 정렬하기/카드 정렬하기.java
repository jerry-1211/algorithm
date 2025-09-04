import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N ;
    static PriorityQueue<Long> minHeap = new PriorityQueue<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            minHeap.offer(Long.parseLong(br.readLine()));
        }
        
        
        long result = 0;
        
        while(minHeap.size() > 1){
            long first = minHeap.poll();
            long second = minHeap.poll();
            long sum = first + second;
            result += sum;
            minHeap.offer(sum);
        }

        System.out.println(result);   
    }
}