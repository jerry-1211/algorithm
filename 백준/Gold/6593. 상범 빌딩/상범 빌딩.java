import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int L,R,C;
    static char[][][] array;
    static int[][] direction = {{0,1,0},{1,0,0},{0,-1,0},{-1,0,0},{0,0,-1},{0,0,1}};
    static int[][][] visited;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken()); 
            R = Integer.parseInt(st.nextToken()); 
            C = Integer.parseInt(st.nextToken()); 
            
            if(L == 0 && R == 0 && C == 0){
                break;
            }

            array = new char[L][R][C];
            visited = new int[L][R][C];

            initVisited();
            
            for(int l = 0; l < L; l++){
                for(int r = 0; r < R; r++){
                    String S = br.readLine();
                    for(int c = 0; c < C; c++){
                        array[l][r][c] = S.charAt(c);
                    }
                }
                br.readLine();
            }


            int[] goal = new int[3]; 
            for(int l = 0; l < L; l++){
                for(int r = 0; r < R; r++){
                    for(int c = 0; c < C; c++){
                        if(array[l][r][c] == 'E'){
                            goal[0] = l;
                            goal[1] = r;
                            goal[2] = c;
                        }
                    }
                }
            }

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            
            for(int l = 0; l < L; l++){
                for(int r = 0; r < R; r++){
                    for(int c = 0; c < C; c++){
                        if(checkStart(l,r,c)){
                            queue.offer(new int[]{l,r,c});
                        }
                    }
                }
            }

        

            boolean flag = false;
            int[] q = queue.peek();
            visited[q[0]][q[1]][q[2]] = 0;
            
            
            while(!queue.isEmpty() && flag == false){
                q = queue.poll();            
                
                for(int k = 0; k < 6; k++){
                    int ni =  q[0] + direction[k][0];
                    int nj =  q[1] + direction[k][1];
                    int nv =  q[2] + direction[k][2];
                    if(0 <= ni && ni < L && 0 <= nj && nj < R && 0 <= nv && nv < C){
                        if(visited[ni][nj][nv] == -1 && array[ni][nj][nv] == '.'){
                            queue.offer(new int[]{ni,nj,nv});
                             visited[ni][nj][nv] = visited[q[0]][q[1]][q[2]] + 1;
                        }else if(visited[ni][nj][nv] == -1 && array[ni][nj][nv] == 'E'){
                            flag = true;
                            visited[ni][nj][nv] = visited[q[0]][q[1]][q[2]] + 1;
                            break;
                        }
                    }   
                }
            }

            int result = visited[goal[0]][goal[1]][goal[2]];
            System.out.println(result != -1  ? "Escaped in "+ result + " minute(s)." : "Trapped!");
        }   
    }


    public static boolean checkStart(int l, int r,int c){
        if(array[l][r][c] == 'S'){
            return true;
        }
        return false;
    }
    

    public static void initVisited(){
        for(int l = 0; l < L; l++){
            for(int r = 0; r < R; r++){
                for(int c = 0; c < C; c++){
                    visited[l][r][c] = -1;
                }
            }
        }
    }
    
}