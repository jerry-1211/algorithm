import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>(N + 1);
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer tmp = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tmp.nextToken());
            int b = Integer.parseInt(tmp.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i < N+1; i++) {
            int[] visit = new int[N+1];
            initializeVisit(visit,N);

            Deque<Integer> q = new ArrayDeque<>();
            q.offer(i);
            visit[i] = 0;

            while (!q.isEmpty()){
                int x = q.pollFirst();
                for (int y : graph.get(x)) {
                    if (visit[y] == -1){
                        visit[y] = visit[x] + 1;
                        q.offer(y);
                    }
                }
            }

            int s = Arrays.stream(visit,1,N+1).sum();
            result.add(s);
        }


        Integer k = result.stream().min(Integer::compareTo).get();
        System.out.println(result.indexOf(k)+1);


    }

    public static void initializeVisit(int[] visit, int N){
        for (int i = 0; i < N+1; i++) {
            visit[i] = -1;
        }
    }
}


