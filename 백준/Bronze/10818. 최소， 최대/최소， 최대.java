import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int n = Integer.parseInt(br.readLine());

        String[] tmp = br.readLine().split(" ");
        int[] arr = new int[tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }

        int mx = -1000001;
        int mn =  1000001;

        for (int x : arr) {
            if(mx < x) {
                mx = x;
            }
            if(mn > x){
                mn = x;
            }
        }

        System.out.println(mn + " "  + mx);

    }
}
