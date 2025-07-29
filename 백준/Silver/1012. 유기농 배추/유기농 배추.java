import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] array;
    static int[][] visit;
    static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int N;
    static int M;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            array = new int[N][M];
            visit = new int[N][M];
            int result = 0;


            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int tmpM = Integer.parseInt(st.nextToken());
                int tmpN = Integer.parseInt(st.nextToken());
                array[tmpN][tmpM] = 1;
            }


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(visit[i][j] == 0 && array[i][j] ==1){
                        result = bfs(i, j,result);
                    }
                }
            }

            System.out.println(result);

        }
    }

    static int bfs(int i, int j, int result){
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{i, j});

        while(!queue.isEmpty()){
            int[] tmpArray = queue.removeLast();
            for (int k = 0; k < 4; k++) {
                int di = tmpArray[0] + direction[k][0];
                int dj = tmpArray[1] + direction[k][1];

                if(0<=di && di<N && 0<=dj && dj<M){
                    if(visit[di][dj]==0 && array[di][dj] ==1 ){
                        visit[di][dj] = 1;
                        queue.add(new int[]{di, dj});
                    }
                }
            }
        }
        return ++result;
    }


}






