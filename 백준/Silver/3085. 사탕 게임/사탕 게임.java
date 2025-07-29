import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static String[][] array;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        array = new String[N][N];

        for (int i = 0; i < N; i++) {
            String[] tmpArray = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                array[i][j] = tmpArray[j];
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!array[i][j].equals(array[i-1][j])){

                    String[][] tmpClone = deepCopy();

                    String tmp = tmpClone[i-1][j];
                    tmpClone[i-1][j] = tmpClone[i][j];
                    tmpClone[i][j] = tmp;

                    result = Math.max(checkBomboni(tmpClone), result);
                }
            }
        }

        for (int j = 1; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if(!array[i][j].equals(array[i][j-1])){

                    String[][] tmpClone = deepCopy();

                    String tmp = tmpClone[i][j-1];
                    tmpClone[i][j-1] = tmpClone[i][j];
                    tmpClone[i][j] = tmp;

                    result = Math.max(checkBomboni(tmpClone), result);
                }
            }
        }

        System.out.println(result);

    }


    static int checkBomboni(String[][] array){
        int mx = 0;

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (array[i][j].equals(array[i][j-1])) {
                    count++;
                } else {
                    mx = Math.max(mx, count);
                    count = 1;
                }
            }
            mx = Math.max(mx, count);
        }

        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (array[i][j].equals(array[i-1][j])) {
                    count++;
                } else {
                    mx = Math.max(mx, count);
                    count = 1;
                }
            }
            mx = Math.max(mx, count);
        }

        return mx;
    }



    static String[][] deepCopy(){
        String[][] copyArray = new String[N][N];
        for (int i = 0; i < N; i++) {
            copyArray[i] = array[i].clone();
        }
        return copyArray;
    }


}






