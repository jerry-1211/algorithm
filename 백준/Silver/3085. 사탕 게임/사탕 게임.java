import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] direction = {{0, 1}, {1, 0}};
    static String[][] bomb;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        N = Integer.parseInt(br.readLine());
        bomb = new String[N][N];

        for (int i = 0; i < N; i++) {
            bomb[i] = br.readLine().split("");
        }


        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 2; k++) {



                    int ni = i + direction[k][0];
                    int nj = j + direction[k][1];

                    if (ni < N && nj < N) {
                        String[][] tempBomb = new String[N][N];
                        deepCopy(tempBomb);
                        String temp = tempBomb[i][j];
                        tempBomb[i][j] = tempBomb[ni][nj];
                        tempBomb[ni][nj] = temp;

                        result = Math.max(result,checkMaxCandy(tempBomb));
                    }


                }
            }
        }

        System.out.println(result);
    }

    public static int checkMaxCandy(String[][] tempBomb) {

        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if(tempBomb[i][j].equals(tempBomb[i][j-1])){
                    count++;
                }else{
                    maxCount = Math.max(maxCount, count);
                    count = 1;
                }
            }
            maxCount = Math.max(maxCount, count);
        }


        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                if(tempBomb[i][j].equals(tempBomb[i-1][j])){
                    count++;
                }else{
                    maxCount = Math.max(maxCount, count);
                    count = 1;
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }




    public static void deepCopy(String[][] tempBomb){
        for (int i = 0; i < N; i++) {
            tempBomb[i] = bomb[i].clone();
        }
    }

}

