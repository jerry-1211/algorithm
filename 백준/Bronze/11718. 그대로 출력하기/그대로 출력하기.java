import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        while(true){
            if(br.ready()){
                System.out.println(br.readLine());
                continue;
            }
            break;
        }
    }
}


