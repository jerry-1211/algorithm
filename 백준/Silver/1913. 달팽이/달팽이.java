import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int cnt = N * N;
        int target = Integer.parseInt(br.readLine());

        int[] di = {1, 0, -1, 0};
        int[] dj = {0, 1, 0, -1};

        int[][] graph = new int[N][N];
        graph[0][0] = cnt;

        int i = 0;
        int j = 0;
        int k = 0;

        while(true){
            int ni = i + di[k];
            int nj = j + dj[k];

            if (0 <= ni && ni < N && 0 <= nj && nj < N) {
                if(graph[ni][nj] == 0){
                    cnt--;
                    graph[ni][nj] = cnt;

                    i = ni;
                    j = nj;
                }else if(cnt == 1){
                    cnt--;

                }else{
                    k++;
                }
            }else{
                k++;
            }

            k %= 4;


            if(cnt==0){
                break;
            }
        }



        int x = 0;
        int y = 0;
        for (int l = 0; l < N; l++) {
            for (int m = 0; m < N; m++) {
                System.out.print(graph[l][m] + " ");
                if(graph[l][m] == target){
                    x = l+1;
                    y = m+1;
                }
            }
            System.out.println();
        }

        System.out.println(x + " " + y );

    }
}


