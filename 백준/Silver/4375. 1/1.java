import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            
            if(input == null) break;
            int N = Integer.parseInt(input);

            
            int count = 1;
            int remainder = 1;
            
            if(N == 1){
                System.out.println(count); 
                continue;
            }
            
            while(remainder != 0){    
                remainder = (remainder * 10 + 1) % N;
                count += 1;
            }

            System.out.println(count); 
        }
    }
}