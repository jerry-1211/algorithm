import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 1; i <= a; i++) {
            if(a%i == 0){
                list.add(i);
            }
        }

        if(list.size() < b){
            System.out.println(0);
        }else{
            System.out.println(list.get(b-1));
        }

    }
}
