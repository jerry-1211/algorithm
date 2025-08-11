import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<int[]> [] graph;
    static int[] visit;
    static int N;
    static Long result = 0L;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        visit = new int[N + 1];
        Arrays.fill(visit, -1);


        for (int i = 0; i < N+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());

            graph[x].add(new int[]{y, len});
            graph[y].add(new int[]{x, len});

        }

        visit[1] = 1;
        dfs(1,0L);
        System.out.println(result);

    }

    public static void dfs(int node, Long distance){
        result = Math.max(result, distance);

        for (int[] edge : graph[node]) {
            int nextNode = edge[0];
            int weight = edge[1];

            if(visit[nextNode] == -1){
                visit[nextNode] = 1;
                dfs(nextNode, distance + weight);
            }
        }
    }


}






