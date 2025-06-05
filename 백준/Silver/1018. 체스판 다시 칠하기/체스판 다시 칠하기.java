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

        char[][] chess = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < (N - 8) + 1; i++) {
            for (int j = 0; j < (M - 8) + 1; j++) {

                char firstColor;
                for (int q = 0; q <2; q++) {
                    int count = 0;
                    if(q==0){
                        firstColor = 'B';
                    }else{
                        firstColor = 'W';
                    }

                    for (int k = i; k < i + 8; k++) {
                        for (int l = j; l < j + 8; l++) {
                            if((k-i)%2==0 && (l-j)%2==0 || (k-i)%2==1 && (l-j)%2==1){
                                if (chess[k][l] != firstColor){
                                    count += 1;
                                }
                            }else{
                                if (chess[k][l] == firstColor){
                                    count += 1;
                                }
                            }
                        }
                    }
                    array.add(count);
                }

            }
        }

        System.out.println(array.stream().min(Integer::compareTo).get());

    }
}


