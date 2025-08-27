import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] graph;
    static int N, M;

    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                int value = Integer.parseInt(st.nextToken());
                if(value == 1){
                    graph[i][j] = 1;
                }
            }
        }

        int[] destinations = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int[] visited = new int[N];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int destination = destinations[0];
        visited[destination - 1] = 1;
        queue.offer(destination - 1);

        while(!queue.isEmpty()){
            int city = queue.poll();
            for(int i = 0; i < N; i++){
                if(graph[city][i] == 1 && visited[i] == 0){
                    visited[i] = 1;
                    queue.offer(i);
                }
            }
        }

        boolean result = true;            
        for(int c : destinations){
            if(visited[c-1] == 0){
                result = false;
                break;
            }
        }

        if(result){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}