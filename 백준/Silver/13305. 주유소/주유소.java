import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N ; 

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distance = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] city = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        long mn = city[0];
        long result = distance[0] * mn;
        

        for(int i = 1 ; i < N-1 ; i++){
            if(city[i] < mn){
                mn = city[i];
            }
            result += (distance[i] * mn);
        }
        
        System.out.println(result);
    }
}