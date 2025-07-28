import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] visit;
    static int F, S, U, D;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> queue = new ArrayDeque<>(List.of(S));
        bfs(queue);

        if (visit[G] == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(visit[G]);
        }

    }

    static void bfs(ArrayDeque<Integer> queue) {
        visit = new int[F + 1];
        Arrays.fill(visit,-1);
        visit[S] = 0;

        while (!queue.isEmpty()) {
            int currentFloor = queue.removeFirst();
            int downFloor = currentFloor - D;
            int upFloor = currentFloor + U;

            if (downFloor > 0 && visit[downFloor] == -1) {
                visit[downFloor] = visit[currentFloor] + 1;
                queue.add(downFloor);
            }

            if (upFloor <= F && visit[upFloor] == -1) {
                visit[upFloor] = visit[currentFloor] + 1;
                queue.add(upFloor);
            }
        }
    }
}



