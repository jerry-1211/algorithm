import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int result = 0 ;
        for(int i = 0; i < N; i++){
            String name = br.readLine();
            if(!"ENTER".equals(name)){
                set.add(name);    
            }else{
                result += set.size();
                set.clear();
            }
        }

        result += set.size();
        System.out.println(result);
        
    }
}