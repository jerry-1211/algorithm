import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int N, M ;
    static int[][] array;
    static int[][] visited;
    static ArrayDeque<int[]> queue;
    static int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        array = new int[N][M];
        visited = new int[N][M];
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for(int[] vist : visited){
             Arrays.fill(vist, -1);
        }

        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                int value = Integer.parseInt(st.nextToken());
                array[i][j] = value;
                if(value == 1){
                    queue.offer(new int[]{i,j});
                    visited[i][j] = 0;
                }else if(value == -1){
                    visited[i][j] = 0;
                }
            }
        }


        while(!queue.isEmpty()){
            int[] q = queue.poll();
            int i = q[0];
            int j = q[1];

            for(int k = 0 ; k < 4; k++){
                int ni = i + direction[k][0];
                int nj = j + direction[k][1];
                if(0 <= ni && ni < N && 0 <= nj && nj < M){
                    if(visited[ni][nj] == -1 && array[ni][nj] == 0){
                        queue.offer(new int[]{ni,nj});
                        visited[ni][nj] = visited[i][j] + 1;
                    }
                }
            }
        }

        System.out.println(makeResult());
    }

    public static int makeResult(){
        int max = -1 ;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int value = visited[i][j];
                max = Math.max(value, max);
                if(value == -1){
                    return -1;
                }
            }
         }
        return max;
    }
}