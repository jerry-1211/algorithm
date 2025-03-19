import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        Long num = Long.parseLong(br.readLine());

        long total = 0 ;
        long cnt = 1 ;

        while(total + cnt <= num){
            total += cnt ;
            cnt ++ ;
        }

        System.out.println(cnt-1);


    }
}
