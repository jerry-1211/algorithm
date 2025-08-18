import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N ; 

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] distance = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] city = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;
        int count = distance[N-2];
        int mn = city[N-2];
        
        for(int i = N-3; i >= 0; i--){
            
            if(city[i+1] >= city[i]){
                mn = city[i];
                count += distance[i]; 
            }else{
                result += (count * mn);
                mn = city[i];
                count = distance[i];
            }
        }

        result += (mn * count);
        System.out.println(result);
        
        
    }
}