import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int x1,y1,x2,y2;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

        
            int N = Integer.parseInt(br.readLine());
            int result = 0;
    
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                double cr = Double.parseDouble(st.nextToken());
    
                if(cr >calculateLength(cx,cy,x1,y1) && cr >calculateLength(cx,cy,x2,y2)){
                    continue;
                }else if(cr >calculateLength(cx,cy,x1,y1) || cr >calculateLength(cx,cy,x2,y2)){
                    result += 1;
                }
            }
    
            System.out.println(result);
        }
    }

    public static double calculateLength(int cx,int cy,int x,int y){
        int X = cx-x;
        int Y = cy-y;
        return Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
    }

}