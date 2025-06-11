import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[] di = {1, 0, -1, 0};
        int[] dj = {0, 1, 0, -1};

        int i = 0, j = 0, k = 0;
        int cnt = N * N;


        int[][] graph = new int[N][N];
        graph[0][0] = cnt;


        while(cnt>0){
            int ni = i + di[k];
            int nj = j + dj[k];

            if (0 <= ni && ni < N && 0 <= nj && nj < N && graph[ni][nj] == 0) {
                graph[ni][nj] = --cnt;
                i = ni; j = nj;
                if(cnt == 1){
                    cnt--;
                }
            }else{
                k = (k + 1) % 4;
            }
        }


        int x = 0, y = 0;
        for (int l = 0; l < N; l++) {
            for (int m = 0; m < N; m++) {
                System.out.print(graph[l][m] + " ");
                if(graph[l][m] == target){
                    x = l+1; y = m+1;
                }
            }
            System.out.println();
        }

        System.out.println(x + " " + y );

    }
}


