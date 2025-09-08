import java.util.*;
import java.lang.*;
import java.io.*;

// check 2번 (범위 체크, 옆에 돌 유무 체크)
class Main {
    static int[][] chess = new int[8][8];
    static int[] kingPosition, pawnPosition; 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        putChess(king, "K");
        
        String pawn = st.nextToken();
        putChess(pawn, "P");
        
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String next = br.readLine();
            moveToNext(next);
        }

        char K1 = (char) (kingPosition[0] + '1');
        char K2 = (char) (kingPosition[1] + 'A');

        char P1 = (char) (pawnPosition[0] + '1');
        char P2 = (char) (pawnPosition[1] + 'A');
        
        System.out.println(K2 + "" + K1);
        System.out.println(P2 + "" + P1);
    }

    public static void moveToNext(String next){
        int[] nextKingPostion = kingPosition.clone();
        
        if("R".equals(next)){
            nextKingPostion[1] = kingPosition[1] + 1;  
        }else if("L".equals(next)){
            nextKingPostion[1] = kingPosition[1] - 1;  
        }else if("B".equals(next)){
            nextKingPostion[0] = kingPosition[0] - 1;  
        }else if("T".equals(next)){
            nextKingPostion[0] = kingPosition[0] + 1;  
        }else if("RT".equals(next)){
            nextKingPostion[0] = kingPosition[0] + 1;  
            nextKingPostion[1] = kingPosition[1] + 1;  
        }else if("LT".equals(next)){
            nextKingPostion[0] = kingPosition[0] + 1;  
            nextKingPostion[1] = kingPosition[1] - 1;  
        }else if("RB".equals(next)){
            nextKingPostion[0] = kingPosition[0] - 1;  
            nextKingPostion[1] = kingPosition[1] + 1;  
        }else if("LB".equals(next)){
            nextKingPostion[0] = kingPosition[0] - 1;  
            nextKingPostion[1] = kingPosition[1] - 1;  
        }

        if(nextKingPostion[0] == pawnPosition[0] && nextKingPostion[1] == pawnPosition[1]){
            int[] nextPawn = pawnPosition.clone();
            nextPawn[0] = pawnPosition[0] + (nextKingPostion[0] - kingPosition[0]);
            nextPawn[1] = pawnPosition[1] + (nextKingPostion[1] - kingPosition[1]);

            if(0 <= nextPawn[0] && nextPawn[0] < 8 && 0 <= nextPawn[1] && nextPawn[1] < 8){
                kingPosition[0] = pawnPosition[0];
                kingPosition[1] = pawnPosition[1];
                pawnPosition[0] = nextPawn[0];
                pawnPosition[1] = nextPawn[1];
            }   
            
            return;
        }

        if(0 <= nextKingPostion[0] && nextKingPostion[0] < 8 && 0 <= nextKingPostion[1] && nextKingPostion[1] < 8){
            kingPosition[0] = nextKingPostion[0];
            kingPosition[1] = nextKingPostion[1];
        }
    }

    public static void putChess(String location, String status){
        int y = (int) location.charAt(0) - 'A';
        int x = (int) location.charAt(1) - '1';
        
        if("K".equals(status)){    
            kingPosition = new int[] {x,y};
        }else{
            pawnPosition = new int[] {x,y};
        }
    }
}