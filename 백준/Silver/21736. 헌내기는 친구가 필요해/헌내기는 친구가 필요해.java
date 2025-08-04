import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static String[][] graph;
    static int[][] visit;
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new String[N][M];
        visit = new int[N][M];

        for (int i = 0; i < N; i++) {
            graph[i] = br.readLine().split("");
        }

        ArrayDeque<int[]> queue = new ArrayDeque<>();

        int[] dohyun = findDohyun();
        queue.offer(dohyun);

        int result = 0;

        while(!queue.isEmpty()){
            int[] value = queue.remove();

            for (int k = 0; k < 4; k++) {
                int ni = value[0] + direction[k][0];
                int nj = value[1] + direction[k][1];
                if(0<=ni && ni<N && 0<=nj && nj<M ){
                    if (visit[ni][nj] == 0 && !graph[ni][nj].equals("X")){
                        if(graph[ni][nj].equals("P")){
                            result += 1;
                            visit[ni][nj] = 1;
                            queue.offer(new int[]{ni, nj});
                        }else if(graph[ni][nj].equals("O")){
                            visit[ni][nj] = 1;
                            queue.offer(new int[]{ni, nj});
                        }
                    }
                }
            }
        }

        if(result == 0){
            System.out.println("TT");
        }else{
            System.out.println(result);
        }

    }

    static public int[] findDohyun(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(graph[i][j].equals("I")){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{0, 0};
    }

}






