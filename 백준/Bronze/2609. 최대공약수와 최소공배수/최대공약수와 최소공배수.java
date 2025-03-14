import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] tmp =  br.readLine().split(" ");
        int x = Integer.parseInt(tmp[0]);
        int y = Integer.parseInt(tmp[1]);

        System.out.println(gcd(x,y));
        System.out.println(lcm(x,y));
    }

    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static int lcm(int x, int y){

        return x*y/gcd(x,y);
    }
}
