import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N; 
    static int M;
    static int[][] array;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N][M];

        for(int i = 0; i < N; i++){
            String[] tmpInput = br.readLine().split("");
            for(int j = 0; j < M; j++){
                array[i][j] = Integer.parseInt(tmpInput[j]);
            }
        }

        int squareSize = Math.min(N,M);
        int result = 0;

        for(int T = 1; T <= squareSize; T++){
            for(int i = 0; i < N-T+1 ; i++){
                for(int j = 0; j < M-T+1 ; j++){
                    if(checkResult(i,j,T)){
                        result = T * T;
                        break;
                    }
                }
            }
        }
        
        System.out.println(result);
        
    }
    

    public static boolean checkResult(int i, int j, int T){
        int ax1 = array[i][j];
        int ax2 = array[i+T-1][j];
        int ax3 = array[i+T-1][j+T-1];
        int ax4 = array[i][j+T-1];

        if(ax1==ax2 && ax2==ax3 && ax3==ax4){
            return true;
        }
        return false;
    }


    
}