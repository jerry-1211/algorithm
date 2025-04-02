import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String str = br.readLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversedStr = stringBuilder.reverse().toString();

        if (str.equals(reversedStr)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}