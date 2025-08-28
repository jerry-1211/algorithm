import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int firstRate = calculateRate(X,Y);
        
        int left = 0;
        int right = 1_000_000_000;
        int answer = -1;
        
        if(calculateRate(X,Y) >= 99){
            System.out.println(answer);        
            return;
        }
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(calculateRate(X + mid, Y + mid) > firstRate){
                answer = mid;
                right = mid -1; 
            }else{
                left = mid + 1;
            }
        }
        
        System.out.println(answer);        
    }

    public static int calculateRate(int x, int y){
        return (int) ((long) y * 100 / x ) ;
    }

}