import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N ; 
    static int M ; 
    static boolean[] visit;
    static ArrayList<Integer>[] array;
    static boolean result = false;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        array = new ArrayList[N];
        for(int i = 0 ; i < N; i++){
            array[i] = new ArrayList<>();
        }

        visit = new boolean[N];

        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            array[x].add(y);
            array[y].add(x);
        }

        for(int n = 0; n < N; n++){
            dfs(n,1);
        }

        if(result){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static void dfs(int n, int count){

        if(count == 5){
            result = true;
            return ;
        }

        if (result) return;
        
        visit[n] = true;
        
        for(int k = 0; k < array[n].size(); k++){
            int next = array[n].get(k);
            if(visit[next] == false){
                dfs(next,count+1);       
            }
        }
        
        visit[n] = false;
    }

}