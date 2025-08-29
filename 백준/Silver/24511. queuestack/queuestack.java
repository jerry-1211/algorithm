import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int[][] array;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        array = new int[N][2];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            int structure = Integer.parseInt(st1.nextToken());
            int value = Integer.parseInt(st2.nextToken());
            
            if(structure == 0){
                deque.offer(value);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        M = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    
        for(int ip : input){
            deque.offerFirst(ip);
            sb.append(deque.pollLast()).append(" ");
        }
        
        System.out.println(sb);
    }
}