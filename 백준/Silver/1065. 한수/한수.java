import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<String> result;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(br.readLine());
        int count = 0;


        if (N >= 100 ){
            for (int i = 100; i<= N; i++) {
                int hundreds = i/100;
                int tens = (i%100) / 10;
                int ones = i % 10;

                if(tens-ones == hundreds-tens){
                    count++;
                }
            }
            count += 99;
        }else{
            count = N;
        }



        System.out.println(count);



    }
}


