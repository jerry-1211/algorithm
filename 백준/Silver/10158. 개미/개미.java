import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        int resultX = (t % (w*2) + x) % (w*2);
        int resultY = (t % (h*2) + y) % (h*2);

        if(resultX > w){
             resultX = 2*w - resultX;    
        }

        if(resultY > h){
             resultY = 2*h - resultY;    
        }

        System.out.println(resultX + " " + resultY);
    }
}