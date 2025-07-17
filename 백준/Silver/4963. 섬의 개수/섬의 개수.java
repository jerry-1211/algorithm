import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] direction = {{0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, 0}, {1, -1}, {1, 1}};
    static int[][] rectangle, visit;
    static int W , H;

    static class Position{
        int x, y;

        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;


        while(true){
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if (W == 0 && H == 0) break;

            rectangle = new int[H][W];
            visit = new int[H][W];

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    rectangle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 0;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if(visit[i][j] == 0 && rectangle[i][j] == 1){
                        bfs(i, j);
                        result += 1;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void bfs(int i, int j) {
        visit[i][j] = 1;
        ArrayDeque<Position> queue = new ArrayDeque<>();
        queue.offerFirst(new Position(i,j));

        while (!queue.isEmpty()) {
            Position position = queue.removeFirst();
            
            for (int k = 0; k < 8; k++) {
                int ni = position.x + direction[k][0];
                int nj = position.y + direction[k][1];

                if (0 <= ni && ni < H && 0 <= nj && nj < W) {
                    if(visit[ni][nj] == 0){
                        visit[ni][nj] = 1;
                        if(rectangle[ni][nj] == 1){
                            queue.offerLast(new Position(ni, nj));
                        }
                    }
                }
            }
        }
    }

}

