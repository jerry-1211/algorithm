import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());

        long firstRate = calculateRate(X,Y);
        
        long left = 0L;
        long right = 1_000_000_000L;
        int answer = -1;
        
        if(calculateRate(X, Y) >= 99){
            System.out.println(answer);        
            return;
        }
        
        while(left <= right){
            long mid = left + (right - left) / 2;
            
            if(calculateRate(X + mid, Y + mid) > firstRate){
                answer = (int) mid;
                right = mid -1; 
            }else{
                left = mid + 1;
            }
        }
        
        System.out.println(answer);        
    }

    public static int calculateRate(long x, long y){
        return (int) (y * 100 / x ) ;
    }

}