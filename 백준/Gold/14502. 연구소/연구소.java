import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N,M;
    static int[][] room;
    static int[][] cloneRoom;
    static ArrayList<int[]> cleanZone;
    static ArrayList<int[][]> newWallList;
    static int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
    static ArrayDeque<int[]> birusList; 
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        room = new int[N][M];
        cleanZone = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                int value = Integer.parseInt(st.nextToken());
                room[i][j] = value;
                if(value == 0){
                    cleanZone.add(new int[]{i,j});
                }
            }
        }

        
        newWallList = new ArrayList<>();
        combination(0,0, new int[3][2]);

        
        int result = 0;
        for(int[][] newWall : newWallList){
            cloneArray();
            birusList = new ArrayDeque<>();
            findBirus();
            
            for(int[] wall : newWall){
                int x = wall[0];
                int y = wall[1];
                cloneRoom[x][y] = 1;
            }    
            result = Math.max(result, bfs());
        } 
        
        System.out.println(result);


    }

    public static int bfs(){
        while(!birusList.isEmpty()){
            int[] zone = birusList.poll();
            for(int k = 0; k < 4; k++){
                int ni =  zone[0] + direction[k][0];
                int nj =  zone[1] + direction[k][1];

                if(0<=ni && ni<N && 0<=nj && nj<M){
                    if(cloneRoom[ni][nj] == 0){
                        cloneRoom[ni][nj] = 2;
                        birusList.offer(new int[]{ni, nj});
                    }
                }
            }
        }

        return countSafeZone();
    }

    
    public static void cloneArray(){
        cloneRoom = new int[N][M];
        for(int i = 0; i < room.length; i++){
            cloneRoom[i] = room[i].clone();
        }
    }

    
    public static int countSafeZone(){
        int count = 0 ;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(cloneRoom[i][j] == 0){
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static void findBirus(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(room[i][j] == 2){
                    birusList.offer(new int[]{i,j});
                }
            }
        }
    }    


    public static void combination(int n, int index, int[][] newWall){
        if(n >= 3){
            int[][] copy = new int[3][2];
            for(int i = 0; i < 3; i++){
                copy[i][0] = newWall[i][0];
                copy[i][1] = newWall[i][1];
            }
            newWallList.add(copy);
            return; 
        }

        for(int i = index; i< cleanZone.size(); i++){
            newWall[n][0] = cleanZone.get(i)[0];
            newWall[n][1] = cleanZone.get(i)[1];
            combination(n + 1, i + 1, newWall);
        }
    }
}