import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] direction = {{0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, 0}, {1, -1}, {1, 1}};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;


        while(true){
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());

            if (checkLastInput(W, H)) break;

            int[][] rectangle = new int[H][W];
            int[][] visit = new int[H][W];
            makeRectangle(H, br, W, rectangle);

            int result = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if(visit[i][j] == 0 && rectangle[i][j] == 1){
                        bfs(rectangle, visit, i, j, H, W);
                        result += 1;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void bfs(int[][] rectangle, int[][] visit, int i, int j, int H, int W) {
        visit[i][j] = 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offerFirst(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] value = queue.removeFirst();
            for (int k = 0; k < 8; k++) {
                int ni = value[0] + direction[k][0];
                int nj = value[1] + direction[k][1];

                if (0 <= ni && ni < H && 0 <= nj && nj < W) {
                    if(visit[ni][nj] == 0){
                        visit[ni][nj] = 1;
                        if(rectangle[ni][nj] == 1){
                            queue.offerLast(new int[]{ni, nj});
                        }
                    }
                }
            }
        }


    }
    
    private static void makeRectangle(int H, BufferedReader br, int W, int[][] rectangle) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                rectangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static boolean checkLastInput(int W, int H) {
        return W == 0 && H == 0;
    }
}

